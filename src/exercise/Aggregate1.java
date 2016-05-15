package exercise;

import java.util.Map;
import java.util.HashMap;
import java.util.TreeMap;

public class Aggregate1 {
	
	static String[] data = {
		"2016-04-01	Alice	200",
		"2016-04-01	Bob		900",
		"2016-04-02	Alice	400",
		"2016-04-02	John	500",
		"2016-04-03 John	600",
		"2016-04-03	Bob		300",
		"2016-04-03	Meg		500",
	};

	public static void main(String[] args) {
		//Map<String, Integer> map = new HashMap<String, Integer>();
		Map<String, Integer> map = new TreeMap<String, Integer>();
		for (String line: data) {
			String[] tuple = line.split("\\s+");
			String date = tuple[0];
			String name = tuple[1];
			int amount = Integer.parseInt(tuple[2]);
			//System.out.println("- date: "+date+", name: "+name+", amount: "+amount);
			if (! map.containsKey(date)) {
				map.put(date, amount);
			} else {
				map.put(date, map.get(date) + amount);
			}
		}
		for (String key: map.keySet()) {
			System.out.println("- "+key+": "+map.get(key));
		}
	}

}
