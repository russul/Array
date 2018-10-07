package sort;

import org.omg.CORBA.PUBLIC_MEMBER;

/*
 * 冒泡排序的思想：一次排序过程：相邻的两个元素以此比较，把大的或者小的放在后面
 *            一次排序的结果：将最大值或者最小值放在了数组的最后
 *            接着循环这个操作即可
 *            注意：为了提高效率，在接下来的比较中，已经排好的最大值可以不在参加排序，所以每次比较后，比较的次数需要减一。
 * 
 * 
 */

public class bubble {
	public static void main(String[] args) {
		// int [] a = new int[10];
		int[] a = { 7, 3, 9, 1, 2, 5 };
		//
		// int count = a.length;
		// System.out.println("原来的数组");
		// for (int i = 0; i < a.length; i++) {
		// System.out.print(a[i] + ",");
		// }
		//
		// // while (count != 0) {
		// // for (int i = 0; i < count - 1; i++) {
		// // if (a[i] > a[i + 1]) {
		// // int b = a[i];
		// // a[i] = a[i + 1];
		// // a[i + 1] = b;
		// //
		// // }
		// //
		// // }
		// // count--;
		// // }
		//
		//
		// // 用for循环
		// for (int y = 0; y < a.length; y++) {
		//
		// for (int i = 0; i < a.length - 1 - y; i++) {
		// if (a[i] > a[i + 1]) {
		// int b = a[i];
		// a[i] = a[i + 1];
		// a[i + 1] = b;
		//
		// }
		//
		// }
		// }

		int arr[] = { 14, 3, 354, 65, 43, 7654, 1, 2, 76 };
		printArray(arr);
		bubbleSort(arr);
		printArray(arr);

	}

	// 为了以后好直接调用我们将代码封装成方法
	// 数组的遍历

	public static void printArray(int[] arr) {
		System.out.println('\n' + "数组");
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + ",");
		}
	}

	public static int[] bubbleSort(int[] arr) {
		// 用for循环
		for (int y = 0; y < arr.length; y++) {

			for (int i = 0; i < arr.length - 1 - y; i++) {
				if (arr[i] > arr[i + 1]) {
					int temp = arr[i];
					arr[i] = arr[i + 1];
					arr[i + 1] = temp;

				}

			}
		}
		return arr;

	}

}
