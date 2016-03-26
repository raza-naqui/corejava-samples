package com.xivs.sample.core.collections.merge;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class MergeIterators {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> list1 = new ArrayList<String>();
		List<String> list2 = new ArrayList<String>();

		list1.add("One");
		list2.add("Two");

		Iterator<String> iterator1 = list1.iterator();
		Iterator<String> iterator2 = list2.iterator();

		
		
		while (iterator1.hasNext()) {
			System.out.println(iterator1.next());
		}
	}

}
