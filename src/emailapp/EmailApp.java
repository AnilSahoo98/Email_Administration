package emailapp;

import java.util.*;
public class EmailApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner (System.in);
		//user info
		System.out.println("Enter First name");
		String f_name = s.next();
		System.out.println("Enter Last Name");
		String l_name = s.next();
		//creating object for Email class
		Email emp = new Email(f_name,l_name);
		int choice = -1;
		do {
			System.out.println("\n*************Enter Your Choices\n1.show info\n2 Chnage Passowrd \n3 Change mail CApacity \n4 Set ALternate mail \n5 Exit");
			choice = s.nextInt();
			switch (choice) {
			case 1:
				emp.getInfo();
				break;
			case 2:
				emp.set_password();
				break;
			case 3:
				emp.set_mailCap();
				break;
			case 4:
				emp.alternate_email();
				break;
			case 5 :
				System.out.println("Thank You For Using Apllication");
				break;
			default:
				System.out.println("Invalid Choices entered ");
			}
		}while(choice!=5);
	}

}
