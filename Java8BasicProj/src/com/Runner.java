package com;

public class Runner{

	public static void main(String[] args)
	{
		FunDemo1 f1=()->{ System.out.println("hello");};
			f1.display();


	    FunDemo2 f2=(x,y)->{ System.out.println("sum:" +(x+y));};
			f2.display(23,6);

		FunDemo3 f3=()->"hello" +67;
			System.out.println(f3.display());


	}



}
