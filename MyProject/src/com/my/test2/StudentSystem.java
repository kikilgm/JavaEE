package com.my.test2;
import java.util.ArrayList;
import java.util.Scanner;

/*
 * 简单的学生管理系统111111
 */

public class StudentSystem {
   public static void main(String[] args) {
	   System.out.println("++++++++++欢迎使用学生系统++++++++++");
	   
	   //创建一个可变数组
	   ArrayList<Student> list=new ArrayList<Student>();
	   
	   Scanner sc=new Scanner(System.in);
	
	 
	  //添加一个循环标记
	  
	   bb: while (true) {
			System.out.println("");
		    System.out.print("--1.添加学生信息--");
			System.out.println("--2.查询学生信息--");
			System.out.print("--3.修改学生信息--");
			System.out.println("--4.删除学生信息--");
			System.out.println("--5.退出系统--");
			
		   

		String scStr= sc.next();
	    
        switch (scStr) {
		case "1":
			//添加操作
			add(list,sc);
			break;
		case "2":
			select(list);
			break;
		case "3":
			update(list, sc);
			break;
		case "4":
			del(list, sc);
			break;
		case "5":
			System.out.println("感谢使用,欢迎下次使用!");
			break bb;
		default:
		    System.out.print("--1.添加学生信息--");
			System.out.println("--2.查询学生信息--");
			System.out.print("--3.修改学生信息--");
			System.out.println("--4.删除学生信息--");
			System.out.println("--5.退出系统--");
			System.out.println("请输入:");
			break;
		}

   }
	sc.close();   
 }
   
   
   //添加操作
   public static void add(ArrayList<Student> list,Scanner ssc) {
		System.out.println("请输入学号");
		String num=ssc.next();
		System.out.println("请输入姓名");
		String name=ssc.next();
		System.out.println("请输入年龄");
		int age=ssc.nextInt();
		System.out.println("请输入出生年月日格式:XXXX-XX-XX");
		String birthday=ssc.next();
	    Student student=new Student(name, age, num, birthday);
	    list.add(student);
		System.out.println("学生信息添加成功");


   }
   //查询
   public static void select(ArrayList<Student> list) {
	   System.out.println("学号\t"+"姓名\t"+"年龄\t"+"生日");
	   for (Student student : list) {
		System.out.println(student.getSid()+"\t"+student.getName()+"\t"+student.getAge()+"\t"+student.getBirthday());

	  }
	 
	   
   }
   
   //修改
   public static void update(ArrayList<Student> list,Scanner ssc) {
		System.out.println("请输入学号");
		String num=ssc.next();
	
		for(int i=0;i<list.size();i++) {
		  Student student=list.get(i);
		  if (student.getSid().equals(num)) {
				System.out.println("请输入姓名");
				String name=ssc.next();
				System.out.println("请输入年龄");
				int age=ssc.nextInt();
				System.out.println("请输入出生年月日格式:XXXX-XX-XX");
				String birthday=ssc.next();
				student.setName(name);
				student.setAge(age);
				student.setBirthday(birthday);
				System.out.println("信息修改成功");

		   }else {
				System.out.println("查无此学号");

		    }
	
		}
		
		
   }
   
   
   
   //删除
   public static void del(ArrayList<Student> list,Scanner ssc) {
	   
	   System.out.println("请输入要删除的学号");
	    String num=ssc.next();
	
	    if (list.size()<=0) {
			System.out.println("查无此学号");
	    	return;
		}
		
		for(int i=0;i<list.size();i++) {
		  Student student=list.get(i);
		  if (student.getSid().equals(num)) {
			    list.remove(student);
				System.out.println("删除成功");
                 break;
		   }else {
                  if (i==list.size()-1) {
      				System.out.println("查无此学号");

				}
		    }
	
		}
	   
	   
	   
   }
   
   
   
 

}
