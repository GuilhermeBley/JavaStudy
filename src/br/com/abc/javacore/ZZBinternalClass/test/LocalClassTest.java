package br.com.abc.javacore.ZZBinternalClass.test;

public class LocalClassTest {
    private final String name = "Guilherme Bleyzer";

    public void doSomething(){
        class Internal{
            public void printExternalName(){
                System.out.println(name);
            }
        }
        Internal in = new Internal();
        in.printExternalName();
    }

    public static void main(String[] args) {
        LocalClassTest external = new LocalClassTest();
        external.doSomething();
    }
}
