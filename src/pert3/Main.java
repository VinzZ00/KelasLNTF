package pert3;

import java.util.Vector;

public class Main {

	public Main() {
		// TODO Auto-generated constructor stub
//		int[] arrstat = new int[2];
//		arrstat[0] = 1;
//		arrstat[1] = 2;
//		
//		for (int i : arrstat) {
//			System.out.println(i);
//		}
//		
//		arrstat[0] = 5;
//		
//		for (int i : arrstat) {
//			System.out.println(i);
//		}
		
		Vector<String> arrdin = new Vector<String>();
		arrdin.add("Elvin");
		arrdin.add("Revaldo");
		
		System.out.println(arrdin.indexOf("Elvin"));
		System.out.println(arrdin.size());
		System.out.println(arrdin.capacity());
		
		System.out.println("\n");
		for (String string : arrdin) {
			System.out.println(string);
		}
		
	
		arrdin.set(0, "Reynard Renato");
		
		System.out.println("\n");
		System.out.println(arrdin.size());
		for (int i = 0; i < arrdin.size(); i++) {
			System.out.println(arrdin.get(i));
		}
		System.out.println("\n");
		
//		arrdin.removeAll(arrdin);
//		System.out.println(arrdin.size());
//		for (String string : arrdin) {
//			System.out.println(string);
//		}
		
		System.out.println(arrdin.contains("andi"));
		arrdin.add(1, "andi");
		
		for (String string : arrdin) {
			System.out.println(string+"\n");
		}
		
		int[][] angka2demensi = new int[2][2];
		angka2demensi[0][0] = 1;
		angka2demensi[0][1] = 2;
		angka2demensi[1][0] = 3;
		angka2demensi[1][1] = 4;
		
		System.out.println("==========================");
		for (int  j= 0; j < angka2demensi.length; j++) {
			for (int i = 0; i < angka2demensi[j].length; i++) {
				System.out.println(angka2demensi[j][i]);
			}
		}
		
		System.out.println("============================");
		Vector<Vector<String>> vec2dimensi = new Vector<Vector<String>>();
		Vector<String> nama = new Vector<>();
		nama.add("elvin");
		nama.add("andi");
		vec2dimensi.add(nama);
		for (int i = 0; i < vec2dimensi.size(); i++) {
			for (int j = 0; j < vec2dimensi.get(i).size(); j++) {
				System.out.println(vec2dimensi.get(i).get(j));
			}
			
		}
		
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Main();
	}

}
