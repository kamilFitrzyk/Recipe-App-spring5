package springframework.recipe_app_spring5.service;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;
import springframework.recipe_app_spring5.converters.RecipeCommandToRecipe;
import springframework.recipe_app_spring5.converters.RecipeToRecipeCommand;
import springframework.recipe_app_spring5.domain.Recipe;
import springframework.recipe_app_spring5.repository.RecipeRepository;

import java.util.HashSet;
import java.util.Set;

import static org.junit.jupiter.api.Assertions.*;

class RecipeServiceImplTest {

    RecipeServiceImpl recipeService;

    @Mock
    RecipeRepository recipeRepository;

    @Mock
    RecipeCommandToRecipe recipeCommandToRecipe;

    @Mock
    RecipeToRecipeCommand recipeToRecipeCommand;

    @BeforeEach
    void setUp() {
        MockitoAnnotations.initMocks(this);

        recipeService = new RecipeServiceImpl(recipeRepository, recipeCommandToRecipe, recipeToRecipeCommand);
    }

    @Test
    void getRecipes() throws Exception{

        Recipe recipe = new Recipe();
        HashSet recipesData = new HashSet();
        recipesData.add(recipe);

        Mockito.when(recipeService.getRecipes()).thenReturn(recipesData);

        Set<Recipe> recipes = recipeService.getRecipes();

        assertEquals(recipesData.size(),1);
        Mockito.verify(recipeRepository, Mockito.times(1)).findAll();
        Mockito.verify(recipeRepository, Mockito.never()).findById(Mockito.anyLong());
    }

    @Test
    void testDeleteById() throws Exception {
        Long idToDelete = Long.valueOf(2L);
        recipeService.deleteById(idToDelete);

        Mockito.verify(recipeRepository, Mockito.times(1)).deleteById(Mockito.anyLong());
    }
}