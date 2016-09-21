package com.key.collection.list;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * @author Key.Xiao
 * List 排序
 *
 */
public class Test {

	public static void main(String[] args) {
		List<Integer> arrayList = new ArrayList<Integer>();
		arrayList.add(3);
		arrayList.add(2);
		arrayList.add(5);
		arrayList.add(6);
		arrayList.add(9);

		for (Integer i : arrayList) {
			System.out.print(i + " ");
		}
		System.out.println();

		Collections.sort(arrayList);
		for (Integer j : arrayList) {
			System.out.print(j + " ");
		}
		System.out.println();


		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		try {
			String a = in.readLine();
			System.out.println(a);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
