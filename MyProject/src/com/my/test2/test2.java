package com.my.test2;
import java.util.Scanner;
public class test2 {

	public static void main(String[] args) {
		Student Stu=new Student();
		Stu.setName("张三");
		Stu.setAge(-100);
		System.out.println(Stu.getName()+"...."+Stu.getAge());
		
		Student stu2=new Student("李四", 30,"004","1996-01-03");
		System.out.println(stu2.getName()+"...."+stu2.getAge());
		
		 System.out.println("请您输入一个字符串");
		 Scanner sc = new Scanner(System.in);
		 String str=sc.nextLine();
		 System.out.println(str);
		 sc.close();

	}
	
}
