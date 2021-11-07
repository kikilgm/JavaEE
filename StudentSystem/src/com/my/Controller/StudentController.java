package com.my.Controller;
import java.util.Scanner;

public class StudentController {

	public void start(){
		Scanner sc=new Scanner(System.in);
        
		studentLoop: while (true) {
			System.out.println("++++++++欢迎进入学生管理系统+++++++++");
			System.out.println("请输入您的选择: 1.添加 2.查询 3.修改 4.删除 5.退出");
			String str = sc.next();

			switch (str) {
			case "1":
				System.out.println("添加");
				break;
			case "2":
				System.out.println("查询");
				break;
			case "3":
				System.out.println("修改");
				break;
			case "4":
				System.out.println("删除");
				break;
			case "5":
				System.out.println("退出学生管理系统，返回上级菜单");
				break studentLoop;
			default:
				break;
			}

		}
        
	}
	
	

	
}
