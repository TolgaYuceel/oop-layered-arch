package dataAccess.concretes;

import java.util.List;

import dataAccess.abstracts.CategoryDao;
import dataAccess.databases.Database;
import entities.Category;

public class CategoryJdbcDao implements CategoryDao {

	private final Database database = new Database();
	
	@Override
	public void add(Category category) {
		database.categories.add(category);
		System.out.println("Category Added With Jdbc: " + category.getCategoryName());
	}

	@Override
	public void delete(Category category) {
		database.categories.remove(category);
		System.out.println("Category Deleted With Jdbc " + category.getCategoryName());
		
	}

	@Override
	public List<Category> getAll() {
		return database.categories;
	}

	@Override
	public Category getByName(String name) {
		return database.categories.stream().filter(category -> category.getCategoryName().equals(name)).findFirst().orElse(null);
	}

}
