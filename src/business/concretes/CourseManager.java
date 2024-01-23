package business.concretes;

import java.util.List;

import business.abstracts.CourseService;
import dataAccess.abstracts.CourseDao;
import entities.Course;

public class CourseManager implements CourseService {
	
	 private final CourseDao courseDao;
	 
	 public CourseManager(CourseDao courseDao) {
	        this.courseDao = courseDao;
	    }

	@Override
	public Course getByName(String name) {
		return courseDao.getByName(name);
	}

	@Override
	public List<Course> getAll() {
		return courseDao.getAll();
	}

	@Override
	public boolean add(Course course) {
		
		if (courseDao.getByName(course.getCourseName()) != null) {
            System.out.println("Course name already exists");
            return false;
        }
		
        if (course.getPrice() < 0) {
            System.out.println("The course name cannot be less than 0!");
            return false;
        }
        courseDao.add(course);
        return true;
	}

	@Override
	public boolean delete(String name) {
		Course course = courseDao.getByName(name);
		
        if (course == null) {
            System.out.println("Kurs mevcut degil!");
            return false;
        }
        
        courseDao.delete(course);
        return true;
	}

}
