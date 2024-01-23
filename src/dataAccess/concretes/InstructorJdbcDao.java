package dataAccess.concretes;

import java.util.List;

import dataAccess.abstracts.InstructorDao;
import dataAccess.databases.Database;
import entities.Instructor;

public class InstructorJdbcDao implements InstructorDao {
	
	private final Database database = new Database();

	@Override
	public void add(Instructor instructor) {
		database.instructors.add(instructor);
		System.out.println("Instructor added with Jdbc: " + instructor.getName());
	}

	@Override
	public void delete(Instructor instructor) {
		database.instructors.remove(instructor);
		System.out.println("Instructor deleted with Jdbc: " + instructor.getName());
		
	}

	@Override
	public List<Instructor> getAll() {
		return database.instructors;
	}

	@Override
	public Instructor getByName(String name) {
		return database.instructors.stream().filter(instructor -> instructor.getName().equals(name)).findFirst().orElse(null);
	}

}
