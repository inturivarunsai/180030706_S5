package Array;

import java.util.Scanner;

public class One {

	public static void main(String[] args) {
		// TODO Auto-generated method stu
		int n, sum = 0;

		float average;

		@SuppressWarnings("resource")
		Scanner s = new Scanner(System.in);

		System.out.print("Enter no. of elements you want in array:");

		n = s.nextInt();

		int a[] = new int[n];

		System.out.println("Enter all the elements:");

		for(int i = 0; i < n ; i++)

		{

		a[i] = s.nextInt();

		sum = sum + a[i];

		}

		System.out.println("Sum:"+sum);

		average = (float)sum / n;

		System.out.println("Average:"+average);

		}

		}