package guru.springframework.spring5receipeapp.services;



import java.util.Set;

import guru.springframework.spring5receipeapp.commands.RecipeCommand;
import guru.springframework.spring5receipeapp.domain.Recipe;

/**
 * Created by jt on 6/13/17.
 */
public interface RecipeService {

	 Set<Recipe> getRecipes();

	    Recipe findById(Long l);

	    RecipeCommand findCommandById(Long l);

	    RecipeCommand saveRecipeCommand(RecipeCommand command);

	    void deleteById(Long idToDelete);
}
