package springframework.recipe_app_spring5.repository;

import org.springframework.data.repository.CrudRepository;
import springframework.recipe_app_spring5.domain.Recipe;

public interface RecipeRepository extends CrudRepository<Recipe, Long> {


}
