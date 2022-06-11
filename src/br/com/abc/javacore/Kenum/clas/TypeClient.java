package br.com.abc.javacore.Kenum.clas;

public enum TypeClient {
    //constant specific class body
    //corpo de classe especifico constante

    PESSOA_FISICA(1, "Pessoa física"), PESSOA_JURIDICA(2, "Pessoa Jurídica"){
        public String getId(){
            return "B";
        }
    };

    private int type;
    private String person;

    public String getId(){
        return "A";
    }

    TypeClient(int type, String person) {
        this.type = type;
        this.person = person;
    }

    public int getType() {
        return type;
    }

    public String getPerson() {
        return person;
    }
}
