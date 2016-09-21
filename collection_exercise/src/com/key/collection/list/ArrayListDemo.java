package com.key.collection.list;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

/**
 * ArrayList Demo， Iterator的使用.
 *
 * @author Key.Xiao
 *
 */
public class ArrayListDemo {

	public static void main(String[] args) {
		List<String> list = new ArrayList<String>();

		list.add("a");
		list.add("b");
		list.add("c");
		list.add("d");
		list.add("e");
		// 区别
		list.set(1, "Z");
		list.add(1, "Y");

		// 迭代器的使用
		Iterator<String> it = list.iterator();
		while (it.hasNext()) {
			System.out.println(it.next());
		}

		ListIterator<String> listIt = list.listIterator();
	}
}
