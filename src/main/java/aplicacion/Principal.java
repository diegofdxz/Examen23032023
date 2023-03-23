package aplicacion;
import mates.Matematicas;

public class Principal{

    public static void main(String[] args){
        System.out.println("El valor de PI es: " + Matematicas.generarNumeroPi((long) (Math.random()*1000000000)));
    }
}