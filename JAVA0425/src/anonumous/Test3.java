package anonumous;

import anonumous.CheckBox.OnSelectListener;

public class Test3 {

	public static void main(String[] args) {
		CheckBox cb = new CheckBox();
		cb.setOnSelectlistener(new OnSelectListener() {
			@Override
			public void onSelect() {
				System.out.println("배경을 변경합니다!");
			}
		});
		cb.select();
//		위에 내가한거
		
		cb.setOnSelectlistener(new CheckBox.OnSelectListener() {
			
			@Override
			public void onSelect() {
				System.out.println("배경을 변경합니다!");
			}
		});
		
		cb.select();
		
	}

}

class CheckBox {
	
	static interface OnSelectListener {
		void onSelect();
	}
	
	OnSelectListener osc;
	
	public void setOnSelectlistener(OnSelectListener osc) {
		this.osc = osc;
	}
	
	public void select() {
		osc.onSelect();
	}
	
}



































