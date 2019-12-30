package guru.springframework.spring5receipeapp.services;


import java.util.HashSet;
import java.util.Set;

import org.springframework.stereotype.Service;

import guru.springframework.spring5receipeapp.domain.Recipe;
import guru.springframework.spring5receipeapp.repositories.RecipeRepository;

/**
 * Created by jt on 6/13/17.
 */
@Service
public class RecipeServiceImpl implements RecipeService {

    private final RecipeRepository recipeRepository;

    public RecipeServiceImpl(RecipeRepository recipeRepository) {
        this.recipeRepository = recipeRepository;
    }

    @Override
    public Set<Recipe> getRecipes() {
        Set<Recipe> recipeSet = new HashSet<>();
        recipeRepository.findAll().iterator().forEachRemaining(recipeSet::add);
        return recipeSet;
    }
}
