package sort;

public class insertSort {
	public static void main(String[] args) {
		
		int arr[] = { 34, 54, 2, 3, 1, 23 };
		bubble.printArray(arr);
		insertsort(arr);
		bubble.printArray(arr);
	}

	public static int[] insertsort(int[] arr) {
		for (int j = 2; j < arr.length; j++) {
			int key = arr[j];
			int i = j - 1;
			while (i >= 0 && arr[i] > key) {
				arr[i + 1] = arr[i];
				i = i - 1;

			}
			arr[i + 1] = key;
		}
		return arr;
	}

}
