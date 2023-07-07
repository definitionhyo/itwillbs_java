package static_0403_0403;

public class Ex {

	public static void main(String[] args) {
		CarInfo ci = new CarInfo();
		ci.setCompany("현대");
		ci.setCarModelName("소나타");
		ci.setColor(0x000000);
		System.out.println("===============================");
		
		CarInfoWithConstant ci2 = new CarInfoWithConstant();
//		ci2.setCompany(CarInfoWithConstant.COMPANY_HYUNDAI);
		ci2.setCompany("HYUNDAI");
		ci2.setCarModelName(CarInfoWithConstant.CAR_MODEL_NAME_SONATA);
		ci2.setColor(CarInfoWithConstant.COLOR_PERFECT_BLACK);
		
		if(ci2.getCompany() == CarInfoWithConstant.COMPANY_HYUNDAI) {
			System.out.println("현대임");
		} else {
			System.out.println("현대아님");
		}
		
		
	}

}

class CarInfoWithConstant {
	private String company;
	private String carModelName;
	private int color;
	
	public static final String COMPANY_HYUNDAI = "HYUNDAI";
	public static final String COMPANY_KIA = "KIA";
	public static final String COMPANY_CHEVROLET = "CHEVROLET";
	
	public static final String CAR_MODEL_NAME_SONATA = "SONATA";
	public static final String CAR_MODEL_NAME_K5 = "K5";
	public static final String CAR_MODEL_NAME_SPARK= "SPARK";
	
	public static final int COLOR_PERFECT_BLACK = 0x000001;
	public static final int COLOR_CREAM_WHITE = 0xFFFFCC;
	public static final int COLOR_BARCELONA_RED = 0xFF0000;
	
	public String getCompany() {
		return company;
	}
	public String getCarModelName() {
		return carModelName;
	}
	public int getColor() {
		return color;
	}
	public void setCompany(String company) {
		this.company = company;
	}
	public void setCarModelName(String carModelName) {
		this.carModelName = carModelName;
	}
	public void setColor(int color) {
		this.color = color;
	}
	
	
}

class CarInfo {
	private String company;
	private String carModelName;
	private int color;
	
	public String getCompany() {
		return company;
	}
	public String getCarModelName() {
		return carModelName;
	}
	public int getColor() {
		return color;
	}
	public void setCompany(String company) {
		this.company = company;
	}
	public void setCarModelName(String carModelName) {
		this.carModelName = carModelName;
	}
	public void setColor(int color) {
		this.color = color;
	}
	
	
}