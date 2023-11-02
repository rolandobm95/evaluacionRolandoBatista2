import java.util.Scanner;
import java.util.Set;
import java.util.HashSet;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //Se instancia la clase Ajedrez
        Ajedrez ajedrez = new Ajedrez();
        String pos_inicial, pos_final;
        //Conjuntos de valores posibles de fila y columna
        Set<Character> conjunto_columna = new HashSet<>(Set.of('a','b','c','d','e','f','g','h'));
        Set<Character> conjunto_fila = new HashSet<>(Set.of('1','2','3','4','5','6','7','8'));

        System.out.println("Ingrese las posiciones en formato (letra numero)");
        System.out.println("Ejemplo: a2, d7, h3");

            System.out.print("Por favor, ingrese la posicion inicial: ");
            pos_inicial = scanner.next();

            System.out.print("Por favor, ingrese la posicion final: ");
            pos_final = scanner.next();



        if(ajedrez.MovimientoValido(pos_inicial,pos_final)){
            System.out.println("El movimiento es valido");
        } else {
            System.out.println("El movimiento no es valido");
        }

    }
}