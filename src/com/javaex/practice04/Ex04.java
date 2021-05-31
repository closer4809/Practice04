package com.javaex.practice04;

public class Ex04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] data = {1, 3, 5, 8, 9, 11, 15, 19, 18, 20, 30, 33, 31};
		
		int result = 0;
		int b = 0;
		for(int a = 0; a<data.length; a++)
		{if(data[a]%3==0) {
			result = result + data[a];
			b++;
			}
		}
	
	System.out.println(result);
	System.out.println(b);
	
	
	}

}
