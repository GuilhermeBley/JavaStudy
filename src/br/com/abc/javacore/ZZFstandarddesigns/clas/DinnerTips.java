package br.com.abc.javacore.ZZFstandarddesigns.clas;

public interface DinnerTips{
    String getSimbol();
}

class Real implements DinnerTips{

    @Override
    public String getSimbol() {
        return "RS";
    }
}

class USDolar implements DinnerTips{

    @Override
    public String getSimbol() {
        return "US";
    }
}


