package sort;

public class select {
	public static void main(String[] args) {
		int arr[] = { 34, 54, 2, 3, 1, 354 };
		bubble.printArray(arr);
		selectSort(arr);
		bubble.printArray(arr);
	}

	public static int[] selectSort(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i] > arr[j]) {
					int temp = arr[j];
					arr[j] = arr[i];
					arr[i] = temp;

				}
			}

		}
		return arr;
	}
}
