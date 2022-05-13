package Ascensor;

public class Main {
    public static void main (String[] args) {
        Ascensor a1, a2;
        a1 = new Ascensor(0, 10);
        a2 = a1;
        a1.ir(6);
        a2.bajar();
        a1 = new Ascensor(-1, a1.getMax() / 2);

        a1.ir(a2.getPiso());
        a1.subir();
        a2.bajar();
        System.out.println("El ascensor 1 está en el piso " + a1.getPiso());
        System.out.println("El ascensor 1 está en el piso " + a2.getPiso());
    }
}


