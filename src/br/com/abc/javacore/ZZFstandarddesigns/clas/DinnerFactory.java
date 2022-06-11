package br.com.abc.javacore.ZZFstandarddesigns.clas;

public class DinnerFactory {

    public static DinnerTips createCoin(Locale local){
        if(local.equals(local.BRASIL)){
            return new Real();
        }
        if(local.equals(local.EUA)){
            return new USDolar();
        }
        throw new IllegalArgumentException("Não existe esse país");
    }
}
