import business.concretes.CategoryManager;
import business.concretes.CourseManager;
import business.concretes.InstructorManager;
import dataAccess.concretes.CategoryHibernateDao;
import dataAccess.concretes.CourseJdbcDao;
import dataAccess.concretes.InstructorHibernateDao;
import entities.Category;
import entities.Course;
import entities.Instructor;

public class Main {

	public static void main(String[] args) {
		CategoryManager categoryManager = new CategoryManager(new CategoryHibernateDao()); //or JdbcDao
		categoryManager.add(new Category(1, "Category 1"));
        categoryManager.add(new Category(2, "Category 2"));
        categoryManager.delete("Category 1");
        categoryManager.getAll().forEach(System.out::println);
        
        System.out.println("---------------------------------------------------------");
        
        InstructorManager instructorManager = new InstructorManager(new InstructorHibernateDao()); //or JdbcDao
        instructorManager.add(new Instructor("Tolga", "Yuceel", "abcd@mail.com", 17));
        instructorManager.add(new Instructor("Tolga2", "Yuceel", "abcde@mail.com", 17));
        instructorManager.delete("Tolga");
        instructorManager.getAll().forEach(System.out::println);
        
        System.out.println("---------------------------------------------------------");
        
        CourseManager courseManager = new CourseManager(new CourseJdbcDao()); //or HibernateDao
        Instructor instructor = new Instructor("Tolga", "Yuceel", "abcd@mail.com", 17);
        Category category = new Category(1, "category name");
        courseManager.add(new Course("Course 1", instructor, 2000, category));
        courseManager.add(new Course("Course 2", instructor, 3000, category));
        courseManager.delete("Course 1");
        courseManager.getAll().forEach(System.out::println);
        
	}

}
