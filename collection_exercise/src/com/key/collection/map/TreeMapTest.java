package com.key.collection.map;

import java.util.Map;
import java.util.TreeMap;
import java.util.Map.Entry;

/**
 * TreeMap是根据key排序的: 因为TreeMap是按Key来排序的，那么Key对象必须可以和另一个Key对象作比较，因此必须实现Comparable接口。
 * 可以使用String对象作为Key，因为String已经实现了Comparable接口。
 *
 * TreeMap的Key使用自定义的类对象，必须实现Comparable接口
 *
 * @author Key.Xiao
 * @since 16.08.31
 */
public class TreeMapTest {

	public static void main(String[] args) {
		Map<Dog1, Integer> treeMap = new TreeMap<Dog1, Integer>();
		Dog1 d1 = new Dog1("red", 10);
		Dog1 d2 = new Dog1("white", 20);
		Dog1 d3 = new Dog1("black", 15);
		Dog1 d4 = new Dog1("white", 20);

		treeMap.put(d1, 10);
		treeMap.put(d2, 5);
		treeMap.put(d3, 20);
		treeMap.put(d4, 15);

		System.out.println(treeMap.size());

		for (Entry<Dog1, Integer> entry : treeMap.entrySet()) {
			System.out.println(entry.getKey() + " - " + entry.getValue());
		}

	}
}

// 未实现Comparable接口， 会报错
/*class Dog1 {

	private String color;

	public Dog1(String color) {
		this.color = color;
	}

	@Override
	public String toString() {
		return color + " dog";
	}

	@Override
	public boolean equals(Object obj) {
		return ((Dog1) obj).color == color;
	}

	@Override
	public int hashCode() {
		return color.length();
	}
}
*/

class Dog1 implements Comparable<Dog1> {

	int size;
	private String color;

	public Dog1(String color, int size) {
		this.color = color;
		this.size = size;
	}

	@Override
	public String toString() {
		return color + " dog";
	}

	@Override
	public int compareTo(Dog1 o) {
		return o.size - this.size;
	}
}