package com.javaex.practice04;

import java.util.Scanner;

public class Ex05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		int[] a = new int[5];
		int result = 0;
		
		for(int b=0; b<a.length; b++) {
			a[b] = sc.nextInt();
			
		}
		
		result = (a[0]+a[1]+a[2]+a[3]+a[4])/5;
		System.out.println("����� "+(double)(result)+"�Դϴ�.");
		
		
		
		sc.close();
	
	
	}

}
