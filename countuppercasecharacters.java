package com.anand.chararraycount;

public class countuppercasecharacters {

	public static void main(String[] args) {
		
		String str="Hello World";
		char[] arr=str.toCharArray();
		
		int count=0;
		for(int i=0;i<arr.length;i++) {
			if(Character.isUpperCase(arr[i]))
				count++;
		}
		System.out.print("Count :"+count);
	}

}
