package com.anand.chararraycount;

public class CountOfDigits {

	public static void main(String[] args) {
		String str="Hello26 World";
		char[] arr=str.toCharArray();
		
		int count =0;
		for(int i=0;i<arr.length;i++) {
			if(Character.isDigit(arr[i]))
				count++;
		}
		System.out.print("Count Digits :"+count);

	}

}
