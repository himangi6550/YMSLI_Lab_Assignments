/*Write a program called Fibonacci to display the first 20 Fibonacci numbers F(n), where 
F(n)=F(n–1)+F(n–2) and F(1)=F(2)=1. Also compute their average. The output shall look like:
The first 20 Fibonacci numbers are:
1 1 2 3 5 8 13 21 34 55 89 144 233 377 610 987 1597 2584 4181 6765
The average is 885.5
*/

package com;

public class q1 {
	public static void main(String[] args) {
		printfibonacci(20);
	}
	
	public static void printfibonacci(int num) {
		int a=0,b=1,c=1;
		double sum=0.0;
		for(int i=1;i<=num;i++) {
			System.out.print(c+" ");
			sum+=c;
			c=a+b;
			a=b;
			b=c;
		}
		System.out.println();
		System.out.println("The average is "+(sum/num));
	}

}
