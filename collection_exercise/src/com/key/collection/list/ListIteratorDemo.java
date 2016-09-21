package com.key.collection.list;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

/**
 * ListIterator 实例: List有专门的迭代器ListIterator，它继承了Iterator接口，
 * 但是在其基础上又增加了hasPrevious,prevoius(),add()三个方法.其增加的最主要功能就是可以反向迭代集合
 *
 * <a href =http://blog.csdn.net/lee576/article/details/7269222>
 *
 * @author Key.Xiao
 *
 */
public class ListIteratorDemo {

	public static void main(String[] args) {
		String[] books = { "math", "english", "chinese", "sports" };

		List<String> bookList = new ArrayList<String>();

		for (int i = 0; i < books.length; i++) {
			bookList.add(books[i]);
		}

		ListIterator<String> lit = bookList.listIterator();
		while (lit.hasNext()) {
			System.out.println(lit.next());
			lit.add("===分隔符=====");
		}
		System.out.println("=========反向迭代=======");
		while (lit.hasPrevious()) {
			System.out.println(lit.previous());
		}
	}
}
