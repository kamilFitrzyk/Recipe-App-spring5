package springframework.recipe_app_spring5.service;

import springframework.recipe_app_spring5.domain.Recipe;

import java.util.Set;

public interface RecipeService {

    Set<Recipe> getRecipes();

    Recipe findById(Long l);
}
