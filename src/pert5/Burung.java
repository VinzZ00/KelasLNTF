package pert5;

public class Burung extends Hewan implements terbang{
	
	private String namaburung;

	public Burung(String namaburung ,int kaki, int mata, String jenishewan, String habitat, String riwayatpenyakit) {
		super(kaki, mata, jenishewan, habitat, "Beak", riwayatpenyakit);
		// TODO Auto-generated constructor stub
		this.namaburung = namaburung;
	}
	
	
	@Override
	public void bersuara() {
		// TODO Auto-generated method stub
		System.out.println("Chirping");
	}


	public String getNamaburung() {
		return namaburung;
	}


	public void setNamaburung(String namaburung) {
		this.namaburung = namaburung;
	}


	@Override
	public void fly() {
		// TODO Auto-generated method stub
		System.out.println("terbang");
	}

	
}
