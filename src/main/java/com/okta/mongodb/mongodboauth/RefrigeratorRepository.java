package com.okta.mongodb.mongodboauth;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(collectionResourceRel = "fridge", path = "fridge")
public interface RefrigeratorRepository extends MongoRepository<RefrigeratorItem, String> {
}
