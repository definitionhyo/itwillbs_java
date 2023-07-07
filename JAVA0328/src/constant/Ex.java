package constant;

import java.util.Calendar;

public class Ex {

	public static void main(String[] args) {
		
		CarInfo ci = new CarInfo();
		ci.setCompany("hyndai");
		ci.setCarModelName("SONATA");
		ci.setColor(0x000000);
		
		if(ci.getCompany() == "HTUNDAI") {
			System.out.println("현대자동차입니다!");
		} else {
			System.out.println("현대자동차가 아닙니다!");
		}
		
		if(ci.getCarModelName() == "SONATA") {
			System.out.println("쏘나타입니다!");
		} else {
			System.out.println("쏘나타가아닙니다!");
		}
		
		System.out.println("----------------------------------------------");
		
		CarInfoWithConsTant ci2 = new CarInfoWithConsTant();
		ci2.setCompany(CarInfoWithConsTant.COMPANY_HYUNDAI);
		ci2.setCarModelName(CarInfoWithConsTant.CAR_MONEL_NAME_SONATA);
		ci2.setColor(CarInfoWithConsTant.COLOR_PERPECT_BLACK);
		
		if(ci2.getCompany() == CarInfoWithConsTant.COMPANY_HYUNDAI) {
			System.out.println("현대자동차입니다");
		} else {
			System.out.println("현대아님");
		}
		
		if(ci2.getCarModelName() == CarInfoWithConsTant.CAR_MONEL_NAME_SONATA) {
			System.out.println("소나타");
		} else {
			System.out.println("아님");
		}
		
		System.out.println("----------------------------------------------");
		
		Calendar cal = Calendar.getInstance();
		System.out.println("올해는 몇 년도? " + cal.get(Calendar.YEAR));
		
		
	}

}

class CarInfoWithConsTant {
	private String Company;
	private String carModelName;
	private int color;
	
	public static final String COMPANY_HYUNDAI = "HYUNDAI";
	public static final String COMPANY_KIA = "KIA";
	public static final String COMPANY_CHEVROLET = "CHEVROLET";
	
	public static final String CAR_MONEL_NAME_SONATA = "SONATA";
	public static final String CAR_MONEL_NAME_K5 = "K5";
	public static final String CAR_MONEL_NAME_SPARK = "SPARK";
	
	public static final int COLOR_PERPECT_BLACK = 0x000001;
	public static final int COLOR_WHITe = 0xFFFFCC;
	public static final int COLOR_BARCELONA_RED = 0xFF0000;
	
	public String getCompany() {
		return Company;
	}
	public String getCarModelName() {
		return carModelName;
	}
	public int getColor() {
		return color;
	}
	public void setCompany(String company) {
		Company = company;
	}
	public void setCarModelName(String carModelName) {
		this.carModelName = carModelName;
	}
	public void setColor(int color) {
		this.color = color;
	}
	
	
	
}

class CarInfo {
	private String Company;
	private String carModelName;
	private int color;
	
	//A +S +s ->r
	public String getCompany() {
		return Company;
	}
	public void setCompany(String company) {
		Company = company;
	}
	public String getCarModelName() {
		return carModelName;
	}
	public void setCarModelName(String carModelName) {
		this.carModelName = carModelName;
	}
	public int getColor() {
		return color;
	}
	public void setColor(int color) {
		this.color = color;
		
	}
	
}