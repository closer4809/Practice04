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
	
	/*intArray 배열은 5칸이 생긴다. 그런데 for문에서는 한계를 intarray.length,
	 즉 5로 설정되어 내려왔으므로 이하 부등호로 인하여 0~5 즉 6칸을 계산하라고 설정된다.
	 존재하지 않는 intArray[6]값을 받게되므로 부등호를 미만으로 고쳐주는것이 맞다.
	 */
	}

}
