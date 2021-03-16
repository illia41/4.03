package com.company;

public abstract class Bank {
    public abstract void getBalance();
    public static class Bank1{
        public void getBalance(){
            System.out.println("100 USD");
        }
    }
    public static class Bank2{
        public void getBalance(){
            System.out.println("150 USD");
        }
    }
    public static class Bank3{
        public void getBalance(){
            System.out.println("200 USD");
        }

    }
}
