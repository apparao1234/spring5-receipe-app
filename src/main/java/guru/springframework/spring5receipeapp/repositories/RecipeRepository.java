package guru.springframework.spring5receipeapp.repositories;

import org.springframework.data.repository.CrudRepository;

import guru.springframework.spring5receipeapp.domain.Recipe;

public interface RecipeRepository extends CrudRepository<Recipe,Long> {

}
