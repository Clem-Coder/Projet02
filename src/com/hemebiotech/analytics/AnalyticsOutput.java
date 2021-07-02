package com.hemebiotech.analytics;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Map.Entry;
import java.util.TreeMap;

/**
 * Need a TreeMap (key:String ,value: Integer) to work (use the bringOrder method of AnalyticsSorting).
 * This class is use to generate a new File call "result.out" or directly white on it all the symptoms 
 * with their count, if the file already exist.
 */

public class AnalyticsOutput {

	private File fileOut = new File("results.out");
	private TreeMap<String, Integer> list;

	public AnalyticsOutput(TreeMap<String, Integer> list) {
		this.list = list;
	}


/** 
 * This fonction will generate the fill "result.out" with all symptoms.	
 */
	public void output() {

		if (!fileOut.exists()) { 										//create file
			try {
				fileOut.createNewFile();
			} catch (IOException e) {
				e.printStackTrace();
			}
			try {														//write in fine
				FileWriter writer = new FileWriter(fileOut);				
				BufferedWriter bw = new BufferedWriter(writer);

				for (Entry<String, Integer> element : list.entrySet()) {
					bw.write(element.getKey() + " = " + element.getValue());
					bw.newLine();
				}

				bw.close();
				writer.close();

			} catch (IOException e) {
				e.printStackTrace();
			}
		} else

		{
			try {
				FileWriter writer = new FileWriter(fileOut);
				BufferedWriter bw = new BufferedWriter(writer);

				for (Entry<String, Integer> element : list.entrySet()) {
					bw.write(element.getKey() + " = " + element.getValue());
					bw.newLine();
				}

				bw.close();
				writer.close();

			} catch (IOException e) {
				e.printStackTrace();
			}

		}
	}
}
