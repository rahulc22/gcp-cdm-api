package com.ikea.cdm.controller;

import java.util.List;

import javax.validation.Valid;

import org.bson.types.ObjectId;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.ikea.cdm.models.Customers;
import com.ikea.cdm.repositories.CustomersRepository;

/**
 * Class representing web controller for Customer
 *
 */
@RestController
@RequestMapping("/customers")
public class CustomerController {

	@Autowired
	private CustomersRepository repository;

	@RequestMapping(value = "/", method = RequestMethod.GET)
	public List<Customers> getAllCustomers() {
		return repository.findAll();
	}

	@RequestMapping(value = "/{id}", method = RequestMethod.GET)
	public Customers getCustomerById(@PathVariable("id") ObjectId id) {
		return repository.findBy_id(id);
	}

	@RequestMapping(value = "/{id}", method = RequestMethod.PUT)
	public void modifyCustomerById(@PathVariable("id") ObjectId id, @Valid @RequestBody Customers customers) {
		customers.set_id(id);
		repository.save(customers);
	}

	@RequestMapping(value = "/", method = RequestMethod.POST)
	public Customers createCustomer(@Valid @RequestBody Customers customers) {
		customers.set_id(ObjectId.get());
		repository.save(customers);
		return customers;
	}

	@RequestMapping(value = "/{id}", method = RequestMethod.DELETE)
	public void deleteCustomer(@PathVariable ObjectId id) {
		repository.delete(repository.findBy_id(id));
	}
}
