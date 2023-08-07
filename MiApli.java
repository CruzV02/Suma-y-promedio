package pkg3.pkg2;

public class MiApli extends Lista {


    public void muestra() {
        Nodo q = L;
        while (q != null) {
            System.out.println(q.getValor());
            q = q.getNext();
        }
    }

public int promedio (int n, int suma, Nodo q2 ) {
        Nodo q = q2;
        if ( q != null ) {
            suma+=(int)(q.getValor ( ));
            q = q.getNext ( );
            return promedio(n, suma, q);
        }
        else
        {
            return suma/n;
        }
    }
    public void estadistica() {
        Nodo q = L;
        int noventa = 0, ochenta = 0, setenta = 0, sesenta = 0, menos = 0, aprobado = 0, noaprobado = 0;
        while(q!=null){
            if ((int) q.getValor() >= 90 && (int) q.getValor() <= 100) {
                noventa++;
                aprobado++;
            }
            if ((int) q.getValor() >= 80 && (int) q.getValor() <= 89) {
                ochenta++;
                aprobado++;
            }
            if ((int) q.getValor() >= 70 && (int) q.getValor() <= 79) {
                setenta++;
                aprobado++;
            }
            if ((int) q.getValor() >= 60 && (int) q.getValor() <= 69) {
                sesenta++;
                noaprobado++;
            }
            if ((int) q.getValor() < 60) {
                menos++;
                noaprobado++;
            }
            q = q.getNext();
        }
        System.out.println("NUMERO DE ALUMNOS APROBADOS: " + aprobado);
        System.out.println("NUMERO DE ALUMNOS REPROBADOS: " + noaprobado);
        System.out.println("NUMERO DE ALUMNOS CON CALIFICACION MENOR A 60: " + menos);
        System.out.println("NUMERO DE ALUMNOS CON CALIFICACION 60 A 69: " + sesenta);
        System.out.println("NUMERO DE ALUMNOS CON CALIFICACION 70 A 79: " + setenta);
        System.out.println("NUMERO DE ALUMNOS CON CALIFICACION 80 A 89: " + ochenta);
        System.out.println("NUMERO DE ALUMNOS CON CALIFICACION 90 A 100: " + noventa);

    }
}
