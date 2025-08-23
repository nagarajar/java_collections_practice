package practice.java.collections.j.tree;

import java.util.StringJoiner;

public class FibonacciSeries {
	public static void main(String[] args) {
		int n = 10;
		printFibonacciSeriesUsingForLoop(n);
		printFibonacciSeriesUsingForRecursive(0, 1, 0);
	}


	private static void printFibonacciSeriesUsingForLoop(int n) {
		// TODO Auto-generated method stub
		int a=0, b=1, c=a+b;
		StringJoiner sb = new StringJoiner(", ", "", "");
		for(int i=0; i<n; i++) {
			sb.add(String.valueOf(a));
			a=b;
			b=c;
			c=a+b;
		}
		System.out.println(sb);
	}
	

	private static void printFibonacciSeriesUsingForRecursive(int a, int b, int i) {
		// TODO Auto-generated method stub
		if(i<10) {
			System.out.print(a+ (i<9 ?", ":""));
			printFibonacciSeriesUsingForRecursive(b, a+b, i+1);
		} else {
			return;
		}
		
	}
}
