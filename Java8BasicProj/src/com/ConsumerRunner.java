package com;

import java.util.function.BiConsumer;
import java.util.function.Consumer;
public class ConsumerRunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    
		
		Consumer c1=(n)->{System.out.println("hello:" +n);};  
		// we can any input as we have not mentioned any data type here, it can be int , string ,char
		c1.accept("rahul");
		
			
		Consumer c2=(n)->{System.out.println("hello:" +n);};
		c2.accept(100);
		
		Consumer<String> c3=(n)->{System.out.println("bye:" +n);};
		c3.accept("byee!!");
		
		BiConsumer c4=(n1,n2)->{System.out.println("addition is :" +n1+n2);};
		c4.accept(4,56);
		
		
		BiConsumer<Integer,Integer> c5=(n1,n2)->{System.out.println("addition is :" +(n1+n2));};  
		// here we are using wapper class to covert homogenious code
		c5.accept(4,56);
		
	}

}
