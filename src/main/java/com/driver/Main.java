package com.driver;

public class Main {
    //Task-1
    public static class A{
        public String meth(){
            return "Invoking method from class A";
        }
    }

    //Task-2
    public static class B extends A{
        //Task-4
        public String meth(){
            return "Method is overridden in Extended class B";
        }
    }
  public static void main(String args[]){
      //Task-3
      B b1 = new B();
      b1.meth();

      //Task-5
      B b2 = new B();
      b2.meth();

  }
}





