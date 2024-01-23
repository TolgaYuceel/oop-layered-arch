package dataAccess.concretes;

import java.util.List;

import dataAccess.abstracts.CourseDao;
import dataAccess.databases.Database;
import entities.Course;

public class CourseJdbcDao implements CourseDao {

	
	private final Database database = new Database();
	
	@Override
	public void add(Course course) {
		database.courses.add(course);
		System.out.println("Course Added With Jdbc: " + course.getCourseName());
	}

	@Override
	public void delete(Course course) {
		database.courses.remove(course);
		System.out.println("Course Deleted With Jdbc: " + course.getCourseName());
	}

	@Override
	public List<Course> getAll() {
		return database.courses;
	}

	@Override
	public Course getByName(String name) {
		return database.courses.stream().filter(course -> course.getCourseName().equals(name)).findFirst().orElse(null);
	}

}
