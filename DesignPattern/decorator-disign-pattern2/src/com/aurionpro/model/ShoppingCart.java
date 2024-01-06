package com.aurionpro.model;

import java.util.ArrayList;
import java.util.List;

public class ShoppingCart {
//	private double totalPrice=0;
	
	private List<Iitem> cartItem;
//	private double totalPrice;

	public ShoppingCart() {
//		super();
		this.cartItem = new ArrayList();
	}
	public void  itemAdd(Iitem item) {
		cartItem.add(item);
		
	}
	public List<Iitem> getCartItem() {
		return cartItem;
	}

	public void setCartItem(Iitem cart) {
		this.cartItem.add(cart);


	}
 public  double getTotalPrice() {
	 double totalPrice=0;
	  
	  for(Iitem itm: cartItem) {
		
		 totalPrice+=itm.getItemPrice();
	  }
	 
	 return totalPrice;
 }
 
 public List<Iitem> getAllItem() {
	 return cartItem;
 }
 }
	
 


