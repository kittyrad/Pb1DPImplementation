package decorator;

import javax.swing.*;

public class CarUiElement implements UiElement {

	private JButton button;

	public CarUiElement(JButton button){
		this.button = button;
	}

	@Override
	public void display() {
		System.out.println("CarUiElement display");
	}

	public JButton getButton() {
		return button;
	}

	public void setButton(JButton button) {
		this.button = button;
	}
}
