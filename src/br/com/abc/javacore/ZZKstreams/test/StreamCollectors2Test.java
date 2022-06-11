package br.com.abc.javacore.ZZKstreams.test;

import br.com.abc.javacore.ZZKstreams.clas.Gender;
import br.com.abc.javacore.ZZKstreams.clas.Majority;
import br.com.abc.javacore.ZZKstreams.clas.People;

import java.util.*;
import java.util.function.BinaryOperator;
import java.util.function.Function;

import static java.util.stream.Collectors.*;

public class StreamCollectors2Test {
    //AGRUPAMENTO
    public static void main(String[] args) {
        List<People> listPeople = People.dataPeople();

        /** //Modelo antigo de fazer essa separação
         Map<Gender, List<People>> generoListMap = new HashMap<>();
         List<People> masculinos = new ArrayList<>();
         List<People> femininos = new ArrayList<>();
         for(People person : listPeople){
         if(person.getGenero().equals(Gender.FEMININO))
         femininos.add(person);
         else{
         masculinos.add(person);
         }
         generoListMap.put(Gender.FEMININO, femininos);
         generoListMap.put(Gender.MASCULINO, masculinos);
         }

         System.out.println(generoListMap);
         **/

        //Agrupamento por genero
        Map<Gender, List<People>> collectGender = listPeople.stream().collect(groupingBy(People::getGender));
        System.out.println(collectGender);

        //Agrupamento por idade
        Map<Majority, List<People>> agePerson = listPeople.stream().collect(groupingBy(p -> {
            if (p.getAge() < 18) return Majority.PREADOLESCENTE;
            else return Majority.ADOLESCENTE;
        }));
        System.out.println("\n\n" + agePerson);

        //Agrupando por genero e idade
        Map<Gender, Map<Majority, List<People>>> ageGenderPerson = listPeople.stream()
                .collect(groupingBy(People::getGender, groupingBy(p -> {
            if (p.getAge() < 18) return Majority.PREADOLESCENTE;
            else return Majority.ADOLESCENTE;
        })));
        System.out.println("\n\n" + ageGenderPerson);

        //Agrupando por genêro e quantidade
        Map<Gender, Long> quantity = listPeople.stream()
                .collect(groupingBy(People::getGender, counting()));
        System.out.println(quantity);

        // Agrupando por genêro e maior salário

//        Map<Gender, Optional<People>> genderSalary = listPeople.stream()
//                .collect(groupingBy(People::getGender,
//                        Collectors.maxBy(Comparator.comparing(People::getSalary))));
        System.out.println("\n\nMaior salário dividos por genêros: ");
//        System.out.println(genderSalary);


        //Retirando Optional
        Map<Gender, People> genderSalary = listPeople.stream()
                .collect(toMap(People::getGender,
                        Function.identity(),
                        BinaryOperator.maxBy(Comparator.comparing(People::getSalary))));
        System.out.println(genderSalary);

        // Agrupando por genêro e estatísticas
        Map<Gender, DoubleSummaryStatistics> summarizePeople = listPeople.stream()
                .collect(groupingBy(People::getGender,
                        summarizingDouble(People::getSalary)));
        System.out.println("\n\nSummarize: ");
        System.out.println(summarizePeople);

        //Agrupando por genêro e maioridade
        Map<Gender, Set<Majority>> mappingSeparator = listPeople.stream()
                .collect(groupingBy(People::getGender, mapping(p -> {
                    if (p.getAge() < 18) return Majority.PREADOLESCENTE;
                    else return Majority.ADOLESCENTE;
                }, toSet())));
        System.out.println("\n\nMapping: ");
        System.out.println(mappingSeparator);

        //Agrupando por genêro e maioridade + toCollection
        Map<Gender, Set<Majority>> mappingSeparatorCollection = listPeople.stream()
                .collect(groupingBy(People::getGender, mapping(p -> {
                    if (p.getAge() < 18) return Majority.PREADOLESCENTE;
                    else return Majority.ADOLESCENTE;
                }, toCollection(LinkedHashSet::new))));
        System.out.println("\n\nMapping + toCollection: ");
        System.out.println(mappingSeparatorCollection);
    }
}
