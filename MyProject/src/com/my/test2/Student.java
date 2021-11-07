package com.my.test2;

public class Student {
	
	private String name;
	private int age;
	private String sid;
	private String birthday;
	

	/**
	 *  无参数构造方法
	 */
	public Student() {
		super();
	}


	/**
	 * @param name
	 * @param age
	 * @param sid
	 * @param birthday
	 */
	
	public Student(String name, int age, String sid, String birthday) {
		super();
		this.name = name;
		this.age = age;
		this.sid = sid;
		this.birthday = birthday;
	}


	public void setName(String name) {
    	this.name=name;
    }

    
    public String getName() {
    	return this.name;
    }
     
    public void setAge(int age) {
    	if (age>0&&age<=130) {
        	this.age=age;
		}else {
			System.out.println("设置的年龄有误");
		}
    	
    }
    
    
    public int getAge() {
    	return this.age;
    }


	public String getSid() {
		return sid;
	}


	public void setSid(String sid) {
		this.sid = sid;
	}


	public String getBirthday() {
		return birthday;
	}


	public void setBirthday(String birthday) {
		this.birthday = birthday;
	}
    
    
   

}
