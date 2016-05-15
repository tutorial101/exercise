package exercise;

import java.util.Map;
//import java.util.HashMap;
import java.util.TreeMap;


public class Aggregate5 {
	
	static String[] table = {
		"2016-04-01	Alice	200",
		"2016-04-01	Bob		900",
		"2016-04-02	Alice	400",
		"2016-04-02	John	500",
		"2016-04-03 John	600",
		"2016-04-03	Bob		300",
		"2016-04-03	Meg		500",
	};

	public Map<String, Integer> maxAmountPerName(String[] rows) {
		Map<String, Integer> maxAmounts = new TreeMap<String, Integer>();
		for (String row: rows) {
			String[] columns = row.split("\\s+");
			String date = columns[0];
			String name = columns[1];
			int amount = Integer.parseInt(columns[2]);
			//System.out.println("- date: "+date+", name: "+name+", amount: "+amount);
			if (! maxAmounts.containsKey(name)) {
				maxAmounts.put(name, amount);
			} else if (amount > maxAmounts.get(name)) {
				maxAmounts.put(name, amount);
			}
		}
		return maxAmounts;
	}
	
	public static void main(String[] args) {
		//new Aggregate3().run(table);
		Aggregate5 obj = new Aggregate5();
		Map<String, Integer> map = obj.maxAmountPerName(table);
		for (String key: map.keySet()) {
			System.out.println(key+": "+map.get(key));
		}
	}

}
