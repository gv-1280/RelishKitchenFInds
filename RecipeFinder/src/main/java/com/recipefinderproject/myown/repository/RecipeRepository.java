package com.recipefinderproject.myown.repository;

import com.recipefinderproject.myown.model.Recipe;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface RecipeRepository extends MongoRepository<Recipe, String> {
}
