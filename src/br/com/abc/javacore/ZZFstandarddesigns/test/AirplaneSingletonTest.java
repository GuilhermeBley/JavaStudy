package br.com.abc.javacore.ZZFstandarddesigns.test;

import br.com.abc.javacore.ZZFstandarddesigns.clas.Airplane;
import br.com.abc.javacore.ZZFstandarddesigns.clas.AirplaneSingleton;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class AirplaneSingletonTest {
    public static void main(String[] args) {
        scheduleSeat("1A");
        scheduleSeat("1A");

        //Metodo quebra o modelo e permite a craição de uma classe Aviao NOVA
        //Por conta disso é criado metodos Singleton em ENUM
        AirplaneSingleton a1 = AirplaneSingleton.getINSTANCE();
        AirplaneSingleton a2 = AirplaneSingleton.getINSTANCE();
        System.out.println(a1.hashCode());
        System.out.println(a2.hashCode());

        AirplaneSingleton a3 = null;


        Constructor[] constructors = AirplaneSingleton.class.getConstructors();
        for (Constructor constructor : constructors){
            constructor.setAccessible(true);
            try {
                a3 = (AirplaneSingleton) constructor.newInstance();
            } catch (InstantiationException e) {
                e.printStackTrace();
            } catch (IllegalAccessException e) {
                e.printStackTrace();
            } catch (InvocationTargetException e) {
                e.printStackTrace();
            }
            break;
        }

        System.out.println(a3.hashCode());
    }

    private static void scheduleSeat(String seat) {
        AirplaneSingleton a = AirplaneSingleton.getINSTANCE();
        System.out.println(a.bookSeats(seat));
    }
}
