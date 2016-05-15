package exercise;


public class Aggregate4 {
	
	static String[] table = {
		"2016-04-01	Alice	200",
		"2016-04-01	Bob		900",
		"2016-04-02	Alice	400",
		"2016-04-02	John	500",
		"2016-04-03 John	600",
		"2016-04-03	Bob		300",
		"2016-04-03	Meg		500",
	};

	public int maxAmount(String[] rows) {
		int max = 0;
		for (String row: rows) {
			String[] columns = row.split("\\s+");
			String date = columns[0];
			String name = columns[1];
			int amount = Integer.parseInt(columns[2]);
			//System.out.println("- date: "+date+", name: "+name+", amount: "+amount);
			if (amount > max) {
				max = amount;
			}
		}
		return max;
	}
	
	public static void main(String[] args) {
		//new Aggregate3().run(table);
		Aggregate4 obj = new Aggregate4();
		int x = obj.maxAmount(table);
		System.out.println(x);
	}

}
