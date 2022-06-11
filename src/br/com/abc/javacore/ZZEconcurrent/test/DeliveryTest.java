package br.com.abc.javacore.ZZEconcurrent.test;

import br.com.abc.javacore.ZZEconcurrent.clas.DeliveryThreads;
import br.com.abc.javacore.ZZEconcurrent.clas.MemberList;

import javax.swing.*;

public class DeliveryTest {
    public static void main(String[] args) {
        MemberList memberList = new MemberList();
        Thread t1 = new Thread(new DeliveryThreads(memberList), "Entregador 1");
        Thread t2 = new Thread(new DeliveryThreads(memberList), "Entregador 2");

        t1.start();
        t2.start();
        while (true){
            String email = JOptionPane.showInputDialog("Digite o email do membro: ");
            if (email == null || email.isEmpty()){
                memberList.closeList();
                break;
            }
            memberList.addMemberEmail(email);
        }
    }
}
