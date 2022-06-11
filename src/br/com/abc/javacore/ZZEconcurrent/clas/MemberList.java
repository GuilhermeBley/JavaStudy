package br.com.abc.javacore.ZZEconcurrent.clas;

import java.util.LinkedList;
import java.util.Queue;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;

public class MemberList {
    private final Queue<String> emails = new LinkedList<>();
    private final ReentrantLock lock = new ReentrantLock();
    private final Condition conditionLock = lock.newCondition();

    private boolean open = true;

    public int getPendingEmail(){
//        synchronized (emails){
//            return this.emails.size();
//        }
//        threads ficam em espera
        lock.lock();
        try {
            return this.emails.size();
        }finally {
            lock.unlock();
        }
    }

    public boolean isOpen(){
        return open;
    }

    public String getMemberEmail(){
        String email = null;
        try{
            lock.lock();
            while (this.emails.size() == 0){
                if(!open) return null;
                System.out.println("Lista vazia, colocando a Thread " +
                        Thread.currentThread().getName()+ " em modo wait");
                //Esta lidando com o lock do objeto email abaixo, porem o lock de agora é outro
                //this.emails.wait();
                conditionLock.await();
            }
            email = this.emails.poll();

        }catch (InterruptedException e){
            e.printStackTrace();
        } finally {
            lock.unlock();
        }

        return email;
    }

    public void addMemberEmail(String email){
        lock.lock();
        try{
            this.emails.add(email);
            System.out.println("Email adicionado para a lista");
            System.out.println("Notificando as Threads que estão em espera");
//            Comando abaixo se trata do Lock errado também
//            this.emails.notifyAll();
            conditionLock.signalAll();
        }finally {
            lock.unlock();
        }


    }

    public void closeList(){
        System.out.println("Notificando todas as Threads e fechando a lista");
        this.open = false;
        lock.lock();
        try{
            conditionLock.signalAll();
        }finally {
            lock.unlock();
        }

    }
}
