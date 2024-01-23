package dataAccess.abstracts;

import java.util.List;

import entities.Instructor;

public interface InstructorDao {
	void add(Instructor instructor);
	void delete(Instructor instructor);
	
	List<Instructor> getAll();
	Instructor getByName(String name);
	
}
