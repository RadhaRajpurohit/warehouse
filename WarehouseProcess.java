import java.util.ArrayList;

public class WarehouseProcess {
	public ArrayList<Warehouse> wh = new ArrayList<Warehouse>();

	public void addWarehouse(Warehouse w) {
		wh.add(w);
	}

	public ArrayList<Warehouse> search_Warehouse_loc(String city) {
		ArrayList<Warehouse> found_loc = new ArrayList<Warehouse>();
		for (Warehouse w : wh) {
			if (w.getCity() == city)
				found_loc.add(w);

		}
		return found_loc;

	}

	public ArrayList<Item> search_Item(String location) {
		ArrayList<Item> item = new ArrayList<Item>();
		for (Item w : item) {
			if (w.getLocation_id() == location)
				item.add(w);

		}
		return item;

	}

	public boolean delete_Warehouse(int id) {

		ArrayList<Item> it = new ArrayList<Item>();
		 for(Item item:it)
		 {
		 if(item.getWarehouse_id()==id)
		 return false;
		 }
		 for(Warehouse w:wh)
		 {
		 if(w.getWarehouse_id()==id)
		 wh.remove(w);
		
		 }

		for(Warehouse w:wh){
			if(w.getWarehouse_id()==id){
				
			}
		}

		return true;

	

	}
}
