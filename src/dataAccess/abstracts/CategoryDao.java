package dataAccess.abstracts;

import java.util.List;

import entities.Category;

public interface CategoryDao {
	void add(Category category);
	void delete(Category category);
	
	List<Category> getAll();
	Category getByName(String name);
}
