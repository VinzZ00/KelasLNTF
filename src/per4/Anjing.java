package per4;

import makhlukhidup.Hewan;

public class Anjing extends Hewan{
	
	
	//field/state/Variable
	int kaki;
	public int kepala;
	public int ekor;
	private int mouth;
	private String nama;

	//constructor
	
	public Anjing() {
		super("Anjing", "Rumah");
		System.out.println(this.getNameHewan());
	}
	
	public Anjing(int kaki, int kepala, int ekor, int mouth, String nama) {
		this.kaki = kaki;
		this.kepala = kepala;
		this.ekor = ekor;
		this.mouth = mouth;
		this.nama = nama;
	}
	
	
	
	

	

	public void setmouth(int mouth) {
		
		this.mouth = mouth;
	}
	
	public int getmouth() {
		return this.mouth;
	}
	
	
	
	//method
	public void barking() {
		System.out.println("whoof whoof");
	}

	//shortcut setter getter => alt+shift+s+r
	public int getMouth() {
		return mouth;
	}

	public void setMouth(int mouth) {
		this.mouth = mouth;
	}

	public String getNama() {
		return nama;
	}

	public void setNama(String nama) {
		this.nama = nama;
	}
	
	//alt + shift + s + o
	
	
	

}
