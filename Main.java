import java.sql.SQLOutput;
import java.util.SortedSet;

public class Main {

    public static void main(String[] args) {

        Arbol<Persona>arbolDnis = new Arbol<Persona>(new ComparadorDePersonasPorDni());
        Arbol<Persona>arbolNombres = new Arbol<Persona>(new ComparadorDePersonasPorNombre());

        Persona daniela = new Persona(100,"Daniela");
        Persona alejandro = new Persona(50,"Alejandro");
        Persona juan = new Persona (150,"Juan");
        Persona maria = new Persona(25,"Maria");
        Persona elena = new Persona(75,"Elena");
        Persona pepe = new Persona (80,"Pepe");
        Persona jaime = new Persona(130,"Jaime");
        Persona carlos = new Persona(10,"Carlos");
        Persona gabriela = new Persona(65,"Gabriela");



        arbolDnis.insertar(daniela);
        arbolDnis.insertar(alejandro);
        arbolDnis.insertar(juan);
        arbolDnis.insertar(maria);
        arbolDnis.insertar(elena);
        arbolDnis.insertar(pepe);
        arbolDnis.insertar(jaime);
        arbolDnis.insertar(carlos);
        arbolDnis.insertar(gabriela);


        System.out.println("Arbol por DNI: ");
        System.out.println("Arbol por dni formato IN orden : " );
        arbolDnis.recorridoInorden();
        System.out.println("Arbol por dni formato PRE orden : " );
        arbolDnis.recorridoPreorden();
        System.out.println("Arbol por dni formato POST orden : " );
        arbolDnis.recorridoPostorden();



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
        System.out.println("Arbol por dni formato IN orden : " );
        arbolNombres.recorridoInorden();
        System.out.println("Arbol por dni formato PRE orden : " );
        arbolNombres.recorridoPreorden();
        System.out.println("Arbol por dni formato POST orden : " );
        arbolNombres.recorridoPostorden();




    }

}