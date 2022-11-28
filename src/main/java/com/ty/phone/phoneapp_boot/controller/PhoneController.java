package com.ty.phone.phoneapp_boot.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.ty.phone.phoneapp_boot.dao.PhoneDao;
import com.ty.phone.phoneapp_boot.dto.Phone;


@RestController
public class PhoneController {

	@Autowired
	PhoneDao dao;
	@PostMapping("save")
	public Phone savePhone(@RequestBody Phone phone) {
		return dao.savePhone(phone);
	}
	
	@GetMapping("get/{id}")
	public Phone getPhone(@PathVariable int id)
	{
		return dao.getById(id);
	}
	
	@DeleteMapping("delete")
	public boolean deletePhone(@RequestParam int  id)
	{
		return dao.deletePhone(id);
	}
	
}
