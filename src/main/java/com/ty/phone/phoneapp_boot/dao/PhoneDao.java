package com.ty.phone.phoneapp_boot.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.ty.phone.phoneapp_boot.dto.Phone;
import com.ty.phone.phoneapp_boot.repository.PhoneRepo;

@Repository
public class PhoneDao {

	@Autowired
	PhoneRepo repo;
	
	public Phone savePhone(Phone phone) {
		return repo.save(phone);
	}
	
	public Phone getById(int id)
	{
		return repo.findById(id).get();
	}
	
	public boolean deletePhone(int id)
	{
		repo.deleteById(id);
		return true;
	}
}
