import java.util.Scanner;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input=new Scanner(System.in);
		System.out.println("Enter your choice");
		System.out.println("1.admin login");
		System.out.println("2.Customer login");
		System.out.println("3.exit");
		int choice=input.nextInt();
		switch(choice)
		{
		case 1:
			System.out.println("Enter your name");
			String ad_name=input.nextLine();
			System.out.println("enter your password");
			String ad_password=input.nextLine();
			System.out.println("id");//autogenerate
			int ad_id=AdminProcessModule.generateids();
			Admin ad=new Admin(ad_id, ad_name, ad_password);
			AdminProcessModule.addAdmin(ad);
			
			break;
		case 2:
			System.out.println("enter your name");
			String user_name=input.nextLine();
			System.out.println("");
			break;
		case 3:System.exit(0);
		break;
		default:System.out.println("invalid input");
		break;
		}

	}
	
}
