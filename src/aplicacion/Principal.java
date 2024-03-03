package aplicacion;

import mates.Matematicas;

public class Principal{

    //Básicamente imprimimos el valor de PI Monte Carlo en 1000 pasos, los pasos son el número de puntos generados y el número de decimales a leer.
    //No uses argumentos porque no es necesario y no se traduce entonces para mí
    //Solo se puede con 1000 porque al ser recursivo, se desborda la pila de llamadas
    public static void main(String[] args){
      
        System.out.println("El numero PI es " +Matematicas.generarNumeroPiRec(0, 0, 1000));
    }
}