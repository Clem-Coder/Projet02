package com.hemebiotech.analytics;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

/**
 * Transform the file with symptoms in a list(collection) of symptoms. Need the
 * symptoms file path in a String object ("path") to work.
 * 
 * There is also a method to show what is the file content (showFile).
 */
public class AnalyticsList implements IanalyticsList {

	private static ArrayList<String> list = new ArrayList<>();
	private static String filepath;

	public AnalyticsList(String path) {

		this.filepath = path;
	}

	/**
	 * @return an Arraylist with all the symptoms from the file. Catch an exception
	 * if the file path is wrong.
	 */

	public ArrayList<String> counter() {

		try {
			BufferedReader reader = new BufferedReader(new FileReader(filepath));
			String line = reader.readLine();

			while (line != null) {
				list.add(line);
				line = reader.readLine();
			}

			reader.close();

		} catch (IOException e) {
			System.out.println("The indicated path to the symptoms file is wrong");
		}

		return list;
	}

}
