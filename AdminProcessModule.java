import java.util.ArrayList;
import java.util.Date;
import java.util.Random;
import java.util.Scanner;

public class AdminProcessModule {
	static Scanner input=new Scanner(System.in);
	static ArrayList<Admin> adlist = new ArrayList<>();

	public static int generateids() {
		Random r = new Random();
		int id = r.nextInt(2000) + 1;
		return id;
	}

	public static void addAdmin(Admin ad) {
		if (ad != null)
			adlist.add(ad);

		else
			System.out.println("invalid input ");

	}
	
	public static void AdminMenu(){
		System.out.println("Enter your choice");
		System.out.println("1. Add an Item");
		System.out.println("2. Search an Item");
		System.out.println("3.Delete an item");
		System.out.println("4.View all items");
		System.out.println("5.Add a warehouse");
		System.out.println("6.Delete Warehouse");
		System.out.println("7.exit");
		int choice=input.nextInt();
		switch(choice)
		{
		case 1:
//			itemCode;
//			private  String itemName;
//			private double price;
//			private String location_id;
//			private String unit;
//			private Date dateOfManufacture;
//			private Date dateOfExpiry;
//			private int beginningInventory;
//			private int  quantity;
//			private String category;
//			private int warehouse_id;
			System.out.println("enter item code");
			int code=input.nextInt();
			System.out.println("enter item name");
			String name=input.nextLine();
			System.out.println("enter type of unit");
			String unit=input.nextLine();
			System.out.println("enter date of manufacture");
			String dom=input.nextLine();
			System.out.println("enter date of expiry");
			String doe=input.nextLine();
			System.out.println("enter beginning inventory");
			int beg_inventory=input.nextInt();
			System.out.println("enter category");
			String cat=input.nextLine();
			System.out.println("");
		}
	}

}
