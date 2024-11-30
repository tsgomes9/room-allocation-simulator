package application;

import java.util.Scanner;

import entities.Rent;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int quantityRented, ClientRoom, rooms=10; 
		String ClientName, ClientEmail;	
		
		Rent[] rent = new Rent[rooms]; 
		
		System.out.println("How many rooms will be rented? ");
		quantityRented = sc.nextInt();
		
		for(int i = 0; i < quantityRented ; i++) {
			System.out.println("---------------------------");
			sc.nextLine();
			System.out.print("Name: ");
			ClientName = sc.nextLine();
			
			System.out.print("Email: ");
			ClientEmail = sc.nextLine();
		
			System.out.print("Room: ");
			ClientRoom = sc.nextInt();
			
			if (rent[ClientRoom] == null) {
				rent[ClientRoom] = new Rent(ClientName, ClientEmail, ClientRoom);
			}
		}
		
		for(int i = 0; i < rooms ; i++) {
			if (rent[i] != null) {
				System.out.printf("\nRoom %d: %s , %s", i, rent[i].getClientName(), rent[i].getClientEmail());
			}
			//else {
			//	System.out.printf("\nQuarto %d vazio!", i);
			//}
		}
		
		sc.close();

	}

}
