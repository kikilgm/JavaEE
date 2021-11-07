package com.my.test;
public class test {

	public static void main(String[] args) {
		Animal d=new Animal("rrer",20);
		DogClass dog=new DogClass();
		dog.setName("abcdef");
		System.out.println(dog.getName());
		System.out.println("name="+d.getName()+"\n"+"age="+d.getAge());
		test.abc();
	}
	
	public static void abc(){
		for(int i=1;i<=9;i++) {
			System.out.println();
			for(int j=1;j<=i;j++) {
				System.out.print(j+"*"+i+"="+i*j+" ");
				
			}
			
		}
		
	}
	
}










