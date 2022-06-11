package br.com.abc.javacore.ZZJoptional.clas2;

public class Card {
    private InsuranceCompany insuranceCompany;
    private String name;

    public String getInsuranceCompany(People p){
        if(p != null){
            Card card = p.getCard();
            if(card != null){
                InsuranceCompany s = card.getInsuranceCompany();
                if(s != null){
                    return s.getName();
                }
            }
        }
        return "";
    }

    public InsuranceCompany getInsuranceCompany() {
        return insuranceCompany;
    }

    public void setInsuranceCompany(InsuranceCompany insuranceCompany) {
        this.insuranceCompany = insuranceCompany;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
