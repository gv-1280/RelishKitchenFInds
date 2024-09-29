package com.recipefinderproject.myown.Controller;

import com.recipefinderproject.myown.model.Recipe;
import com.recipefinderproject.myown.repository.RecipeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/recipes")
public class RecipeController {

    @Autowired
    private RecipeRepository recipeRepository;

    @GetMapping
    public List<Recipe> getAllRecipes() {
        return recipeRepository.findAll();
    }

    @PostMapping
    public Recipe createRecipe(@RequestBody Recipe recipe) {
        return recipeRepository.save(recipe);
    }
}
