package br.com.abc.javacore.ZZDthreads.test;

import br.com.abc.javacore.ZZDthreads.clas.Account;

public class AccountTest implements Runnable{

    public static void main(String[] args) {
        AccountTest accountTest = new AccountTest();
        Thread guilherme = new Thread(accountTest, "guilherme");
        Thread tabata = new Thread(accountTest, "tabata");
        //As threads estão usando ao mesmo tempo a mesma classe,
        //por conta disso ocorrem bugs
        guilherme.start();
        tabata.start();
    }

    private final Account account = new Account();

    public static void print(){
        synchronized (AccountTest.class){
            System.out.println("Print Synchronized");
        }
    }

    private void withdrawn (int value){ //private synchronized void withdrawn (int value) OU
        synchronized (account) {
            if (account.getBalance() >= value) {
                System.out.println(Thread.currentThread().getName() + " está indo sacar.");
                account.withdrawn(value);
                System.out.println(Thread.currentThread().getName() + " completou o saque, saque de: " + account.getBalance());
            } else {
                System.out.println("A pessoa " + Thread.currentThread().getName() +
                        " não possui saldo suficiente, saldo: " +
                        account.getBalance()
                );
            }
        }
    }

    @Override
    public void run() {
        for (int index = 0; index < 5; index++){
            withdrawn(10);
            if (account.getBalance() < 0)
                System.out.println("OH MEU DEUS!");
        }

    }
}
