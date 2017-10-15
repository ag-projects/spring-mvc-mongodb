package com.agharibi.springmvcmongodb.services;

import com.agharibi.springmvcmongodb.commands.RecipeCommand;
import com.agharibi.springmvcmongodb.domain.Recipe;

import java.util.Set;

public interface RecipeService {

    Set<Recipe> getRecipes();

    Recipe findById(String id);

    RecipeCommand saveRecipeCommand(RecipeCommand command);

    RecipeCommand findCommandById(String aLong);

    void deleteById(String id);
}