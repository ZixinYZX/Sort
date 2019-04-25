import java.util.Arrays;

public class InsertSort {
	
	static void sort(int[] a) {
		for (int i = 1; i < a.length; i++) {
			int temp = a[i]; // 记录要插入的数据
			int j = i;
			
			while (j>0 && temp < a[j-1]) {
				a[j] = a[j - 1];
				j--;
			}
			if (i != j)
				a[j] = temp;
		}
	}
