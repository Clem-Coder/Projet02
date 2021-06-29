import com.hemebiotech.analytics.*;

import java.util.List;
import java.util.TreeMap;

public class Main {
	public static void main(String args[]) throws Exception {

		
		//Create List
		AnalyticsList create = new AnalyticsList("symptoms.txt");

		List<String> list = create.counter();

		
		//Create sort List
		AnalyticsSorting sort = new AnalyticsSorting(list);
		sort.bringOrder();

	
		//Watch if sorting worked
		sort.showList();
		

		//Generate file with results
		
		TreeMap<String, Integer> treeMap = sort.bringOrder();
		AnalyticsOutput file = new AnalyticsOutput(treeMap);
		file.output();
		
	}
}
