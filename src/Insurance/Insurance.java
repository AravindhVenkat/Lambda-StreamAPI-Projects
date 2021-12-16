package Insurance;
public class Insurance {
	private String typeOfInsurance;
	private String name;
	private int premiumPerYear;
	public Insurance(String typeOfInsurance, String name, int premiumPerYear) {
		super();
		this.typeOfInsurance = typeOfInsurance;
		this.name = name;
		this.premiumPerYear = premiumPerYear;
	}
	public String getTypeOfInsurance() {
		return typeOfInsurance;
	}
	public void setTypeOfInsurance(String typeOfInsurance) {
		this.typeOfInsurance = typeOfInsurance;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getPremiumPerYear() {
		return premiumPerYear;
	}
	public void setPremiumPerYear(int premiumPerYear) {
		this.premiumPerYear = premiumPerYear;
	}
	@Override
	public String toString() {
		return "Insurance [typeOfInsurance=" + typeOfInsurance + ", name=" + name + ", premiumPerYear=" + premiumPerYear
				+ "]";
	}
	
}
