package springframework.recipe_app_spring5.repository;

import org.springframework.data.repository.CrudRepository;
import springframework.recipe_app_spring5.domain.Category;

import java.util.Optional;

public interface CategoryRepository extends CrudRepository<Category, Long> {

    Optional<Category> findByDescription(String description);
}
