package com.ikea.cdm.models;

import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;

/**
 * Class holds Customer entity
 *
 */
public class Customers {

	@Id
	public ObjectId _id;
	public String name;
	public String icmId;
	public String address;
	public String isFamilyMember;

	// Constructors
	public Customers() {
	}

	public Customers(ObjectId _id, String name, String custId, String address, String isFamilyMember) {
		this._id = _id;
		this.name = name;
		this.icmId = custId;
		this.address = address;
		this.isFamilyMember = isFamilyMember;
	}

	// ObjectId needs to be converted to string
	public String get_id() {
		return _id.toString();
	}

	public void set_id(ObjectId _id) {
		this._id = _id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCustId() {
		return icmId;
	}

	public void setCustId(String custId) {
		this.icmId = custId;
	}

	public String getAddress() {
		return address;
	}

	public void setAddess(String address) {
		this.address = address;
	}
	
	public String getIsFamilyMember() {
		return isFamilyMember;
	}

	public void setIsFamilyMember(String isFamilyMember) {
		this.isFamilyMember = isFamilyMember;
	}
}
