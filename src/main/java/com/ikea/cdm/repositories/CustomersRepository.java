package com.ikea.cdm.repositories;

import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;

import com.ikea.cdm.models.Customers;

public interface CustomersRepository extends MongoRepository<Customers, String> {
	Customers findBy_id(ObjectId _id);
}
