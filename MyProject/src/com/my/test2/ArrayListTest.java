package com.my.test2;
import java.util.ArrayList;

public class ArrayListTest {
	public static void main(String[] args) {
		
		addStudent();
		curdArrayList();
	}

	//将学生对象存入可变数组
	public static void addStudent() {
		Student stu1=new Student("张三", 23,"001","1992-9-01");
		Student stu2=new Student("李四", 23,"002","1992-5-10");
		Student stu3=new Student("王五", 23,"003","1992-6-05");
		
		ArrayList<Student> arr=new ArrayList<Student>();
		arr.add(stu1);
		arr.add(stu2);
		arr.add(stu3);
	
		for (int i = 0; i < arr.size(); i++) {
		      Student s=arr.get(i);
			System.out.println(s.getName()+"....."+s.getAge());
		}
	}
	
	//数组的基本操作
	
	public static void curdArrayList() {
		
		ArrayList<String> arr=new ArrayList<String>();
		arr.add("abc");
		arr.add("111");
		arr.add("222");
		arr.add("333");
		
		System.out.println(arr);
		arr.remove("abc");
		System.out.println(arr);
		arr.add(1,"abc");
		System.out.println(arr);
        arr.set(3,"ppp");
		System.out.println(arr);

	}
	
	//简单的学生管理系统演示
	
	
	
	
	
	
	

}






