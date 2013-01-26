package com.aad.ws.dao;

import java.util.List;

import com.aad.ws.domain.Category;

public interface CategoryDAO {
	Category getCategory(int id);
	List<Category> getCategories();
}
