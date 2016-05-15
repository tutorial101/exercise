package exercise;


public class Aggregate2 {
	
	static String[] table = {
		"2016-04-01	Alice	200",
		"2016-04-01	Bob		900",
		"2016-04-02	Alice	400",
		"2016-04-02	John	500",
		"2016-04-03 John	600",
		"2016-04-03	Bob		300",
		"2016-04-03	Meg		500",
	};

	public static void main(String[] args) {
		String prev = null;
		int total = 0;
		for (String row: table) {
			String[] columns = row.split("\\s+");
			String date = columns[0];
			String name = columns[1];
			int amount = Integer.parseInt(columns[2]);
			//System.out.println("- date: "+date+", name: "+name+", amount: "+amount);
			if (! date.equals(prev)) {
				if (prev != null) {
					System.out.println("- "+prev+": "+total);
					total = 0;
				}
			}
			total += amount;
			prev = date;
		}
		if (prev != null) {
			System.out.println("- "+prev+": "+total);
		}
	}

}
