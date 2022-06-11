package br.com.abc.javacore.ZZFstandarddesigns.test;

import br.com.abc.javacore.ZZFstandarddesigns.clas.DinnerFactory;
import br.com.abc.javacore.ZZFstandarddesigns.clas.DinnerTips;
import br.com.abc.javacore.ZZFstandarddesigns.clas.Locale;

public class CoinTest {
    public static void main(String[] args) {
        DinnerTips dinner = DinnerFactory.createCoin(Locale.EUA);
        System.out.println(dinner.getSimbol());
    }
}
