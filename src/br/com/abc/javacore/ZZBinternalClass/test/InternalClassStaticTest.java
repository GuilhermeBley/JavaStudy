package br.com.abc.javacore.ZZBinternalClass.test;

class External{
    //private static String name;
    static class Internal{
        public void print(){
//            System.out.println(name); Só pode chamar o nome caso a classe seja Static e o método também
            System.out.println("Imprimindo");
        }
    }
}

public class InternalClassStaticTest {
    public static void main(String[] args) {
        External.Internal external = new External.Internal();
        external.print();

        Internal2 internal2 = new Internal2();
        internal2.print();
    }

    static class Internal2{
        public void print(){
            System.out.println("Dentro da interna 2");
        }
    }
}
