package guru.springframework.spring5receipeapp.controllers;

import java.util.Optional;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import guru.springframework.spring5receipeapp.domain.Category;
import guru.springframework.spring5receipeapp.domain.UnitOfMeasure;
import guru.springframework.spring5receipeapp.repositories.CategoryRepository;
import guru.springframework.spring5receipeapp.repositories.UnitOfMeasureRepository;

@Controller
public class IndexController {
	
	private CategoryRepository categoryRepository;
	private UnitOfMeasureRepository unitOfMeasureRepository;
	
	
	
	public IndexController(CategoryRepository categoryRepository, UnitOfMeasureRepository unitOfMeasureRepository) {
		this.categoryRepository = categoryRepository;
		this.unitOfMeasureRepository = unitOfMeasureRepository;
	}



	@RequestMapping({"","/","/index"})	
	public String getIndexPage() {
		Optional<Category>  categoryOptional = categoryRepository.findByDescription("American");
		Optional<UnitOfMeasure>  UnitOfMeasureOptional =unitOfMeasureRepository.findByDescription("Teaspoon");
		
		System.out.println("categoryOptional id  is " +categoryOptional.get().getId());
		System.out.println("UnitOfMeasureOptional id is " +UnitOfMeasureOptional.get().getId());		
		return "index";
	}

}
