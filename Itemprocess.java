package com.manhpack9;

import java.sql.Date;
import java.util.ArrayList;

public class Itemprocess {
	static ArrayList<Item> itemlist = new ArrayList<Item>();

	// static ArrayList<Warehouse>wlist=new ArrayList<Warehouse>();
	public static void addItem(Item it) {
		itemlist.add(it);

	}

	public static Item searchItem(int item_code) {
		for (Item val : itemlist) {
			if (val.getItemCode() == item_code)
				return val;
		}
		return null;
	}

	public static void deleteItem(int item_code) {
		for (Item val1 : itemlist) {
			if (val1.getItemCode() == item_code)
				itemlist.remove(val1);
		}
	}

	// public static void get_item(int item_code)
	// {
	// for(Item val2:itemlist)
	// {
	//
	// }
	// }
	public static void editItemName(String name, double price, String unit, Date dom, Date doe, int beg_inventory,
			int qty, int item_code) {
		Item it = searchItem(item_code);
		if (it == null)
			System.out.println("item no found ");
		else
			it.setItemName(name);
		it.setUnit(unit);
		it.setPrice(price);
		it.setDateOfManufacture(dom);
		it.setDateOfExpiry(doe);
		it.setBeginningInventory(beg_inventory);
		it.setQuantity(qty);

	}

	public static void move_items(int warehouse_id, int item_code) {
		for(Item it:itemlist)
		{
			if(it.getWarehouse_location().getWarehouse_id()==warehouse_id){
				if(it.getItemCode()==item_code){
					if(it.getWarehouse_location().getType_of_zone()=="Bulk"){
					it.getWarehouse_location().setType_of_zone("Pick");}
						else if(it.getWarehouse_location().getType_of_zone()=="pick")
						{
							it.getWarehouse_location().setType_of_zone("Dist");}
						}
					}
				}
			
	}

}
