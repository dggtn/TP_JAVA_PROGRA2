package interfaz;

import modelo.Nodo;

import java.util.Comparator;

public interface IArbol<T> {
    void insertar(T dato);
    void recorridoInorden();
    void recorridoPreorden();
    void recorridoPostorden();
    INodo<T> buscar(T dato);
    void eliminar(T dato);

}
