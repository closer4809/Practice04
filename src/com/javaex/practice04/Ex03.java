package com.javaex.practice04;

public class Ex03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] intA = { 3, 6, 9};
		
		int[] intB;
		intB = intA;	//intA �� intB �迭������ ���� ���� ���ٰ� ������
		intB[0] = 20;	// intB[0] �� intB[2]�� ���� �ٽ� ������
		intB[2] = 10;
		
		for(int i=0; i<intA.length; i++) {
			System.out.println(intA[i]);	//�׷��Ƿ� ǥ�õǴ� ���� 20 6 10
		}
	
	
	
	}

}
