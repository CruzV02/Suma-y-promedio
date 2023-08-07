/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg3.pkg2;

/**
 *
 * @author varga
 */
public class Lista {

    protected Nodo L;

    public Lista() {
        L = null;
    }

    public boolean isEmpty() {
        return L == null;
    }

    public void insInicio(Object x) {
        L = new Nodo(x, L);
    }

    public void insAfter(Nodo p, Object x) {
        if (p == null) {
            System.out.println("no existe el nodo");
        } else {
            Nodo dir = new Nodo(x, p.getNext());
            p.setNext(dir);
        }
    }

    public void insFinal(Object x) {
        if (isEmpty()) {
            insInicio(x);
        } else {
            Nodo q = L;
            while (q.getNext() != null) {
                q = q.getNext();
            }
            Nodo dir = new Nodo(x, null);
            q.setNext(dir);
        }
    }

    public Object delInicio() {
        if (isEmpty()) {
            return null;
        }
        Nodo dir = L;
        L = dir.getNext();
        return dir.getValor();
    }

    public Object delAfter(Nodo p) {
        if (p != null && p.getNext() != null) {
            Object x = p.getNext().getValor();
            p.setNext(p.getNext().getNext());
            return x;
        }
        return null;
    }

    public Object delFinal() {
        if (isEmpty()) {
            return null;
        }
        if (L.getNext() == null) {
            return delInicio();
        }
        Nodo q = L;
        while (q.getNext().getNext() != null) {
            q = q.getNext();
        }
        Object x = q.getNext().getValor();
        q.setNext(null);
        return x;
    }
}
