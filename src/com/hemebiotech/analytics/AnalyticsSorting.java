package com.hemebiotech.analytics;

import java.util.List;
import java.util.TreeMap;

/**
 * Need a String list to work (use the counter method of AnalyticsList).
 * This class is used to sort list in a new TreeMap's collection  (BringOrder) and @return this one. 
 * All the elements of the Map are sort in alphanumeric order, with their count.
 * 
 * There is also a show the list before and after the sorting (showList).
 */

public class AnalyticsSorting {

	private List<String> toOrder;
	private TreeMap<String, Integer> ordered = new TreeMap<>();

	public AnalyticsSorting(List<String> list) {

		toOrder = list;
	}

	
/** 
 * @return a sort list in alphanumeric order
 */

	public TreeMap<String, Integer> bringOrder() {

		for (String symptom : toOrder) {
			int number = 0;
			for (int i = 0; i < toOrder.size(); i++) {
				if (symptom.equals(toOrder.get(i))) {
					number++;
				}
			}

			ordered.put(symptom, number);
		}

		return ordered;
	}

	
/**
 * The show in the shell if the sorting worked.
 */
	
	public void showList() {
		System.out.println("Before sorting : " + toOrder);
		System.out.println("After sorting : " + ordered);
	}

}
