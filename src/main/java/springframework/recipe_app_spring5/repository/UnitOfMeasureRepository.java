package springframework.recipe_app_spring5.repository;

import org.springframework.data.repository.CrudRepository;
import springframework.recipe_app_spring5.domain.UnitOfMeasure;

import java.util.Optional;

public interface UnitOfMeasureRepository extends CrudRepository<UnitOfMeasure, Long> {

    Optional<UnitOfMeasure> findByDescription(String description);

}
