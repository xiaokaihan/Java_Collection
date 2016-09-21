package com.key.collection.list;

import java.util.Enumeration;
import java.util.Stack;

/**
 * Stack使用实例
 *
 * @author Key.Xiao
 *
 */
public class StackDemo {

	public static void main(String[] args) {
		Stack stack = new Stack(); // 新建一个空栈
		// test empty()
		System.out.println(stack.empty());

		// test push()
		stack.push(new Integer(1111));
		printStack(stack);
		stack.push("stack");
		stack.push("xiao");
		stack.push("kai");
		stack.push("han");
		printStack(stack);

		// test search(). 按照栈顶-->栈底的方向，第一个为：1.
		String str = "stack";
		System.out.println("the index is: " + stack.search(str));

		// test pop(), 移除并返回移除的值
		System.out.println("移除： "+stack.pop() + " 元素");
		stack.pop();
		printStack(stack);

		// test peek()
		System.out.println("the top： " + stack.peek());

	}

	private static void printStack(Stack stack) {
		if (stack.empty()) {
			System.out.println("the stack is empty");
		} else {
			System.out.println("the elements: ");
			Enumeration items = stack.elements(); // 得到stack中的枚举对象
			while (items.hasMoreElements()) {
				System.out.println(items.nextElement() + " ");
			}
			System.out.println();
		}
	}

}
