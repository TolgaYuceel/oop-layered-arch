package dataAccess.databases;

import java.util.ArrayList;
import java.util.List;

import entities.Category;
import entities.Course;
import entities.Instructor;

public class Database {
	public final List<Category> categories = new ArrayList<Category>();
	public final List<Course> courses = new ArrayList<Course>();
	public final List<Instructor> instructors = new ArrayList<Instructor>();
}
