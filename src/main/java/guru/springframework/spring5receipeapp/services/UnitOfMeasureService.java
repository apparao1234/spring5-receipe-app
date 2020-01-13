package guru.springframework.spring5receipeapp.services;

import java.util.Set;

import guru.springframework.spring5receipeapp.commands.UnitOfMeasureCommand;

/**
 * Created by jt on 6/28/17.
 */
public interface UnitOfMeasureService {

    Set<UnitOfMeasureCommand> listAllUoms();
}
