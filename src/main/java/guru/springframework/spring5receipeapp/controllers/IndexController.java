package guru.springframework.spring5receipeapp.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import guru.springframework.spring5receipeapp.services.RecipeService;

@Controller
public class IndexController { 
	private final RecipeService recipeService;
	
	
	
//	private CategoryRepository categoryRepository;
//	private UnitOfMeasureRepository unitOfMeasureRepository;
	
	public IndexController(RecipeService recipeService) {
		this.recipeService = recipeService;
	}

	
//	public IndexController(CategoryRepository categoryRepository, UnitOfMeasureRepository unitOfMeasureRepository) {
//		this.categoryRepository = categoryRepository;
//		this.unitOfMeasureRepository = unitOfMeasureRepository;
//	}



//	@RequestMapping({"","/","/index"})	
//	public String getIndexPage() {
//		Optional<Category>  categoryOptional = categoryRepository.findByDescription("American");
//		Optional<UnitOfMeasure>  UnitOfMeasureOptional =unitOfMeasureRepository.findByDescription("Teaspoon");
//		
//		System.out.println("categoryOptional id  is " +categoryOptional.get().getId());
//		System.out.println("UnitOfMeasureOptional id is " +UnitOfMeasureOptional.get().getId());		
//		return "index";
//	}
	
	
	@RequestMapping({"","/","/index"})	
	public String getIndexPage(Model model) {
		// log.debug("Getting Index page");
		model.addAttribute("recipes",recipeService.getRecipes());		
		return "index";
	} 
}