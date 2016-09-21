package com.key.collection.list;

import java.util.Iterator;
import java.util.LinkedList;

/**
 * 模拟栈和队列的使用: 先进后出，后进先出
 *
 * @author Key.Xiao
 *
 */
public class SimuStackAndQueue {

	public static void main(String[] args) {
		MyStack<String> stack = new MyStack<String>();
		stack.empty();
		// 压栈
		stack.push("a");
		stack.push("b");
		stack.push("c");
		stack.push("d");
		stack.push("e");
		// 出栈
		stack.pop();
		stack.pop();
		//创建一个迭代器遍历栈内剩余数据
		Iterator<String> it = stack.iterator();
		while (it.hasNext()) {
			System.out.println(it.next());
		}
	}

}

/**
 * 简单的模拟栈操作： 先进后出
 *
 * @author Key.Xiao
 *
 * @param <T>
 */
class MyStack<T> {

	private LinkedList<T> data = null; // 声明一个LinkedList泛型用来做栈

	public MyStack() {
		data = new LinkedList<T>(); // 新建一个泛型的data容器作为栈
	}

	/**
	 * 压栈
	 *
	 * @param obj
	 */
	public void push(T obj) {
		data.addFirst(obj);
	}

	/**
	 * 出栈
	 *
	 * @return
	 */
	public T pop() {
		return data.removeFirst();
	}

	/**
	 * 迭代器（用来遍历对栈操作后的栈内信息）
	 *
	 * @return
	 */
	public Iterator<T> iterator() {
		return data.iterator();
	}

	/**
	 * 取出栈顶元素
	 *
	 * @return
	 */
	public T peek() {
		return data.getFirst();
	}

	/**
	 * 判断栈是否为空
	 *
	 * @return
	 */
	public boolean empty() {
		return data.size() == 0;
	}

	/**
	 * 查找某元素在栈中的位置
	 *
	 * @param obj
	 * @return
	 */
	public int search(T obj) {
		int i = data.lastIndexOf(obj);
		if (i >= 0) {
			return data.size() - i;
		}
		return -1;
	}
}

/**
 * 模拟队列操作： 先进后出
 *
 * @author Key.Xiao
 *
 */
class MyQueue {

	// TODO
}
