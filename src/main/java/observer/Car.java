package observer;

import java.util.ArrayList;
import java.util.List;

public class Car {

	private String name;
	private String state;
	private String destination;
    private List<Observer> observerCompanies = new ArrayList<>();

    public Car(String name){
    	this.name = name;
	}

	public void attach(Observer observer){
		observerCompanies.add(observer);
	}

	public void notifyAllObservers(){
		for (Observer observer : observerCompanies) {
			observer.update(name);
		}
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
		notifyAllObservers();
	}

	public String getDestination() {
		return destination;
	}

	public void setDestination(String destination) {
		this.destination = destination;
	}

	public List<Observer> getObserverCompanies() {
		return observerCompanies;
	}

	public void setObserverCompanies(List<Observer> observerCompanies) {
		this.observerCompanies = observerCompanies;
	}
}
