package com.key.collection.list;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

/**
 * LinkedListDemo: LinkedList类是双向列表,列表中的每个节点都包含了对前一个和后一个元素的引用.
 *
 * @author Key.Xiao
 * @since 8.29
 */
public class LinkedListDemo {
	public static void main(String[] args) {
		LinkedList<String> lList = new LinkedList<String>();
		// 添加元素
		lList.add("a");
		lList.add("b");
		lList.add("c");
		lList.add("d");
		lList.add("e");
		lList.addFirst("first");
		lList.addLast("last");

		// 获取链表的第一个和最后一个元素
		String first = lList.getFirst();
		String last = lList.getLast();
		System.out.println("the first ele: " + first + "\n" + "the last ele: " + last);

		// 获取链表元素
		for (String str : lList) {
			System.out.print(str + " ");
		}
		System.out.println();

		// 从链表生成子表
		List<String> subList = lList.subList(1, 2);
		System.out.println(subList);

		/***************************************************************************************************************
		 * 添加单个元素：如果不指定索引，元素会被添加到链表的最后 addLast()与add()方法实现的效果一样，add(index)是添加到指定索引
		 */

		// 删除元素, 先删除第一个值
		lList.remove(); //不指定index，效果与removeFirst()方法一样
		lList.removeLast();
		System.out.println(lList);

		// 删除链表的特定元素使用
		//lList.remove(0);// 或者lList.remove("a");
		System.out.println(lList);
		//删除 链表指定范围的元素
//		lList.subList(0, 2).clear();
		//全部删除
		//lList.clear();

		// LinkedList 转换成ArrayList
		ArrayList<String> arrayList =  new ArrayList<String>(lList);
		for (String str : arrayList) {
			System.out.print(str + " ");
		}
		System.out.println();

		// LinkedList转换成数组，数组长度为链表长度
		String[] array = lList.toArray(new String[lList.size()]);
		for (String str : array) {
			System.out.print(str + " ");
		}
		System.out.println();

		// 同步方法: Collections.synchronizedList(list);
		lList = (LinkedList<String>) Collections.synchronizedList(lList);
	}


}
