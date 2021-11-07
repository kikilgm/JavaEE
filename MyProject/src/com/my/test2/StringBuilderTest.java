package com.my.test2;
import java.util.Scanner;

public class StringBuilderTest {
	public static void main(String[] args) {
//		reverseStr();
		appendStr();
	}
	
	//验证是否是对称字符串
	public static void reverseStr() {
		Scanner Sc=new Scanner(System.in);
		System.out.println("请输入一个字符串");
		String Scstr=Sc.nextLine();
		
		StringBuilder strBuilder=new StringBuilder(Scstr);
		//进行字符串翻转
		StringBuilder strB=strBuilder.reverse();
		
		if (strB.toString().equals(Scstr)) {
			System.out.println("这是个对称字符串");
		}else {
			System.out.println("这个不是个对称字符串");

		}
		Sc.close();
	}
	
	//指定数组拼接成字符串返回
	
	public static void appendStr() {
		
		int[] arr= {1,2,3,4};
		StringBuilder newStr=new StringBuilder("[");
		
	    for (int i = 0; i < arr.length; i++) {
	    	if(i==arr.length-1) {
	    		newStr.append("]");
	    	}else {
	    		newStr.append(arr[i]).append(",");
	    	}

		}
	    newStr.replace(newStr.length()-2, newStr.length()-1,"");
	   
	    System.out.println(newStr.toString());      
	    
	    
}
	
	
	
}

