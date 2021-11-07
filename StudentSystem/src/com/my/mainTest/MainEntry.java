package com.my.mainTest;
import java.util.Scanner;

import com.my.Controller.StudentController;
//...
public class MainEntry {
	public static void main(String[] args) {
         Scanner scanner=new Scanner(System.in);
           while(true) {
        		System.out.println("++++++++欢迎进入xxxx管理系统+++++++++");
                System.out.println("请输入您的选择: 1.为学生管理 2.为老师管理 3.退出");
        	    String str=scanner.next();
    			switch (str) {
    			case "1":
//    		         System.out.println("欢迎进入学生管理系统");
    				 StudentController studentVC=new StudentController();
    				 studentVC.start();
    				break;
    			case "2":
    		         System.out.println("欢迎进入老师管理系统");
    				break;
    			case "3":
    		         System.out.println("欢迎下次使用");
    		         scanner.close();
    		         System.exit(0);
    				break;
    			default:
    		         System.out.println("您输入有误请重新输入");
    				break;
    			}
        	 
         }
           
         
	}
}
