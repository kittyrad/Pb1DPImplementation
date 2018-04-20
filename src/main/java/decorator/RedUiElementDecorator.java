package decorator;

import java.awt.*;

public class RedUiElementDecorator extends UiElementDecorator {

	public RedUiElementDecorator(UiElement decoratedUiElement) {
		super(decoratedUiElement);
	}

	public void display(){
		decoratedUiElement.display();
		System.out.println("It is a RED Ui Element!");
		if(decoratedUiElement instanceof  CarUiElement) {
			CarUiElement carUiElement = (CarUiElement) decoratedUiElement;
			carUiElement.getButton().setBackground(Color.RED);
		}
	}
}
