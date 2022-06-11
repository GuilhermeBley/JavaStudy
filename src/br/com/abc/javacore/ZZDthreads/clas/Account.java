package br.com.abc.javacore.ZZDthreads.clas;

public class Account {
    private int balance = 50;

    public void withdrawn(int value){
        balance = balance - value;
    }

    public int getBalance() {
        return balance;
    }
}
