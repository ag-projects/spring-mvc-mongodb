package com.agharibi.springmvcmongodb.repositories;

import com.agharibi.springmvcmongodb.domain.Category;
import org.springframework.data.repository.CrudRepository;

import java.util.Optional;

public interface CategoryRepository extends CrudRepository<Category, String> {


    Optional<Category> findByDescription(String description);
}
