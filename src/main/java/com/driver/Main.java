package com.driver;

public class Main {
  public static void main(String args[]){
      //Task-3
      B b1 = new B();
      b1.meth();

      //Task-5
      B b2 = new B();
      b2.meth();

  }
}

//Task-1
class A{
    String meth(){
        return "Invoking method from class A";
    }
}

//Task-2
class B extends A{
    //Task-4
    String meth(){
        return "Method is overridden in Extended class B";
    }
}



