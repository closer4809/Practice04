package com.javaex.practice04;

public class Ex03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] intA = { 3, 6, 9};
		
		int[] intB;
		intB = intA;	//intA 와 intB 배열설정후 둘의 값은 같다고 설정함
		intB[0] = 20;	// intB[0] 와 intB[2]의 값을 다시 설정함
		intB[2] = 10;
		
		for(int i=0; i<intA.length; i++) {
			System.out.println(intA[i]);	//그러므로 표시되는 값은 20 6 10
		}
	
	
	
	}

}
