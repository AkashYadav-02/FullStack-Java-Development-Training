package com.aurionpro.test;

import java.util.List;

import com.aurionpro.model.Biscuit;
import com.aurionpro.model.Hat;
import com.aurionpro.model.HatAdapter;
import com.aurionpro.model.Iitem;
import com.aurionpro.model.ShoppingCart;
import com.aurionpro.model.SoftDrink;

public class AdapterTest {

	public static void main(String[] args) {
		ShoppingCart cart = new ShoppingCart();
		Biscuit biscuit = new Biscuit();
		SoftDrink sft = new SoftDrink();
		cart.itemAdd(sft);
		cart.itemAdd(biscuit);

		Hat hat = new Hat("new hart", "new red hat", 200, 10);
		HatAdapter hdp = new HatAdapter(hat);

		cart.setCartItem(hdp);

//	  System.out.println(cart.getTotalPrice());
		List<Iitem> allItem = cart.getAllItem();
		 allItem.forEach(val->System.out.println(val.getItemName()));
		
	  
	

	}
}
