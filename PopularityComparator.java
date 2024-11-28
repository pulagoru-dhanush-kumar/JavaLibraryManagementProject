package com.lib.model;

import java.util.Comparator;

public class PopularityComparator implements Comparator <Book>{

	@Override
	public int compare(Book o1, Book o2) {
		Integer i=o1.getRating();
		Integer j=o2.getRating();
		
		return j.compareTo(j);
	}
	
