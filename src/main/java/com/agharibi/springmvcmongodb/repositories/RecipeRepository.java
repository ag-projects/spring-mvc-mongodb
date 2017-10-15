package com.agharibi.springmvcmongodb.repositories;

import com.agharibi.springmvcmongodb.domain.Recipe;
import org.springframework.data.repository.CrudRepository;

public interface RecipeRepository extends CrudRepository<Recipe, String> {

}
