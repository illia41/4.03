package com.company;

public abstract class Parent {


    public static void message(){
        podklasa1 pod1 = new podklasa1();
        podklasa2 pod2 = new podklasa2();
        pod1.message();
        pod2.message();
    }
    public static class podklasa1{
        public void message(){
            System.out.println("to jest pierwsza podklasa");
        }

    }
    public static class podklasa2{
        public void message(){
            System.out.println("to jest druga podklasa");
        }

    }
}
