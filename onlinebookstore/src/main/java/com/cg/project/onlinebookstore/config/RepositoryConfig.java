package com.cg.project.onlinebookstore.config;

import javax.persistence.EntityManager;

import org.springframework.context.annotation.Configuration;
import org.springframework.data.rest.core.config.RepositoryRestConfiguration;
import org.springframework.data.rest.webmvc.config.RepositoryRestConfigurer;


import javax.persistence.metamodel.Type;



@Configuration
public class RepositoryConfig implements RepositoryRestConfigurer{
	
	private EntityManager entityManger;
	
	@Override
	public void configureRepositoryRestConfiguration(RepositoryRestConfiguration config) {

		config.exposeIdsFor(entityManger.getMetamodel().getEntities().stream()
				.map(Type::getJavaType)
				.toArray(Class[]::new));
	}

}
