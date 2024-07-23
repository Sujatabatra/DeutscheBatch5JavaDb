package com.sujata.creational;

public class SingletonMainClass {

	public static void main(String[] args) {
//		MySingletonDemoClass obj1=new MySingletonDemoClass();
//		
//		MySingletonDemoClass obj2=new MySingletonDemoClass();

		MySingletonDemoClass obj1=MySingletonDemoClass.getInstance();
		MySingletonDemoClass obj2=MySingletonDemoClass.getInstance();
		System.out.println(obj1);
		System.out.println(obj2);
		
		obj1.show();
	}

}
