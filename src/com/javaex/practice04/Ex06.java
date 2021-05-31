package com.javaex.practice04;

public class Ex06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	char c[] = {'T','h','i','s',' ','i','s',' ','a',' ','p','e','n','c','i','l'};
	
	for(int a = 0; a<c.length; a++) {
		System.out.print(c[a]);
	}
	
	System.out.println("");
	
	for(int a = 0; a<c.length; a++) {
		if(c[a]==' ') {
			c[a]=',';
					};
		System.out.print(c[a]);
	}

}

}
