package pert5;

import java.util.Scanner;
import java.util.Vector;



public class Zoo {

	Scanner sc = new Scanner(System.in);
	Vector<Hewan> hewan = new Vector<Hewan>();
	public Zoo() {
		// TODO Auto-generated constructor stub
		System.out.print("input your name");
		String name = sc.nextLine();
		System.out.println("Welcome to this Zoo, admin " + name);
		
		int choose;
		do {
			System.out.println("What you gonna do");
			System.out.println("1. input Burung");
			System.out.println("2. input Kucing");
			System.out.println("3. view");
			System.out.println("4. exit");
			System.out.print("Choose >> ");
			choose = sc.nextInt(); sc.nextLine();
			
			String habitat, senjata, riwayatpenyakit;
			int kaki, mata;
			switch (choose) {
			case 1:
				String jenisburung,namaburung;
				System.out.print("\nMasukan nama burung ");
				namaburung = sc.nextLine();
				System.out.print("\nMasukan jumlah kaki ");
				kaki = sc.nextInt(); sc.nextLine();
				System.out.print("\nMasukan jumlah mata ");
				mata = sc.nextInt(); sc.nextLine();
				System.out.print("\nMasukan jenis burung ");
				jenisburung = sc.nextLine();
				System.out.print("\nMasukan Habitat ");
				habitat = sc.nextLine();
				System.out.print("\nMasukan Riwayat penyakit ");
				riwayatpenyakit = sc.nextLine();
				
				hewan.add(new Burung(namaburung, kaki, mata, jenisburung, habitat, riwayatpenyakit));
				break;

			case 2:
				String namakucing, jeniskucing;
				System.out.print("\nMasukan nama kucing ");
				namakucing = sc.nextLine();
				System.out.print("\nMasukan jumlah kaki ");
				kaki = sc.nextInt(); sc.nextLine();
				System.out.print("\nMasukan jumlah mata ");
				mata = sc.nextInt(); sc.nextLine();
				System.out.print("\nMasukan jenis kucing ");
				jeniskucing = sc.nextLine();
				System.out.print("\nMasukan Habitat ");
				habitat = sc.nextLine();
				System.out.print("\nMasukan Riwayat penyakit ");
				riwayatpenyakit = sc.nextLine();
				
				hewan.add(new Kucing(namakucing, kaki, mata, jeniskucing, habitat, riwayatpenyakit));
				break;
			
			case 3:
				
				for (Hewan hewan2 : hewan) {
					
					if (hewan2 instanceof Kucing) {
						Kucing kucing = (Kucing)hewan2;
						
						System.out.println("Nama kucing ini " + kucing.getNamakucing());
						System.out.println("Ini jenis kucing " + kucing.getJenishewan());
						System.out.println("Jumlah kaki " + kucing.getKaki());
						System.out.println("Jumlah mata " + kucing.getMata());
						System.out.println("Senjata " + kucing.getSenjata());
						System.out.println("habitat " + kucing.getHabitat());
						System.out.println("Riwayat penyakit " + kucing.getRiwayatpenyakit());
						System.out.println("==========================\n");
						
					} else {
						Burung burung = (Burung)hewan2;
						System.out.println("Nama Burung ini " + burung.getNamaburung());
						System.out.println("Ini jenis Burung " + burung.getJenishewan());
						System.out.println("Jumlah kaki " + burung.getKaki());
						System.out.println("Jumlah mata " + burung.getMata());
						System.out.println("Senjata " + burung.getSenjata());
						System.out.println("habitat " + burung.getHabitat());
						System.out.println("Riwayat penyakit " + burung.getRiwayatpenyakit());
						System.out.println("==========================\n");
						
					}
				}
				sc.nextLine();
				break;
			}
		} while (choose != 4);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Zoo();
	}

}
