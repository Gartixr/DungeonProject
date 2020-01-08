public class Item {
	private String name;
	private String descrip;
	private double dropRate;
	
//	public Item(String name, String descrip, double dropRate) {
//		super();
//		this.name = name;
//		this.descrip = descrip;
//		this.dropRate = dropRate;
//	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescrip() {
		return descrip;
	}

	public void setDescrip(String descrip) {
		this.descrip = descrip;
	}

	public double getDropRate() {
		return dropRate;
	}

	public void setDropRate(double dropRate) {
		this.dropRate = dropRate;
	}
	
	
}
