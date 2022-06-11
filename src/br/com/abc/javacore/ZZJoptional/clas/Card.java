package br.com.abc.javacore.ZZJoptional.clas;

import java.util.Optional;

public class Card {
    private InsuranceCompany insuranceCompany;
    private String name;

    public Card(InsuranceCompany insuranceCompany, String name) {
        this.insuranceCompany = insuranceCompany;
        this.name = name;
    }

    public Card(String name) {
        this.name = name;
    }

    public Optional<InsuranceCompany> getInsuranceCompany() {
        return Optional.ofNullable(insuranceCompany);
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
