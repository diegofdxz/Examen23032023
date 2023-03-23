package mates;


public class Matematicas{

    long pasos = 0;
    public static double generarNumeroPi(long pasos){
        double pi = 0;
        for (int i = 0; i < pasos; i++) {
            pi += Math.pow(-1, i) / (2 * i + 1);
        }
        return 4 * pi;
    }

}