package com.my.test2;
import java.util.Scanner;
public class StringTest {
	
	public static void main(String[] args) {
//      login();
//      Stringraversal() ;
//		StringCounnt();
//		iphonenum();
		
		 ttreplace();
	}
	
	
	//这是个登录案例
	public static void login() {
		String userName="admin";
		String Pwd="123456";
		Scanner sc=new Scanner(System.in);
	    for(int i=1;i<=3;i++) {
	    	System.out.println("请输入用户名:");
			String scusername = sc.nextLine();
			System.out.println("请输入密码:");
			String scpwd =sc.nextLine();
			if (scusername.equals(userName)&&scpwd.equals(Pwd)) {
				System.out.println("登录成功");
				break;
			}else{
				if (i==3) {
					System.out.println("登录失败,请找回用户名密码");
					break;
				}else {
					System.out.println("登录失败,您还有"+(3-i)+"次机会");

				}

			}

	    }
		sc.close();
	}
	
	//字符串遍历
	public static void  Stringraversal() {
		Scanner sc=new Scanner(System.in);
		System.out.println("请输入一个要拆分的字符串");
		String scstr=sc.nextLine();
	     char[]  strarr=scstr.toCharArray();
	     for (int i = 0; i < strarr.length; i++) {
			System.out.println(strarr[i]);
		}
	     
	     
	   System.out.println("通过另一种方式遍历"); 
	    
	   for (int i = 0; i < scstr.length(); i++) {
			System.out.println(scstr.charAt(i));
	     }
	   
	     
	    sc.close(); 
		
 }
	
	
	
   //字符串统计次数
	
  public static void StringCounnt() {
	int bigCharCount = 0;
	int smallCharCount = 0;
	int NumCharCount = 0;
	
	System.out.println("请输入一组字符串");
	
	Scanner Sc=new Scanner(System.in);
	String ScStr=Sc.nextLine();
	
	char[] arr =ScStr.toCharArray();
	
	for (int i = 0; i < arr.length; i++) {
		char c=arr[i];
		if (c>='a'&&c<='z') {
			smallCharCount++;
		}
		if (c>='A'&&c<='Z') {
			bigCharCount++;
		}
		if (c>='0'&&c<='9') {
			NumCharCount++;
		}
	}

	Sc.close();
	System.out.println("小写字母的个数是:"+smallCharCount);
	System.out.println("大写字母的个数是:"+bigCharCount);
	System.out.println("数字个数是:"+NumCharCount);

	   
 }
	

 //手机替换*操作
  
  public static void iphonenum() {
	  Scanner Sc=new Scanner(System.in);
	  System.out.println("请输入11位手机号");
	  Boolean keylock=true;
	  while(keylock) {
		  String tel=Sc.nextLine();
		  
		  char[] str=tel.toCharArray();
	      for (int i = 0; i < str.length; i++) {
			   if(str[i]>='0'&&str[i]<='9'&&str.length==11) {
				   if(i==10) {
					   //截取前3位
					    String ss=tel.substring(0,3);
					     //截取后四位
					    String sss=tel.substring(7);
					    System.out.println(ss+"****"+sss);
					    keylock=false;
					    break;
				   }		
//				    System.out.println("第"+i+"位正确");
			   }else{
				   System.out.println("请输入正确手机号");
				   break;
			}
		 
	      }
		   
	  }
	Sc.close();
}
	
	
	public static void ttreplace() {
		Scanner Sc=new Scanner(System.in);
		String str=Sc.nextLine();
		
		String[] dd=str.split(",");
		System.out.println(dd[0]);

		String newstr=str.replaceAll("tmd", "***");
		System.out.println(newstr);

		Sc.close();
	}
	
	

}
