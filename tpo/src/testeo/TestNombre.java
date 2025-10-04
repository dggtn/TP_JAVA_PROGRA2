package testeo;

import modelo.Arbol;
import modelo.ComparadorDePersonasPorNombre;
import modelo.Persona;
import interfaz.INodo;
import modelo.Arbol;
import modelo.ComparadorDePersonasPorDni;
import modelo.ComparadorDePersonasPorNombre;
import modelo.Persona;

public class TestNombre {
    public static void main(String[] args) {

        Arbol<Persona> arbolNombres = new Arbol<Persona>(new ComparadorDePersonasPorNombre());
        Persona daniela = new Persona(100, "D");
        Persona alejandro = new Persona(50, "A");
        Persona juan = new Persona(150, "J");
        Persona maria = new Persona(25, "M");
        Persona elena = new Persona(75, "E");
        Persona pepe = new Persona(80, "P");
        Persona jaime = new Persona(130, "O");
        Persona carlos = new Persona(10, "C");
        Persona gabriela = new Persona(65, "G");


        arbolNombres.insertar(daniela);
        arbolNombres.insertar(alejandro);
        arbolNombres.insertar(juan);
        arbolNombres.insertar(maria);
        arbolNombres.insertar(elena);
        arbolNombres.insertar(pepe);
        arbolNombres.insertar(jaime);
        arbolNombres.insertar(carlos);
        arbolNombres.insertar(gabriela);

        System.out.println("Arbol por NOMBRES: ");
        System.out.println("               ");
        System.out.println("               ");
        System.out.println("Arbol por nombre formato IN orden : ");
        System.out.println("               ");
        System.out.println("               ");
        arbolNombres.recorridoInorden();
        System.out.println("--------------------------------");
        System.out.println("               ");
        System.out.println("Arbol por nombre formato PRE orden : ");
        System.out.println("               ");
        System.out.println("               ");
        arbolNombres.recorridoPreorden();

        System.out.println("--------------------------------");
        System.out.println("               ");
        System.out.println("Arbol por nombre formato POST orden : ");
        System.out.println("               ");
        System.out.println("               ");

        arbolNombres.recorridoPostorden();
        System.out.println("--------------------------------");
        System.out.println("               ");

        System.out.println("Elimino a :" + daniela.getNombre());
        arbolNombres.eliminar(daniela);
        arbolNombres.recorridoInorden();
    }
}