//希尔排序
import java.util.Arrays;


public class ShellSort {

	static void sort(int[] arr) {
		int gap = 1;
		while (gap < arr.length/3) {
			gap = gap * 3 + 1;
		}

		while (gap > 0) {
			for (int i = gap; i < arr.length; i++) {
				int tmp = arr[i];
				int j = i - gap;
				while (j >= 0 && arr[j] > tmp) {
					arr[j + gap] = arr[j];
					j -= gap;
				}
				arr[j + gap] = tmp;
			}
		//	gap = (int) Math.floor(gap / 3);
			gap = (gap-1)/3; 
		}
	}	
	
	public static void main(String[] args) {
		int[] arr = { 2, 4, 9, 6, 7, 3, 1, 8, 5 };
		System.out.println("排序前的数组为："+Arrays.toString(arr));
		sort(arr);
		System.out.println("排序后的数组为："+Arrays.toString(arr));
	}
}
