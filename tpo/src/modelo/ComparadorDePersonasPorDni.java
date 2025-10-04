package modelo;

import java.util.Comparator;

public class ComparadorDePersonasPorDni implements Comparator<Persona> {
    @Override
    public int compare(Persona o1, Persona o2) {
        return o1.dni.compareTo(o2.dni);
    }
}
