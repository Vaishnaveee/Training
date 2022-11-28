package com.main;

public class Product {
	int id;
	String name;
	double price;
	String vendorName;

	public Product(int id, String name, double price, String vendorName) {
		super();
		this.id = id;
		this.name = name;
		this.price = price;
		this.vendorName = vendorName;
	}

	public Product() {
		super();
		// TODO Auto-generated constructor stub
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public String getVendorName() {
		return vendorName;
	}

	public void setVendorName(String vendorName) {
		this.vendorName = vendorName;
	}

	@Override
	public String toString() {
		return "Product [id=" + id + ", name=" + name + ", price=" + price + ", vendorName=" + vendorName + "]";
	}

}
