package com.example.demo.config;



import org.elasticsearch.client.RestHighLevelClient;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.elasticsearch.client.ClientConfiguration;
import org.springframework.data.elasticsearch.client.RestClients;
import org.springframework.data.elasticsearch.config.AbstractElasticsearchConfiguration;
import org.springframework.data.elasticsearch.core.ElasticsearchRestTemplate;
import org.springframework.data.elasticsearch.repository.config.EnableElasticsearchRepositories;

@Configuration
@EnableElasticsearchRepositories(basePackages = "com.example.demo.repo")
@ComponentScan(basePackages = {"com.example.demo"})
public class ElasticSearchConfig extends AbstractElasticsearchConfiguration{
	@Value("${spring.data.elasticsearch.client.cluster-nodes=http://localhost:9200}")
	public String  elasticsearchUrl;
	
	@Bean
	@Override
	public RestHighLevelClient elasticsearchClient() {
		final ClientConfiguration configuration = ClientConfiguration.builder()
				.connectedTo("localhost:9200")
				.build();
		return RestClients.create(configuration).rest();
		
	}
	
	@Bean
	public ElasticsearchRestTemplate elasticsearchRestTemplate () {
		final ClientConfiguration clientConfiguration= ClientConfiguration.builder().connectedTo("localhost:9200").build();
		return new ElasticsearchRestTemplate(RestClients.create(clientConfiguration).rest());
		}
}