package com.key.collection.list;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

/**
 * Iterator delay Test
 *
 * @author Key.Xiao
 *
 */
public class IteratorTest {

	/**
	 * for循环遍历List
	 *
	 * @param list
	 * @return
	 */
	public static long testForloops(List<Integer> list) {
		long start = 0L, end = 0L;
		Integer le = null;
		start = System.nanoTime();
		for (int i = 0; i < list.size(); i++) {
			le = list.get(i);
		}
		end = System.nanoTime();
		return end - start;
	}

	public static long testIterator(List<Integer> list) {
		long start = 0L, end = 0L;
		Integer str = null;
		start = System.nanoTime();
//		Iterator<Integer> it = list.iterator();
		Iterator<Integer> it = list.listIterator();
		while (it.hasNext()) {
			str = it.next();
		}
		end = System.nanoTime();
		return end - start;
	}

	public static long testForeach(List<Integer> list) {
		long start = 0L, end = 0L;
		start = System.nanoTime();
		Integer le = null;
		for (Integer str : list) {
			le = str;
		}
		end = System.nanoTime();
		return end - start;
	}

	public static void main(String[] args) {
		// Test list size
		final int LEN = 100000;

		// init test list data
		List<Integer> arrayList = new ArrayList<Integer>();
		List<Integer> linkedList = new LinkedList<Integer>();
		for (int i = 0; i < LEN; i++) {
			Integer str = i;
			arrayList.add(str);
			linkedList.add(str);
		}
		// print test result
		final String FORMAT = "%1$-16s%2$-16s%3$16d\n";
		System.out.println("List\t\tType\t\tTime(nanoseconds)");
		System.out.println("-------------------------------------------------");
		System.out.printf(FORMAT, "ArrayList", "for", testForeach(arrayList));
		System.out.printf(FORMAT, "ArrayList", "Iterator", testIterator(arrayList));
		System.out.printf(FORMAT, "ArrayList", "foreach", testForeach(arrayList));
		System.out.println();
		System.out.printf(FORMAT, "LinkedList", "for", testForeach(linkedList));
		System.out.printf(FORMAT, "LinkedList", "Iterator", testIterator(linkedList));
		System.out.printf(FORMAT, "LinkedList", "foreach", testForeach(linkedList));

	}

}