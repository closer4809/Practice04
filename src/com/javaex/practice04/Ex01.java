package com.javaex.practice04;

public class Ex01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] intArray = new int[5];
		intArray[0] = 3;
		intArray[1] = 7;
		intArray[2] = 12;
	

		
		
		int result = 0;
		
		for (int i = 0; i < intArray.length; i++) {
			result = result + intArray[i];
		}
	
		System.out.println(result);
	
	/*intArray �迭�� 5ĭ�� �����. �׷��� for�������� �Ѱ踦 intarray.length,
	 �� 5�� �����Ǿ� ���������Ƿ� ���� �ε�ȣ�� ���Ͽ� 0~5 �� 6ĭ�� ����϶�� �����ȴ�.
	 �������� �ʴ� intArray[6]���� �ްԵǹǷ� �ε�ȣ�� �̸����� �����ִ°��� �´�.
	 */
	}

}
