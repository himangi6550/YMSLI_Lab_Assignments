package com.q1;

public class Merchandise {
	private String itemCode;
	private Integer quantity;
	private Double unitPrice;

	public Merchandise(String iteamCode, Integer quantity, Double unitPrice) {
		super();
		this.itemCode = iteamCode;
		this.quantity = quantity;
		this.unitPrice = unitPrice;
	}

	public String getItemCode() {
		return itemCode;
	}

	public void setIteamCode(String itemCode) {
		this.itemCode = itemCode;
	}

	public Integer getQuantity() {
		return quantity;
	}

	public void setQuantity(Integer quantity) {
		this.quantity = quantity;
	}

	public Double getUnitPrice() {
		return unitPrice;
	}

	public void setUnitPrice(Double unitPrice) {
		this.unitPrice = unitPrice;
	}

	public void print() {
		System.out.println("Item Code: " + itemCode + " Quantity: " + quantity + " Unit Price: " + unitPrice);
	}

}
