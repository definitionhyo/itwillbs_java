package anonumous;

public class Ex3 {

	public static void main(String[] args) {
		Window w = new Window();
		w.button1.touch();
		w.button2.touch();
		
		
	}

}

class Button {
	
	static interface OnClickListener {
		void onClick();
	}
	
	OnClickListener listener;
	
	public void setOnClickListener(OnClickListener listener) {
		this.listener = listener;
	}
	
	public void touch() {
		listener.onClick();
	}
	
}

class Window {
	Button button1 = new Button();
	Button button2 = new Button();
	
	Button.OnClickListener listener = new Button.OnClickListener() {
		
		@Override
		public void onClick() {
			System.out.println("전화를 겁니다");
		}
	};
	
	public Window() {
		button1.setOnClickListener(listener);
		button2.setOnClickListener(new Button.OnClickListener() {
			
			@Override
			public void onClick() {
				System.out.println("메세지를 보냅니다");
			}
		});
	}
	
	
}


























