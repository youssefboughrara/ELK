package com.example.demo.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.example.demo.dto.VoletCollectionByCollectionType;
import com.example.demo.entity.Loan;
import java.util.List;
import org.springframework.stereotype.Repository;

@Repository
public interface ACMLoanElasticSearchRepository extends JpaRepository<Loan, Long> {
	

	
}

