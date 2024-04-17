package com.example.demo.service;

import java.time.LocalDate;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.elasticsearch.core.ElasticsearchRestTemplate;
import org.springframework.data.elasticsearch.core.IndexOperations;
import org.springframework.data.elasticsearch.core.mapping.IndexCoordinates;
import org.springframework.stereotype.Service;
import com.example.demo.repo.ACMLoanElasticSearchRepository;

@Service
public class ACMLoanServiceImpl implements ACMLoanService {

	@Autowired
	private ACMLoanElasticSearchRepository rep;

	@Autowired
	private ElasticsearchRestTemplate elasticsearchRestTemplate;

	

	
	
}
