package sort;

import org.omg.CORBA.PUBLIC_MEMBER;

/*
 * ð�������˼�룺һ��������̣����ڵ�����Ԫ���Դ˱Ƚϣ��Ѵ�Ļ���С�ķ��ں���
 *            һ������Ľ���������ֵ������Сֵ��������������
 *            ����ѭ�������������
 *            ע�⣺Ϊ�����Ч�ʣ��ڽ������ıȽ��У��Ѿ��źõ����ֵ���Բ��ڲμ���������ÿ�αȽϺ󣬱ȽϵĴ�����Ҫ��һ��
 * 
 * 
 */

public class bubble {
	public static void main(String[] args) {
		// int [] a = new int[10];
		int[] a = { 7, 3, 9, 1, 2, 5 };
		//
		// int count = a.length;
		// System.out.println("ԭ��������");
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
		// // ��forѭ��
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

	// Ϊ���Ժ��ֱ�ӵ������ǽ������װ�ɷ���
	// ����ı���

	public static void printArray(int[] arr) {
		System.out.println('\n' + "����");
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + ",");
		}
	}

	public static int[] bubbleSort(int[] arr) {
		// ��forѭ��
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
