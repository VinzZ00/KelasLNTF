package pert5;

public abstract class Hewan {
	
	private int kaki;
	private int mata;
	private String jenishewan;
	private String habitat;
	private String senjata;
	private String riwayatpenyakit;
	
	//alt + shift + s + o auto construct constructor by field
	public Hewan(int kaki, int mata, String jenishewan, String habitat, String senjata, String riwayatpenyakit) {
		this.kaki = kaki;
		this.mata = mata;
		this.jenishewan	= jenishewan;
		this.habitat = habitat;
		this.senjata = senjata;
		this.riwayatpenyakit = riwayatpenyakit;
	}

	public abstract void bersuara();
	
	public String getSenjata() {
		return senjata;
	}

	public void setSenjata(String senjata) {
		this.senjata = senjata;
	}

	public void identitas() {
		System.out.println("Kami adalah Hewan");
	}

	public int getKaki() {
		return kaki;
	}

	public void setKaki(int kaki) {
		this.kaki = kaki;
	}

	public int getMata() {
		return mata;
	}

	public void setMata(int mata) {
		this.mata = mata;
	}

	public String getJenishewan() {
		return jenishewan;
	}

	public void setJenishewan(String jenishewan) {
		this.jenishewan = jenishewan;
	}

	public String getHabitat() {
		return habitat;
	}

	public void setHabitat(String habitat) {
		this.habitat = habitat;
	}

	public String getRiwayatpenyakit() {
		return riwayatpenyakit;
	}

	public void setRiwayatpenyakit(String riwayatpenyakit) {
		this.riwayatpenyakit = riwayatpenyakit;
	}
	
}
