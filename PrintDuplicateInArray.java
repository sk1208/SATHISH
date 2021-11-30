package assignmentWeek1;
import java.util.Arrays;
public class PrintDuplicateInArray {

	public static void main(String[] args) {
		int[] arr = {14,12,13,11,15,14,18,16,17,19,18,17,20};
		int count=0;
		int i;
		int j;
		for( i=0;i<arr.length-1;i++) {
			count=0;
			for(j=i+1;j<arr.length;j++) {
				if(arr[i]==arr[j]) {
				count=count+1;
			}
		}
if(count>0) {
	System.out.println(arr[i]);
}
	}

}
}