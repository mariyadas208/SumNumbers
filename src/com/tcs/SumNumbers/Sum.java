package com.tcs.SumNumbers;

public class Sum {
		{	//overloaded methods 
			void sum(int a)
			{	System.out.println(a+a);
			}
			void sum(int a,int b)
			{	System.out.println(a+b);
			}
			void sum(double d1,double d2)
			{	System.out.println(d1+d2);
			}
			public static void main(String[] args)
			{	Test t = new Test();
				t.sum(10);
				t.sum(10,20);
				t.sum(10.5,20.4);
			}
		}
	}
