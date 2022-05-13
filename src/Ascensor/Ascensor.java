package Ascensor;

public class Ascensor {
    public int piso;
    public int min;
    public int max;

    public Ascensor(int abajo, int arriba){
        this.min=abajo;
        this.max=arriba;
        this.piso=abajo;
    }

    public void subir() {
        if(piso<max){
            piso= piso+1;
        }
    }

    public void ir(int planta) {
        if(planta >= min && planta <=max)
            piso=planta;
    }

    public void bajar() {
        if (piso>min){
            piso=piso-1;
        }
    }

    public int getMax() {
        return max;
    }

    public void setMax(int max) {
        this.max = max;
    }

    public int getMin() {
        return min;
    }

    public void setMin(int min) {
        this.min = min;
    }

    public int getPiso() {
        return piso;
    }

    public void setPiso(int piso) {
        this.piso = piso;
    }


}
