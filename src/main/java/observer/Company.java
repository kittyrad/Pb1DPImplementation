package observer;

import java.util.HashMap;
import java.util.Map;

public class Company extends Observer {

	private Map<String, Integer > carStockMap = new HashMap<>();

	public void update(String name) {
		if(carStockMap.get(name) != null){
			int stock = carStockMap.get(name);
			carStockMap.put(name, ++stock);
		} else {
			carStockMap.put(name, 1);
		}

	}

	public Map<String, Integer> getCarStockMap() {
		return carStockMap;
	}

	public void setCarStockMap(Map<String, Integer> carStockMap) {
		this.carStockMap = carStockMap;
	}
}
