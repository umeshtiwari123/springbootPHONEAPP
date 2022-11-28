package com.ty.phone.phoneapp_boot.dto;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.GenerationType;

@Entity
public class Phone {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;
	private String brand;
	private int price;
	private String color;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	@Override
	public String toString() {
		return "Phone [id=" + id + ", brand=" + brand + ", price=" + price + ", color=" + color + "]";
	}
	
	
}
