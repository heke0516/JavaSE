package com.itheima.extendsModify;

public class father {
    //private：只能在当前类中访问
    private void privateMethod(){
         System.out.println("privateMethod()");
    }
    // default：当前类中、同一个包下的其他类中访问
     void defaultMethod(){
        System.out.println("defaultMethod()");
    }
    //  protected：当前类中、同一个包下的其他类中、不同包下的子类中访问
     protected void protectedMethod(){
        System.out.println("protectedMethod()");
    }
    //  public：任意位置访问
     public void publicMethod(){
        System.out.println("publicMethod()");
    }
      public static void main(String[] args) {
         father f = new father();
          f.privateMethod();
          f.defaultMethod();
          f.protectedMethod();
          f.publicMethod();
    }
}
