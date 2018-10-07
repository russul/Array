package sort;

public class quickSort {
	public static void main(String[] args) {
		 int arr[] = { 54, 34, 2, 3, 1, 23 };
		 bubble.printArray(arr);
		 quicksort(arr, 0, arr.length-1);
		 bubble.printArray(arr);
	}

	public static int[] quicksort(int[] arr, int p, int r) {
		if (p < r) {
			int q = partition(arr, p, r);
			quicksort(arr, p, q - 1);
			quicksort(arr, q+1, r);
		}
		return arr;
	}

	public static int partition(int[] arr, int p, int r) {
		int x = arr[r];
		int i = p - 1;
		for (int j = p; j < r; j++) {
			if (arr[j] <= x) {
				i = i + 1;
				int temp1 = arr[j];
				arr[j] = arr[i];
				arr[i] = temp1;
			}
		}
		int temp2 = arr[r];
		arr[r] = arr[i + 1];
		arr[i + 1] = temp2;
		return i + 1;
	}
}
