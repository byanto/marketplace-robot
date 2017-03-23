package com.aigootan.marketplace.model;

public class Product {
	private String m_name;
	private String m_description;
	private int m_weight;
	private int m_stock;
	private long m_price;
	
	public String getName() {
		return m_name;
	}
	public void setName(String name) {
		this.m_name = name;
	}
	public String getDescription() {
		return m_description;
	}
	public void setDescription(String description) {
		this.m_description = description;
	}
	public int getWeight() {
		return m_weight;
	}
	public void setWeight(int weight) {
		this.m_weight = weight;
	}
	public int getStock() {
		return m_stock;
	}
	public void setStock(int stock) {
		this.m_stock = stock;
	}
	public long getPrice() {
		return m_price;
	}
	public void setPrice(long price) {
		this.m_price = price;
	}
	
}
