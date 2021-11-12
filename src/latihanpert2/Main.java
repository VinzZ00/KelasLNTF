package latihanpert2;

import java.util.Scanner;

public class Main {
	
	Scanner sc = new Scanner(System.in);
	public Main() {
		// TODO Auto-generated constructor stub
		int choose;
		do {
			
		System.out.println("happy Petshop");
		System.out.println("=============");
		System.out.println("1. Buy new Pet");
		System.out.println("2. Exit");
		System.out.print("Choose menu >> ");
		choose = sc.nextInt(); sc.nextLine();
		
		switch (choose) {
		case 1:
			String category, type, address;
			int petprice = 0;
			int additionalprice;
			do {
				System.out.print("Choose Pet category you want? [Mammals | Reptile] : ");
				category = sc.nextLine();
			} while (!(category.equals("Mammals") || category.equals("Reptile")));

			if (category.equals("Reptile")) {
				do {
				System.out.print("Choose oet tyoe yiy want [Python | Iguana | Turtle] : ");				
				type = sc.nextLine();
				} while (!(type.equals("Python") || type.equals("Iguana") || type.equals("Turtle")));
			} else {
			
				//alt + shift + z
				do {
					System.out.print("Choose oet tyoe yiy want [Dog | Cat | Hamster] : ");
					type = sc.nextLine();
				} while (!(type.equals("Dog") || type.equals("Cat") || type.equals("Hamster")));
			}
			do {
				System.out.print("Input your address to send the pet [ must end with street & min. 2 Words] : ");
				address = sc.nextLine();
			} while (!(address.contains(" ") && address.endsWith("street") && !address.startsWith(" ")));
			
			if (type.equals("Dog")) {
				petprice += 250;
			} else if (type.equals("Cat")) {
				petprice += 200;
			} else if (type.equals("Hamster")) {
				petprice += 150;
			} else if (type.equals("Iguana")) {
				petprice += 400;
			} else if (type.equals("Python")) {
				petprice += 450;
			} else if (type.equals("Turtle")) {
				petprice += 300;
			} 
			
			if (category.equals("Mammals")) {
				additionalprice = (petprice/10);
				petprice += additionalprice;
			} else {
				additionalprice	= (petprice/5);
				petprice += additionalprice;
			}
			
			System.out.println("Payment Detail");
			System.out.println("============================================");
			System.out.println("Pet Category : " + category);
			System.out.println("Pet Type : " + type);
			System.out.println("Address : " + address);
			System.out.println("============================================");
			System.out.println("Total Payment : $" + petprice);
			int payment;
			
			do {
				System.out.println("Please input payment");
				payment = sc.nextInt();
				sc.nextLine();
			} while (payment < petprice);
			
			System.out.println("Payment success, your change is " + String.valueOf(payment - petprice));
			sc.nextLine();
			break;

		default:
			break;
		}
		} while (choose != 2);
		
			
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Main();
	}
	
	
}
