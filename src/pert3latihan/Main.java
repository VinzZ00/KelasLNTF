package pert3latihan;

import java.util.Scanner;
import java.util.Vector;

public class Main {

	Scanner sc = new Scanner(System.in);
	
	public Main() {
		// TODO Auto-generated constructor stub
		Vector<Vector<String>> students = new Vector<Vector<String>>();
		
		int choose;
		do {
			System.out.println("1. Add");
			System.out.println("2. View");
			System.out.println("3. Update");
			System.out.println("4. Remove");
			System.out.println("5. Remove all");
			System.out.println("6. Exit");
			System.out.print("Choose >> ");
			choose = sc.nextInt(); sc.nextLine();
			
			switch (choose) {
			case 1:
				String nama, domisili;
				Vector<String> student = new Vector<String>();
				
				System.out.print("Masukan nama anda");
				nama = sc.nextLine();
				
				System.out.print("Masukan domisili anda");
				domisili = sc.nextLine();
				
				student.add(nama);
				student.add(domisili);
				
				students.add(student);
				
				break;

			case 2:
				if (students.isEmpty()) {
					System.out.println("Tak ada student");
				} else {
				for (Vector<String> vector : students) {
					System.out.println("Nama : " + vector.get(0) );
					System.out.println("Domisili : " + vector.get(1));
					System.out.println("================================\n");
				}
				}
				break;
				
			case 3:
				int ind = 1;
				int input;
				int input2;
				for (Vector<String> vector : students) {
					System.out.println("No. " + ind);
					System.out.println("Nama : " + vector.get(0) );
					System.out.println("Domisili : " + vector.get(1));
					System.out.println("================================\n");
					ind++;
				}
				
				System.out.println("masukan no brp");
				input = sc.nextInt(); sc.nextLine();
				int ind2= 1;
				for (String string : students.get(input-1)) {
					System.out.println(ind2 + ". " + string);
					ind2++;
					
				}
				
				System.out.println("Masukan no brp");
				input2 =sc.nextInt(); sc.nextLine();
				
				Vector<String> temp = students.get((input-1));
				
				String penganti;
				System.out.println("value penganti ");
				penganti = sc.nextLine();
				
				temp.set((input2-1), penganti);
				
				students.set((input-1), temp);
				
				break;
				
			case 4:
				int index = 1;
				int inputuser;
				for (Vector<String> vector : students) {
					System.out.println("No. " + index);
					System.out.println("Nama : " + vector.get(0) );
					System.out.println("Domisili : " + vector.get(1));
					System.out.println("================================\n");
					index++;
				}
				
				System.out.println("masukan data yg pengen dihapus berdasarkan nomor");
				inputuser = sc.nextInt(); sc.nextLine();
				
				students.remove(inputuser-1);
				
				break;
			
			case 5:
				students.removeAll(students);
				break;
			}
			
		} while (choose != 6);
	}
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Main();
	}

}
