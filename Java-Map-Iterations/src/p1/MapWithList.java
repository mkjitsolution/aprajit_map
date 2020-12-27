package p1;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

class Car
{
	private String name;

	public Car(String name) {
		super();
		this.name = name;
	}
	
}

public class MapWithList {

	public static void main(String[] args) {
		
		List<Car> sedanList = new ArrayList<>();
		sedanList.add(new Car("Honda-City"));
		sedanList.add(new Car("Suzuki-Ciaz"));
		sedanList.add(new Car("Skoda-abc"));
		sedanList.add(new Car("Hundai-Verna"));
		
		List<Car> suvList = new ArrayList<>();
		suvList.add(new Car("Renualt-Dustar"));
		suvList.add(new Car("Tata-Nexton"));
		suvList.add(new Car("Ford-ecoSport"));
		suvList.add(new Car("MG-abc"));
		
		List<Car> compactSedanList = new ArrayList<>();
		compactSedanList.add(new Car("Honda-amaze"));
		compactSedanList.add(new Car("Suzuki-Desire"));
		compactSedanList.add(new Car("Hundai-abc"));
		compactSedanList.add(new Car("tata-xyz"));
		
		Map<String,List<Car>> map = new HashMap<>();
		map.put("sedan",sedanList);
		map.put("compact sedan",compactSedanList);
		map.put("suv",suvList);
		System.out.println(map);
		Iterator<String> itr = map.keySet().iterator();
		
		// --- Client requirement ..show all SUV cars 
		String carType= "suv"; // entered by user 
		
		while(itr.hasNext())
		{
			String key = itr.next();
			System.out.println(key);
			if(key.equalsIgnoreCase(carType)) // check do we have such car type information or not
			{
				
				List<Car> cars = map.get(key);
				
				// and now iterate list ... that u know 
				System.out.println(cars);
			}
				
		}
		
		
	}
}
