package br.com.abc.javacore.ZZDthreads.clas;

import java.util.LinkedList;
import java.util.Queue;

public class MemberList {
    private final Queue<String> emails = new LinkedList<>();
    private boolean open = true;

    public int getPendingEmail(){
        synchronized (emails){
            return this.emails.size();
        }
    }

    public boolean isOpen(){
        return open;
    }

    public String getMemberEmail(){
        String email = null;
        try{
            synchronized (this.emails){
                while (this.emails.size() == 0){
                    if(!open) return null;
                    System.out.println("Lista vazia, colocando a Thread " +
                            Thread.currentThread().getName()+ " em modo wait");
                    //Deixa em espera
                    this.emails.wait();
                }
                email = this.emails.poll();
            }
        }catch (InterruptedException e){
            e.printStackTrace();
        }

        return email;
    }

    public void addMemberEmail(String email){
        synchronized (this.emails){
            this.emails.add(email);
            System.out.println("Email adicionado para a lista");
            System.out.println("Notificando as Threads que estão em espera");
            //Faz com que saia do estado Blocked/Wait e voltam para Runnable
            this.emails.notifyAll();
        }
    }

    public void closeList(){
        System.out.println("Notificando todas as Threads e fechando a lista");
        this.open = false;
        synchronized (this.emails){
            this.emails.notifyAll();
        }
    }
}
