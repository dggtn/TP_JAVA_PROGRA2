import java.util.Comparator;

public class Arbol<T> {

    private Comparator<T> comparator;

    private INodo<T> raiz;

    public void insertar(T dato) {
        raiz = insertarRecursivo(raiz, dato);
    }

    public Arbol(Comparator<T> comparator) {
        this.comparator = comparator;
        this.raiz = null;
    }

    private INodo<T> insertarRecursivo(INodo<T> nodo, T dato) {
        if (nodo == null) {
            return new Nodo<T>(dato);
        }

        int comparacion = comparator.compare(dato, nodo.getDato());

        if (comparacion < 0) {
            nodo.setIzquierdo(insertarRecursivo(nodo.getIzquierdo(), dato));
        } else if (comparacion > 0) {
            nodo.setDerecho(insertarRecursivo(nodo.getDerecho(), dato));
        } else {
            return nodo; // No se permiten duplicados
        }

        return nodo;
    }


    public void recorridoInorden() {
        recorridoInordenRecursivo(raiz);
    }

    private void recorridoInordenRecursivo(INodo<T> nodo) {
        if (nodo != null) {
            recorridoInordenRecursivo(nodo.getIzquierdo());
            System.out.println(nodo.getDato() + " ");
            recorridoInordenRecursivo(nodo.getDerecho());
        }
    }


    public void recorridoPreorden() {
        recorridoPreordenRecursivo(raiz);
    }

    private void recorridoPreordenRecursivo(INodo<T> nodo) {
        if (nodo != null) {
            System.out.println(nodo.getDato() + " ");
            recorridoPreordenRecursivo(nodo.getIzquierdo());
            recorridoPreordenRecursivo(nodo.getDerecho());
        }
    }

    public void recorridoPostorden() {
        recorridoPostordenRecursivo(raiz);
    }

    private void recorridoPostordenRecursivo(INodo<T> nodo) {
        if (nodo != null) {
            recorridoPostordenRecursivo(nodo.getIzquierdo());
            recorridoPostordenRecursivo(nodo.getDerecho());
            System.out.println(nodo.getDato() + " ");
        }
    }


    public INodo<T> buscar(T dato) {
        return buscarRecursivo(raiz, dato);
    }

    private INodo<T> buscarRecursivo(INodo<T> nodo, T dato) {

        if (nodo == null) return null;

        int comparacion = comparator.compare(dato, nodo.getDato());

        if (comparacion == 0) {
            return nodo;
        }

        if (comparacion < 0) {
            return buscarRecursivo(nodo.getIzquierdo(), dato);
        } else {
            return buscarRecursivo(nodo.getDerecho(), dato);
        }
    }

    public void eliminar(T dato) {
        raiz = eliminarRec(raiz, dato);
    }

    private INodo eliminarRec(INodo<T> nodo, T dato) {
        if (nodo == null) return null;
        int comparacion = comparator.compare(dato, nodo.getDato());

        if (comparacion < 0) {
            nodo.setIzquierdo(eliminarRec(nodo.getIzquierdo(), dato));
        } else if (comparacion > 0) {
            nodo.setDerecho(eliminarRec(nodo.getDerecho(), dato));
        } else {
            // Caso 1: nodo sin hijos
            if (nodo.getIzquierdo() == null && nodo.getDerecho() == null) {
                return null;
            }
            // Caso 2: un solo hijo
            if (nodo.getIzquierdo() == null) {
                return nodo.getDerecho();
            }
            if (nodo.getDerecho() == null) {
                return nodo.getIzquierdo();
            }

            // Caso 3: dos hijos
            INodo<T> sucesor = encontrarMinimo(nodo.getDerecho());
            nodo.setDato(sucesor.getDato());
            nodo.setDerecho(eliminarRec(nodo.getDerecho(), sucesor.getDato()));
        }
        return nodo;
    }

    private INodo encontrarMinimo(INodo<T> nodo) {
        while (nodo.getIzquierdo() != null) {
            nodo = nodo.getIzquierdo();
        }
        return nodo; //clavijo
    }
}
