public class Ajedrez {
    private String posicion_inicial;
    private String posicion_final;

    public Ajedrez() {
    }

    public Ajedrez(String posicion_inicial, String posicion_final) {
        this.posicion_inicial = posicion_inicial;
        this.posicion_final = posicion_final;
    }

    public int[] Valor_columna_fila(String posicion) {
        //Metodo para extraer del la posiciones la fila y la columna y convertirla a valor numerico
        int[] columna_fila = new int[2]; //Array para almacenar os valores numericos de fila y columna

        columna_fila[0] = posicion.charAt(0) - 'a' + 1;
        columna_fila[1] = Character.getNumericValue(posicion.charAt(1));

        return columna_fila;
    }

    public boolean MovimientoValido(String posicion_inicial, String posicion_final) {
        //Metodo para evaluar si el movimiento es valido
        int[] posicion_inicial_numerica = new int[2];
        int[] posicion_final_numerica = new int[2];
        //Almacenar en los arrays los valores numericos de fila y columna
        posicion_inicial_numerica = Valor_columna_fila(posicion_inicial);
        posicion_final_numerica = Valor_columna_fila(posicion_final);

        // Verificar si el movimiento es en diagonal
        int distancia_columna = Math.abs(posicion_final_numerica[0] - posicion_inicial_numerica[0]);
        int distancia_fila = Math.abs(posicion_final_numerica[1] - posicion_inicial_numerica[1]);

        return distancia_fila == distancia_columna;
    }


}









