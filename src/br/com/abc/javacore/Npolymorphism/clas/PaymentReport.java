package br.com.abc.javacore.Npolymorphism.clas;

public class PaymentReport {

    public void reportSalaryManager(Maneger manager){
        System.out.println("Gerando relatório de pagamento para gerencia");
        manager.calculatePayment();
        System.out.println("Nome: " + manager.getName() +
                "\nSalário desse mês " + manager.getSalary());
    }

    public void reportSalarySalesman(Salesman salesman){
        System.out.println("Gerando relatório de pagamento para os vendedores");
        salesman.calculatePayment();
        System.out.println("Nome: " + salesman.getName() +
                "\nSalário desse mês " + salesman.getSalary());
    }

    public void reportPaymentGeneric (Employee employee){
        System.out.println("Gerando relatório de pagamento");
        employee.calculatePayment();
        System.out.println("Nome: " + employee.getName() +
                "\nSalário desse mês " + employee.getSalary());

        if (employee instanceof Maneger){
            Maneger m =(Maneger) employee;
            System.out.println("Participação dos lucros: " + m.getProfitShare());
        }
        if (employee instanceof Salesman){
   //         Salesman s = (Salesman) employee; 
            System.out.println("Total de vendas: " + ((Salesman)employee).getTotalSales());
        }
    }
}
