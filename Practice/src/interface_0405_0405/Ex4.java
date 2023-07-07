package interface_0405_0405;

public class Ex4 {

	public static void main(String[] args) {
		Ex4 ex = new Ex4();
		ex.noRelationShip();
		ex.hasRelationShip();
	}
	
	public void noRelationShip() {
		Object[] objArr = {new NoteBookPc(), new SmartPhone()};
		
		for(int i = 0; i < objArr.length; i++) {
//			objArr[i].charge();
			if(objArr[i] instanceof NoteBookPc) {
				NoteBookPc notebookpc = new NoteBookPc();
				notebookpc.charge();
			} else if(objArr[i] instanceof SmartPhone) {
				SmartPhone smartphone = new SmartPhone();
				smartphone.charge();
			}
		}
	}

	public void hasRelationShip() {
		Chargeable[] chargeableArr = {new NoteBookPc2(), new SmartPhone2()};
		
		for(int i = 0; i < chargeableArr.length; i++) {
			chargeableArr[i].charge();
		}
	}
	
}

interface Chargeable {
	public abstract void charge();
}

class NoteBookPc2 extends Pc implements Chargeable {

	@Override
	public void charge() {
		System.out.println("노트북 충전중");
	}
	
}

class SmartPhone2 extends HandPhone implements Chargeable {

	@Override
	public void charge() {
		System.out.println("핸드폰 충전중");
	}
	
}



class Pc {}

class NoteBookPc extends Pc {
	public void charge() {
		System.out.println("노트북 충전중");
	}
}

class HandPhone {}

class SmartPhone extends HandPhone {
	public void charge() {
		System.out.println("핸드폰 충전중");
	}
}