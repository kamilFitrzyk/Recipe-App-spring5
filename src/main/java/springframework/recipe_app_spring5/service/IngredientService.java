package springframework.recipe_app_spring5.service;

import springframework.recipe_app_spring5.commands.IngredientCommand;

public interface IngredientService {
    IngredientCommand findByRecipeIdAndIngredientId(Long recipeId, Long ingredient);
}
