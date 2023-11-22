package seleniumTraining_October2023;

import java.util.Arrays;

public class ArrayConcepts {

	public static void main(String[] args) {
		
		//Array is a collection of homogenous set of data
		
		//Syntax of creating an array:
		//dataType[] arrayName=new dataType[size of the array];
		
		//Here we need to mention the size of the array upfront, because it needs to know how much memory should be allocated in the heap
		
		int[] a1=new int[5];
		
		//Prints the size of the array
		System.out.println(a1.length);
		
		//Prints the garbage value of the array or prints the format that is understandable by JAVA
		System.out.println(a1);
		
		System.out.println(Arrays.toString(a1));
		
		//Fills the complete array with value as 9
		Arrays.fill(a1, 9);
		
		System.out.println(Arrays.toString(a1));

		//Copying the array a1 into another array whose size is 20
		int b1[]=Arrays.copyOf(a1, 20);
		System.out.println(Arrays.toString(b1));
		
		for(int i=0;i<b1.length;i=i+1)
		{
			b1[i]=i;
		}
		
		System.out.println(Arrays.toString(b1));
		
		for(int i=0;i<b1.length;i=i+1)
		{
			b1[i]=i*i;
		}
		
		System.out.println(Arrays.toString(b1));
		
		for(int i=0;i<b1.length;i=i+1)
		{
			b1[i]=b1.length-i;
		}
		
		System.out.println(Arrays.toString(b1));
		
		//Sorting the array in ascending order
		Arrays.sort(b1);
		
		System.out.println(Arrays.toString(b1));
		
		//Before performing Binary Search, you need to sort the array
		//Prints the index position of the value present in the array
		//If it is not present in the array, then it will return -ve value
		System.out.println(Arrays.binarySearch(b1, 8));
		
		for(int i=0;i<b1.length;i=i+1)
		{
			b1[i]=b1.length-(b1.length*2);
		}
		
		System.out.println(Arrays.toString(b1));
	}
}
