package springframework.recipe_app_spring5.service;

import springframework.recipe_app_spring5.commands.IngredientCommand;
import springframework.recipe_app_spring5.domain.Ingredient;

public interface IngredientService {
    IngredientCommand findByRecipeIdAndIngredientId(Long recipeId, Long ingredient);

    IngredientCommand saveIngredientCommand(IngredientCommand command);
}
