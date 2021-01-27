package ar.com.gcba.beap.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import ar.com.gcba.beap.model.CategoryValue;

@Repository
public interface CategoryValueRepository extends JpaRepository<CategoryValue, Integer> {

}
