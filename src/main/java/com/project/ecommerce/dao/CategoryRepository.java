package com.project.ecommerce.dao;
import com.project.ecommerce.entity.Category;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;


@RepositoryRestResource(collectionResourceRel = "category",path="category")
public interface CategoryRepository extends JpaRepository<Category,Long> {
}
