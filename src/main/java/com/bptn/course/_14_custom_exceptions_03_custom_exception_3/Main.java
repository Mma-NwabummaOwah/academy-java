
package com.bptn.course._14_custom_exceptions_03_custom_exception_3;


//Main.java
public class Main {
public static void main(String[] args) {
   try {
       Order order = new Order(-5, 20);
   } catch (InvalidOrderException e) {
       System.out.println(e.getMessage());
   }
}
}
