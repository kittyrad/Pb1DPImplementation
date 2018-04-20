package decorator;

public class UiElementDecorator implements UiElement {

	protected UiElement decoratedUiElement;

	public UiElementDecorator(UiElement decoratedUiElement) {
		this.decoratedUiElement = decoratedUiElement;
	}

	@Override
	public void display() {
		decoratedUiElement.display();
	}
}
