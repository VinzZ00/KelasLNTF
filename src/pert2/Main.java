package pert2;

import per4.Anjing;

public class Main {

	public Main() {
		// TODO Auto-generated constructor stub.
		//masing string bakal kesimpan di string pool dari java (sebuah memori penyimpanan java)
		String a = "hallo, world";
		String uppercase = a.toUpperCase();
		boolean test2method = a.toUpperCase().contains("ALLO");
		System.out.println("ini 2 method " + test2method);
//		System.out.println("ini yg normal " + a);
//		System.out.println("Ini upper case " + uppercase);
		
		Anjing anjingelvin = new Anjing();
		String concata = "Nama saya adalah : ";
		String concatb = "Revaldo Dhamacora";
		String concatString = concata.concat(concatb);
		System.out.println(concatString);
		
		System.out.println("Nama saya adalah : " + "Revaldo Dhamacora");
		
		String test = "HALLO, WORLD";
		String downc = uppercase.toLowerCase();
		int compare = downc.compareTo(test);
		System.out.println("Compare " + compare);
		System.out.println("ini yg normal " + test);
		System.out.println("Ini down case " + downc);
		
		boolean b = test.contains("allo");
		System.out.println("ini boleaan b " + b);
		boolean end = a.endsWith("World");
		
		boolean eq = a.equals("Hallo, World");
		System.out.println("Ini eq " + eq);
		
		//ini mirip dengan equals method string
		// "==" CUMA UNTUK INT!!!
		int angkaa = 10;
		int angkab = 10;
		
		
		
		boolean op = angkaa == angkab;
		
		System.out.println("ini OP samadengan " + op); 
		
		boolean eqig = a.equalsIgnoreCase("haLLO, world");
		System.out.println("Ini eqig " + eqig);
		 
		System.out.println(end);
		System.out.println(b);
//		int b = a.length();
//		System.out.println(b);
		char[] c = a.toCharArray(); // 'H', 'a' , 'l', 'l', 'o'
		c[0] = 'P';
		System.out.println("Ini char array " + String.valueOf(c));
		
// 		String c = "P" + a.substring(1,5);
		System.out.println(c);
		System.out.println(a.substring(0,4));
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Main();
	}

}
