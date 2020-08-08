package com.chapter10;

public class Invoice implements Payable {
	
	private double partNumber;
	private String partDescription;
	private double quantity;
	private double pricePerItem;
	
	public Invoice(double partNumber, String partDescription,
			double quantity, double pricePerItem) {
		if(quantity < 0) {
			throw new IllegalArgumentException("quantity must be > 0");
		}
		if(pricePerItem < 0.0) {
			throw new IllegalArgumentException("quantity must be > 0.0");
		}
		
		this.partNumber = partNumber;
		this.partDescription = partDescription;
		this.quantity = quantity;
		this.pricePerItem = pricePerItem;
	}

	public double getPartNumber() {
		return partNumber;
	}
	public void setPartNumber(double partNumber) {
		this.partNumber = partNumber;
	}

	
	public String getPartDescription() {
		return partDescription;
	}
	public void setPartDescription(String partDescription) {
		this.partDescription = partDescription;
	}

	
	public double getQuantity() {
		if(quantity < 0) {
			throw new IllegalArgumentException("quantity must be > 0");
		}
		return quantity;
	}
	public void setQuantity(double quantity) {
		this.quantity = quantity;
	}

	
	public double getPricePerItem() {
		return pricePerItem;
	}
	public void setPricePerItem(double pricePerItem) {
		if(pricePerItem < 0.0) {
			throw new IllegalArgumentException("quantity must be > 0.0");
		}
		this.pricePerItem = pricePerItem;
	}

	@Override
	public double getPaymentAmount() {	
		return getQuantity() * getPricePerItem();
	}


}
