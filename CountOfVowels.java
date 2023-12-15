package com.anand.chararraycount;

public class CountOfVowels {

	public static void main(String[] args) {
		String str="Hello World";
		char[] arr=str.toCharArray();
		
		int count=0;
		for(int i=0;i<arr.length;i++) {
			if(arr[i] == 'A'||arr[i] == 'E' || arr[i] =='I' || arr[i] == 'O' || arr[i] == 'U' 
					||arr[i] == 'a'||arr[i] == 'e' || arr[i] =='i' || arr[i] == 'o' || arr[i] == 'u') {
				count++;
			}
			
		}
		System.out.println("Count Vowels : " + count);
	}

}
