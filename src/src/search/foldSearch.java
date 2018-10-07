package search;

public class foldSearch {
	public static void main(String[] args) {
		int arr[] = { 234, 244, 566, 2342, 6657 };
		System.out.println(getIndex(arr, 5));
		System.out.println(getIndex(arr, 566));
	}

	public static int getIndex(int[] arr, int value) {
		int min = 0;
		int max = arr.length - 1;
		int mid = (min + max) / 2;
		while (value != arr[mid]) {
			if (arr[mid] > value) {
				max = mid - 1;

			} else if (arr[mid] < value) {
				min = mid + 1;
			}
			//加入判断，如果没有该元素就返回-1，防止死循环
			if (min > max) {
				return -1;
			}

			mid = (max + min) / 2;
		}

		return mid;

	}
}
