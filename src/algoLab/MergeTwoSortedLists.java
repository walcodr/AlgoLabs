package algoLab;

import java.util.LinkedList;
import java.util.List;

public class MergeTwoSortedLists {
	public static void main (String[] args) {
	List<Object> list1 = new LinkedList<>();
	List<Object> list2 = new LinkedList<>();
	List<Object> list3 = new LinkedList<>();
	
	list1.add(1);
	list1.add(3);
	list1.add(5);
	list1.add(7);
	
	list2.add(2);
	list2.add(4);
	list2.add(6);
	list2.add(8);
	
	System.out.println("list1: " + list1);
	System.out.println("list2: " + list2);

	for(int x = 0; x < list1.size(); x++) {
		list3.add(list1.get(x));
		list3.add(list2.get(x));
		
	}

	System.out.println("list3: " + list3);
	}
}
