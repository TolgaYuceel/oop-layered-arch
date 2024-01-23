package dataAccess.abstracts;

import java.util.List;

import entities.Course;

public interface CourseDao {
	void add(Course course);
	void delete(Course course);
	
	List<Course> getAll();
	Course getByName(String name);
}
