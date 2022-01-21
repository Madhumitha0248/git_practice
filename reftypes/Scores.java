package com.madhu.Ex.reftypes;

public class Scores {
	private Double Maths;
	private Double phy;
	private Double chem;

	public Double getMaths() {
		return Maths;
	}

	public void setMaths(Double maths) {
		Maths = maths;
	}

	public Double getPhy() {
		return phy;
	}

	public void setPhy(Double phy) {
		this.phy = phy;
	}

	public Double getChem() {
		return chem;
	}

	public void setChem(Double chem) {
		this.chem = chem;
	}

	@Override
	public String toString() {
		return "Scores [Maths=" + Maths + ", phy=" + phy + ", chem=" + chem + "]";
	}


}
