package br.com.abc.introduccion.fluxcontrol;

public class FluxControl1 {
    //"PSVM"+TAB

    public static void main(String[] args) {
        int agePerson= 18;
        String category = "Adulto";

        if (agePerson < 15)
            category = "Infantil";
        else if(agePerson >= 15 && agePerson < 18)
            category = "Juvenil";

        //"SOUF" + TAB
        System.out.printf(category);
    }
}
