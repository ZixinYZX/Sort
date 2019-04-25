import java.util.Arrays;
import java.util.Random;

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
		System.out.println("java排序运行时间： "+(endTime-startTime)+"ms");
		
		startTime=System.currentTimeMillis(); 
		
		//InsertSort.sort(arr2);
		ShellSort.sort(arr2);
		
		endTime=System.currentTimeMillis();
		System.out.println("排序运行时间： "+(endTime-startTime)+"ms");
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
