package business.concretes;

import java.util.List;

import business.abstracts.InstructorService;
import dataAccess.abstracts.InstructorDao;
import entities.Instructor;

public class InstructorManager implements InstructorService {
	
	private final InstructorDao instructorDao;

    public InstructorManager(InstructorDao instructorDao) {
        this.instructorDao = instructorDao;
    }

	@Override
	public Instructor getByName(String name) {
		return instructorDao.getByName(name);
	}

	@Override
	public List<Instructor> getAll() {
		return instructorDao.getAll();
	}

	@Override
	public boolean add(Instructor instructor) {
		instructorDao.add(instructor);
        return true;
	}

	@Override
	public boolean delete(String name) {
		Instructor instructor = getByName(name);
		
        if (instructor == null) {
            System.out.println("Egitmen bulunamadı!");
            return false;
        }
        
        instructorDao.delete(instructor);
        return true;
	}

}
