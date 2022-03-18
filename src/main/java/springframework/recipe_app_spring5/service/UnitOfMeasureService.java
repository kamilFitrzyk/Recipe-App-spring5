package springframework.recipe_app_spring5.service;

import springframework.recipe_app_spring5.commands.UnitOfMeasureCommand;

import java.util.Set;

public interface UnitOfMeasureService {

    Set<UnitOfMeasureCommand> listAllUoms();
}
