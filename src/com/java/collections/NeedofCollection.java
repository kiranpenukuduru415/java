 package com.java.collections;

public class NeedofCollection {

	public static void main(String[] args) {
	
		int a = 10;
		int b = 20;
		int c = 30;
		int d = 40;
		int e = 20;
		int f = 30;
        int[] arArray = new int[1000];
 //limitations of array
 //1.arrays are fixed in size
 //2.arrays can hold only homogeneous data elements
        
        Student[] Students = new Student[20];
        Students[0] = new Student();
		Students[1] = new Student();
		Students[0] = new Book();
		//student[2] = new Book();
		
		Object[] Objects = new Object[10];
		Objects[0]  = new Student();
		Objects[1]  = new Student();
		Objects[2]  = new Book();
		
		//3.ready made APIs is not avalble in array
		

	}

}
class Book{
}
class Student{

}
