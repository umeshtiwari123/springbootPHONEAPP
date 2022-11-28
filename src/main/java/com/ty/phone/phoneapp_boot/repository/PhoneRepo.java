package com.ty.phone.phoneapp_boot.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ty.phone.phoneapp_boot.dto.Phone;

public interface PhoneRepo extends JpaRepository<Phone, Integer>{ 

}
