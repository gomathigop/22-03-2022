package com.array;
import java.util.ArrayList;

public class MyArrayList {

	public static void main(String[] args) {
		ArrayList<String> list=new ArrayList<String>();
		list.add("hello");
		list.add("hi");
		list.add("rani");
		list.add("kiran");
		list.add("swetha");
		list.add("ravi");

		list.add(2,"Tharani");//specified index
		System.out.println("get value in 3rd index "+list.get(2));

		System.out.println(list);//displaying list


		//integer ArrayList
		ArrayList<Integer> iob=new ArrayList<Integer>();

		//add element
		//display
		iob.add(45);
		iob.add(66);
		iob.add(85);
		iob.add(99);
		iob.add(42);
		System.out.println(iob);


		ArrayList<Float> fob=new ArrayList<Float>();
		//add elements
		//display
		fob.add(4.5f);
		fob.add(9.5f);
		fob.add(6.5f);
		fob.add(8.5f);
		fob.add(3.5f);
		System.out.println(fob);
		
		
		
		
		
		
		


	}

}




