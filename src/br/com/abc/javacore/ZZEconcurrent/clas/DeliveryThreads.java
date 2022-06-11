package br.com.abc.javacore.ZZEconcurrent.clas;

public class DeliveryThreads implements Runnable{
    private MemberList memberList;

    public DeliveryThreads(MemberList memberList) {
        this.memberList = memberList;
    }

    @Override
    public void run() {
        String threadName = Thread.currentThread().getName();
        System.out.println(threadName + " começando o trabalho de entrega");
        int accountPending = memberList.getPendingEmail();
        boolean open = memberList.isOpen();
        while (open || accountPending > 0){
            try{
                String email = memberList.getMemberEmail();
                if(email != null){
                    System.out.println(threadName + "Enviando email para " + email);
                    Thread.sleep(2000);
                    System.out.println("Envio para " + email + " concluído com sucesso");
                }
            }catch (InterruptedException e){
                e.printStackTrace();
            }
            open = memberList.isOpen();
            accountPending = memberList.getPendingEmail();
        }
        System.out.println("Atividades finalizadas");
    }
}
