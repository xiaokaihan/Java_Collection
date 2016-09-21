package com.key.collection.map;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

/**
 * 如果HashMap中的key使用的是自定义的类对象，那么需要遵守equals()与hashCode()规范.
 *
 * 此测试，错误的添加了两次“white dog”， 但是HashMap也接受了，这严格来说是没有意义的，因为现在对“white dog” 的数量产生了混淆
 *
 * 对比最初的Dog类和修正后的Dog类，分别运行程序，并分析结果
 *
 * 默认的 hashCode() 方法实现对每个不同的对象返回不同的整数.
 * 默认的 equals() 方法只比较两个引用是否指向同一个实际对象.
 *
 * HashTable与HashMap基本上等同，区别仅在于HashMap不是同步的，并且允許null值
 *
 * HashMap输出结果的顺序，与插入的顺序是无关的。
 *
 * @author Key.Xiao
 * @since 16.08.31
 *
 */
public class HashMapTestt {

	public static void main(String[] args) {
		Map<Dog, Integer> hashMap = new HashMap<Dog, Integer>();
		Dog d1 = new Dog("red");
		Dog d2 = new Dog("white");
		Dog d3 = new Dog("black");
		Dog d4 = new Dog("white");

		hashMap.put(d1, 10);
		hashMap.put(d2, 5);
		hashMap.put(d3, 2);
		hashMap.put(d4, 1);

		// print size
		System.out.println(hashMap.size());

		// loop HashMap
		for (Entry<Dog, Integer> entry : hashMap.entrySet()) {
			System.out.println(entry.getKey().toString() + " - " + entry.getValue());
		}

		/*System.out.println("================");
		for (Dog dog : hashMap.keySet()) {
			System.out.println(dog.toString() + " - " + hashMap.get(dog));
		}*/
	}
}

// 最初的DOg类
/*class Dog {

	private String color;

	public Dog(String color) {
		this.color = color;
	}

	@Override
	public String toString() {
		return color + " dog";
	}
}*/

// 修正后的Dog类
class Dog {

	private String color;

	public Dog(String color) {
		this.color = color;
	}

	@Override
	public String toString() {
		return color + " dog";
	}

	@Override
	public boolean equals(Object obj) {
		return ((Dog) obj).color == color;
	}

	@Override
	public int hashCode() {
		return color.length();
	}
}
