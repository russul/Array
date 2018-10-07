package sort;

public class mergeSort {
	public static void main(String[] args) {

		 int arr[] = { 54, 34, 2, 3, 1, 23 };
		 bubble.printArray(arr);
		 mergesort(arr);
		 bubble.printArray(arr);
		 int a[] = { 34, 54, 2, 3, 1, 23, 893, 12, 135, 24, 15, 1423, 562, 112,
				234 };
		 bubble.printArray(a);
		 mergesort(a);
		 bubble.printArray(a);

	}

	public static int[] mergesort(int[] arr) {
		return mergesort(arr, 0, arr.length - 1);
	}

	public static int[] mergesort(int[] arr, int p, int r) {

		if (p < r) {
			int q = (p + r) / 2;

			mergesort(arr, p, q);

			mergesort(arr, q + 1, r);
			merge(arr, p, q, r);

		}

		return arr;
	}
//���������������ƴ�ӳ�һ�����������
	public static int[] merge(int[] arr, int p, int q, int r) { //p,q,r�����������ֵ��p-->q��һ���������飬q+1-->r����һ����������
		int x = q - p + 1;
		int y = r - q;

		int[] left = new int[x];
		int[] right = new int[y];
		for (int i = 0; i < x; i++) {
			left[i] = arr[p + i];
		}
		for (int j = 0; j < y; j++) {
			right[j] = arr[q + j + 1];
		}
		
		int i = 0, j = 0, k = p;

		while (i < left.length && j < right.length) {
			if (left[i] <= right[j]) {
				arr[k++] = left[i++];

			} else {
				arr[k++] = right[j++];
			}
		}
		while (i < left.length) {    //ͨ���ж������ѭ��������i����j����length����ֹ�����һ�����ݶ�ʧ
			arr[k++] = left[i++];
		}
		while (j < right.length) {
			arr[k++] = right[j++];
		}

	
		return arr;
	}
}
