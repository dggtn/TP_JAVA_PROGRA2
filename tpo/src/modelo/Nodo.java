package modelo;

import interfaz.INodo;

public class Nodo<T> implements INodo<T> {

    private T dato;
    private INodo<T> izquierdo;
    private INodo<T> derecho;

    public Nodo(T dato) {
        this.dato = dato;
        this.izquierdo = null;
        this.derecho = null;
    }

    @Override
    public T getDato() {
        return this.dato;
    }

    @Override
    public void setDato(T dato) {
        this.dato = dato;

    }

    @Override
    public INodo<T> getIzquierdo() {
        return this.izquierdo;
    }

    @Override
    public void setIzquierdo(INodo<T> izquierdo) {
        this.izquierdo = izquierdo;

    }

    @Override
    public INodo<T> getDerecho() {
        return this.derecho;
    }

    @Override
    public void setDerecho(INodo<T> derecho) {
        this.derecho = derecho;

    }

}