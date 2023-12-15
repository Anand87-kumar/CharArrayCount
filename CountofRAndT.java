package com.anand.chararraycount;

public class CountofRAndT {

	public static void main(String[] args) {
		String str="Hello World Target";
		char[] arr=str.toCharArray();
		
		int count=0;
		for(int i=0;i<arr.length;i++) {
			if(arr[i] == 'R' || arr[i] == 'T')
				count++;
				
		}
		System.out.print("Count of Char R and T : "+count);

	}

}
