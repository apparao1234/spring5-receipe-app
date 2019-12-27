package guru.springframework.spring5receipeapp.repositories;

import java.util.Optional;

import org.springframework.data.repository.CrudRepository;

import guru.springframework.spring5receipeapp.domain.Category;

public interface CategoryRepository extends CrudRepository<Category,Long> {
	Optional<Category>  findByDescription(String description);

}
