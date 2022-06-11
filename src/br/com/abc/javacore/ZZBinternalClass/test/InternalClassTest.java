package br.com.abc.javacore.ZZBinternalClass.test;

public class InternalClassTest {

    private final String name = "Guilherme C Bley";

    class Internal{
        public void seeInnerClass() {
            System.out.println(name);
            System.out.println(this);
            System.out.println(InternalClassTest.this);
        }
    }

    public static void main(String[] args) {
        InternalClassTest external = new InternalClassTest();
        InternalClassTest.Internal internal = external.new Internal();
        internal.seeInnerClass();

        InternalClassTest.Internal in2 = new InternalClassTest().new Internal();
        in2.seeInnerClass();
    }
}

//class External{
//    private String name = "Guilherme C Bley";
//
//    class Internal{
//        public void seeInnerClass() {
//            System.out.println(name);
//        }
//    }
//}
