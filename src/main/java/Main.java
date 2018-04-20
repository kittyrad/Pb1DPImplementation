import decorator.CarUiElement;
import decorator.RedUiElementDecorator;
import decorator.UiElement;
import observer.Car;
import observer.Company;

import java.awt.*;
import javax.swing.*;

public class Main {

	public static void main (String[] args) {
		Car car1 = new Car("Renault Megan");
		Car car2 = new Car("Renault Megan");
		Car car3 = new Car("Renault Megan");

		Company renaultReprezentantaCluj = new Company();
		Company renaultReprezentantaBucuresti = new Company();

		car1.attach(renaultReprezentantaBucuresti);
		car1.attach(renaultReprezentantaCluj);
		car1.setState("shipped");

		car2.attach(renaultReprezentantaCluj);
		car2.setState("shipped");

		car3.attach(renaultReprezentantaCluj);
		car3.setState("shipped");

		System.out.println("Reprezentanta din Cluj stie ca au fost livrate " + renaultReprezentantaCluj.getCarStockMap().get(car1.getName())
		+ "cu tipul" + car1.getName());

		//TODO create GUI

		JButton myGreenButton = new JButton();
		myGreenButton.setBackground(Color.GREEN);
		myGreenButton.setText("Green button");
		UiElement uiElement = new CarUiElement(myGreenButton);
		uiElement.display();
		System.out.println("Culoarea butonului este" + myGreenButton.getBackground().toString());

		//check car color and choose the correct decorator
		UiElement redUiElement = new RedUiElementDecorator(new CarUiElement(myGreenButton));
		redUiElement.display();
		System.out.println("Culoarea butonului este" + myGreenButton.getBackground().toString());
	}
}
