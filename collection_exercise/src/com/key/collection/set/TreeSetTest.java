package com.key.collection.set;

import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;

/**
 * 遍历TreeSet，输出按照id升序
 *
 * @author Key.Xiao
 *
 */
public class TreeSetTest {

	public static void main(String[] args) {

		PeopleComparator comparator = new PeopleComparator();
		Set<People> tSet = new TreeSet<People>(comparator);
		tSet.add(new People("key", 1, 23));
		tSet.add(new People("john", 3, 25));
		tSet.add(new People("dream", 2, 22));
		tSet.add(null);
		People p3 = new People("key", 4, 17);
		tSet.add(p3);

		for (People p : tSet) {
			System.out.println(p);
		}
	}
}

class People {
	String name;
	int id;
	int age;

	public People(String name, int id) {
		this(name, id, 0);
	}

	public People(String name, int id, int age) {
		this.name = name;
		this.id = id;
		this.age = age;
	}

	@Override
	public String toString() {
		return "id:" + id + ", name:" + name + ", age:" + age;
	}
}

class PeopleComparator implements Comparator<People> {

	@Override
	public int compare(People p1, People p2) {
		if (p1 == p2) {
			return 0;
		}
		if (p1 != null && p1 == null) {
			return 1;
		} else if (p1 == null && p2 != null) {
			return -1;
		}
		if (p1.id > p2.id) {
			return 1;
		} else if (p1.id < p2.id) {
			return -1;
		} else {
			return 0;
		}
	}

}