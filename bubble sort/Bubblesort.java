import java.util.Arrays;

public class Bubblesort
{

    public static void main(String[] args) 
	{
        Integer[] a = new Integer[] {1,4,6,9,3};
        int temp;
		int i = a[3];
		int j = a[4];
        
        System.out.println("Before Swapping:");
        System.out.println(Arrays.deepToString(a));
        
        temp = j;
        j = i;
        i = temp;
        
        System.out.println("After Swapping:");
        System.out.println(Arrays.deepToString(a));
    }
    
}                                                                     