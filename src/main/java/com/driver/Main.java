package com.driver;

public class Main {
  public static void main(String[] args) {
    RWOnly rwOnly = new RWOnly();

    // error - name has private access in RWOnly
    // rwOnly.name = "Manish";
    
    
    rwOnly.setName("Manish"); // Set value using the setter function
    System.out.println(rwOnly.getName()); // Access value using the getter function

  }
}