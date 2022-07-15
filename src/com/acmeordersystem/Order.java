package com.acmeordersystem;

public class Order {
	MyDate orderDate;
	double orderAmount = 0.00;
	String customer;
	String product;
	int quantity;
	// static initialization block
	static double taxRate = 0.05;

	// sets a new tax rate
	public static void setTaxRate(double newRate) {
		taxRate = newRate;
	}

	// compute tax on an amount
	public static void computeTaxOn(double anAmount) {
		System.out.println("The tax for " + anAmount + " is: " + anAmount * Order.taxRate);
	}

	// compute tax for an order object
	public double computeTax() {
		System.out.println("The tax for this order is: " + orderAmount * Order.taxRate);
		return orderAmount * Order.taxRate;
	}

	public Order(MyDate d, double amt, String c, String p, int q){
		orderDate=d;
		orderAmount=amt;
		customer=c;
		product=p;
		quantity=q;
	}

	public Order(MyDate d, double amt, String c) {
		orderDate = d;
		orderAmount = amt;
		customer = c;
		product = "Anvil";
		quantity = 1;
	}
	
	public String toString(){
		return quantity + " ea. " + product + " for " + customer; 
	}
}