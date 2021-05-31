package com.javaex.practice04;

public class Ex08 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] a = new int[6];
	
		for(int b=0; b<a.length; b++) {
			a[b] = (int)(Math.random()*45)+1;
				while(b>0 && a[b]==a[b-1]) {
					a[b] = (int)(Math.random()*45)+1;
					
				}
		
				System.out.println(a[b]+" ");
		}
		
	
		
	
	
	}

}
