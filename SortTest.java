import java.util.Arrays;
import java.util.Random;


//测试
public class SortTest {
	public static void main(String[] args) {
		int[] arr1 = new int[100000000];
		int[] arr2 = new int[100000000];
		
		Random ra = new Random();

		for (int i = 0; i < 20; i++) {
			arr1[i] = ra.nextInt(10000000);
			arr2[i] = arr1[i];
		}
		
		long startTime=System.currentTimeMillis(); 
		
		Arrays.sort(arr1);
		
		long endTime=System.currentTimeMillis();
		System.out.println("快速排序运行时间： "+(endTime-startTime)+"ms");
		
		
		long startTime=System.currentTimeMillis(); 
		
		InsertSort.sort(arr2);
		
		long endTime=System.currentTimeMillis();
		System.out.println("插入排序运行时间： "+(endTime-startTime)+"ms");
		
		startTime=System.currentTimeMillis();
		ShellSort.sort(arr2);
		endTime=System.currentTimeMillis();
		System.out.println("希尔排序运行时间： "+(endTime-startTime)+"ms");
		
		
		int j = 0;
		while(j < arr1.length&&arr1[j] == arr2[j]){
			j++;
		}
		
		if(j == arr1.length)
			System.out.print("Right");
		else
			System.out.print("Fail");
	}
}


//希尔排序
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
//插入排序
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

