package com.javaex.practice04;

import java.util.Scanner;

public class Ex07 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("금액");
		int sum = sc.nextInt();
		
	
		int[] wonArray = new int[10];
		wonArray[0] = 50000;
		wonArray[1] = 10000;
		wonArray[2] = 5000;
		wonArray[3] = 1000;
		wonArray[4] = 500;
		wonArray[5] = 100;
		wonArray[6] = 50;
		wonArray[7] = 10;
		wonArray[8] = 5;
		wonArray[9] = 1;
		
		for(int a=0; a<wonArray.length; a++ ) {
			
			
			int x = sum/wonArray[a];
			sum = sum-(wonArray[a]*x);
			System.out.println(wonArray[a]+"원 : "+x+"개");
			
			
		}
			
		
		
		
		sc.close();
	}

}
