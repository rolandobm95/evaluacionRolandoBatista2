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
        //Validacion y entrada de datos
        do{
            System.out.print("Por favor, ingrese la posicion inicial: ");
            pos_inicial = scanner.next();
            if(pos_inicial.length() == 2){
                if(conjunto_columna.contains(pos_inicial.charAt(0)) && conjunto_fila.contains(pos_inicial.charAt(1))){
                    break;
                }else{
                    System.out.println("La posicion no es valida");
                }
            }else{
                System.out.println("La posición debe tener dos caracteres.");
            }
        }while(true);
        do{
            System.out.print("Por favor, ingrese la posicion final: ");
            pos_final = scanner.next();
            if(pos_final.length() == 2){
                if(conjunto_columna.contains(pos_final.charAt(0)) && conjunto_fila.contains(pos_final.charAt(1))){
                    if (!pos_inicial.equals(pos_final)){
                        break;
                    }else{
                        System.out.println("Las posiciones inicial y final no pueden ser iguales");
                    }
                }else{
                    System.out.println("La posicion no es valida");
                }
            }else{
                System.out.println("La posición debe tener dos caracteres.");
            }
        }while(true);


        if(ajedrez.MovimientoValido(pos_inicial,pos_final)){
            System.out.println("El movimiento es valido");
        } else {
            System.out.println("El movimiento no es valido");
        }

    }
}