/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg3.pkg2;

import java.util.Scanner;

public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        MiApli lista = new MiApli();
         System.out.println("Numero de calificaciones a promediar: ");
        int n = teclado.nextInt();
        int i, calif;
        System.out.println("Muestra las calificaciones: ");
        for (i = 0; i < n; i++) {
            System.out.print("Muestra Calificacion " + (i + 1) + ": ");
            Scanner teclado2 = new Scanner(System.in);
            calif = teclado2.nextInt();
            lista.insInicio(calif);
        }
        lista.estadistica();
        System.out.println("Muestra Promedio : " + lista.promedio(n, 0, lista.L));
    }
}

class Nodo {

    protected Object info;
    protected Nodo next;

    public Nodo() {
        next = null;
        info = null;
    }

    public Nodo(Object x, Nodo dir) {
        info = x;
        next = dir;

    }

    public void setNext(Nodo dir) {
        next = dir;
    }

    public void setValor(Object x) {
        info = x;
    }

    public Nodo getNext() {
        return next;
    }

    public Object getValor() {
        return info;
    }

    public String toString() {
        return "" + info;
    }
}

/*Utilice un método recursivo para sumar las calificaciones y obtener el promedio del grupo. 
Después obtenga las siguientes estadísticas e indique la complejidad de cada método definido en su programa,
como un comentario enseguida del encabezado del método.

· Número alumnos Aprobados

· Número alumnos NO Aprobados

· Alumnos con calificación de 90-100

· Alumnos con calificación de 80-89

· Alumnos con calificación de 70-79

· Alumnos con calificación de 60-69

· Alumnos con calificación Menor de 60
 */
