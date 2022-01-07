package pert5;

public class Kucing extends Hewan{
	
	private String namakucing;
	
	
	public Kucing(String namakucing, int kaki, int mata, String jenishewan, String habitat, String riwayatpenyakit) {
		super(kaki, mata, jenishewan, habitat, "Cakar", riwayatpenyakit);
		// TODO Auto-generated constructor stub
		this.namakucing = namakucing;
	}

	@Override
	public void bersuara() {
		// TODO Auto-generated method stub
		System.out.println("Miao");
	}

	public String getNamakucing() {
		return namakucing;
	}

	public void setNamakucing(String namakucing) {
		this.namakucing = namakucing;
	}

	
	
	 

}
