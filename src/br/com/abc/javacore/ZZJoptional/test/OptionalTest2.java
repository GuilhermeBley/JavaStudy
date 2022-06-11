package br.com.abc.javacore.ZZJoptional.test;

import br.com.abc.javacore.ZZJoptional.clas.Card;
import br.com.abc.javacore.ZZJoptional.clas.InsuranceCompany;
import br.com.abc.javacore.ZZJoptional.clas.People;

import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

public class OptionalTest2 {
    public static void main(String[] args) {
        InsuranceCompany s = new InsuranceCompany("BleyCompany");
//        Card card = new Card(s,"Golf");
        Card card = new Card(null,"Golf");
        People p1 = new People(card,"Carlinhos Motoserra");

        getNameInsuranceCompany(Optional.ofNullable(p1));

        InsuranceCopanyCheckName(s);
        InsuranceCopanyCheckNameOptinional(s);

        card.setInsuranceCompany(s);
        p1.setAge(20);
        System.out.println(getNameInsuranceCompanyWithAge(p1, 18));

        Map<String,String> map = new HashMap<>();
//        map.put("Ola", "Ola");
        System.out.println(Optional.ofNullable(map.get("Ola")).orElse("Não encontrado"));
        System.out.println(stringToInt("23"));
    }

    private static Optional<Integer> stringToInt (String number){

        try {
            return Optional.of(Integer.parseInt(number));
        }catch (NumberFormatException e){
            return Optional.empty();
        }
    }

    private static void InsuranceCopanyCheckName (InsuranceCompany insuranceCompany){
        if (insuranceCompany != null && insuranceCompany.getName() == "BleyCompany") {
            System.out.println("Nome encontrado");
        }
    }

    private static void InsuranceCopanyCheckNameOptinional (InsuranceCompany insuranceCompany){
        Optional.ofNullable(insuranceCompany).filter(s -> s.getName().equals("BleyCompany"))
                .ifPresent(x -> {System.out.println("É o Guilherme BLey");});
    }

    public static String getNameInsuranceCompany (Optional<People> p){
        System.out.println(p.flatMap(People::getCard)
                .flatMap(Card::getInsuranceCompany)
                .map(InsuranceCompany::getName)
                .orElse("Não existe"));
        return "";
    }

    private static String getNameInsuranceCompanyWithAge(People p, Integer minimumAge){
        return Optional.ofNullable(p)
        .filter(people -> people.getAge() >= minimumAge)
        .flatMap(People::getCard)
        .flatMap(Card::getInsuranceCompany)
        .map(InsuranceCompany::getName)
        .orElse("Idade mínima não atingida ou dados não encontrados");
    }

//    private static String getNameInsuranceCompany(InsuranceCompany insuranceCompany){
//        String name = null;
//        if(insuranceCompany.getName() != null){
////            name = insuranceCompany.getName();
//        }
//        return name;
//    }
}
