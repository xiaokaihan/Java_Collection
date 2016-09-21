package com.key.collection.set;

import java.util.Date;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/**
 *
 *	遍历hashSet，输出为乱序
 * @author Key.Xiao
 *
 */
public class HashSetDemo {

	public static void main(String[] args) {
		Set hashSet = new HashSet();

		hashSet.add("1");
		hashSet.add("2");
		hashSet.add("3");
		hashSet.add(new Integer(4));

		// repeat element
		hashSet.add("2");
		hashSet.add(new Date());

		System.out.println("size: " + hashSet.size());
		Iterator it = hashSet.iterator();

		while (it.hasNext()) {
			System.out.println(it.next());
		}

		//remove element
		hashSet.remove(4);
		System.out.println("after remove set size: " + hashSet.size());
		System.out.println(hashSet);
	}
}
