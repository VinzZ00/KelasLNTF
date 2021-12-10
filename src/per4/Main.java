package per4;

import makhlukhidup.Hewan;

public class Main {
	
	
	
	public Main() {
		System.out.println("hello");
		
//		String elvin = new String("Elvin");
//		String Vincent = "Vincent";
//		
//		
////		Anjing hachiko = new Anjing(4, 2, 1, 3);
////		hachiko.setmouth(5);
//		
////		System.out.println("mulut hachiko ada : " + hachiko.getmouth());
//		
//		Anjing Anjingelvin = new Anjing();
//		Anjingelvin.ekor = 9;
//		Anjingelvin.kaki = 4;
//		Anjingelvin.kepala = 3;
//		Anjingelvin.setmouth(1);
//		Anjingelvin.setNama("kyuubi");
//		
//		System.out.println("ekor kyuubi ada : " + Anjingelvin.ekor);
//		System.out.println("kaki kyuubi ada : " + Anjingelvin.kaki);
//		System.out.println("kepala kyuubi ada : " + Anjingelvin.kepala);
//		System.out.println("mulut kyuubi ada : " + Anjingelvin.getmouth());
//		System.out.printf("Nama anjingnya elvin adalah : %s \n\n",Anjingelvin.getNama());
//		
		Anjing Anjingvaldo = new Anjing();
		Anjingvaldo.setNama("Hachiko");
		Anjingvaldo.ekor = 10;
		System.out.println(Anjingvaldo.kaki);
		
//		
//		System.out.println("ekor Hachiko ada : " + Anjingvaldo.ekor);
//		System.out.println("kaki Hachiko ada : " + Anjingvaldo.kaki);
//		System.out.println("kepala Hachiko ada : " + Anjingvaldo.kepala);
//		System.out.println("mulut Hachiko ada : " + Anjingvaldo.getmouth());
//		System.out.println("Nama anjingnya valdo adalah : " + Anjingvaldo.getNama());
//		System.out.print("Suara anjing valdo adalah : ");
//		Anjingvaldo.barking();
		
		
		Hewan hewanA = new Hewan("Kucing", "Hutan");
		System.out.println(hewanA.habitatHewan);
		System.out.println(hewanA.getNameHewan());
//		System.out.println(hewanA.getNameHewan());
//		System.out.println(Anjingvaldo.);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Main();
	}

}
