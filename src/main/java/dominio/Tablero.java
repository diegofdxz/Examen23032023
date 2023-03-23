package dominio;
/*
Implemente una versión del juego de la vida2
con las siguientes característi￾cas:
1. Las reglas son las habituales:
a) Si una célula está viva y dos o tres de sus vecinas también lo están,
entonces continúa viva en el estado siguiente.
b) Si una célula está muerta y tres de sus vecinas están vivas, enton￾ces pasa a estar viva en el estado siguiente.
c) El resto de células pasan a estar muertas en el estado siguiente.
2. Asuma un tablero con 30 celdas (células).
3. El estado inicial del tablero estará almacenado en un fichero (llamado
matriz) con 30 filas y 30 columnas en que cada celda será un uno o un
cero.
 */

public class Tablero {
        private static int DIMENSION = 30;
        private int[][] estadoActual; //matriz que representa el
        // estado actual.
        private int[][] estadoSiguiente = new int[DIMENSION][DIMENSION];

        /********************************************************
         * Lee el estado inicial de un fichero llamado ‘matriz‘.
         ********************************************************/
        int N = 30;
        public Tablero() {
                this.estadoActual = new int[N][N]; // inicializa el estadoActual con un arreglo de 0's
        }

        public void leerEstadoInicial() {
                // La secuencia de ceros y unos del fichero es guardada
                // en ‘estadoActual‘ y, utilizando las reglas del juego
                // de la vida, se insertan los ceros y unos
                // correspondientes en ‘estadoSiguiente‘.
                /********************************************************
                 * Genera un estado inicial aleatorio. Para cada celda
                 * genera un número aleatorio en el intervalo [0, 1). Si
                 * el número es menor que 0,5, entonces la celda está
                 * inicialmente viva. En caso contrario, está muerta.
                 *******************************************************/


        }

        public void generarEstadoActualPorMontecarlo() {
                // La secuencia de ceros y unos generada es guardada
                // en ‘estadoActual‘ y, utilizando las reglas del juego
                // de la vida, se insertan los ceros y unos
                // correspondientes en ‘estadoSiguiente‘.
                /********************************************************
                 * Transita al estado siguiente según las reglas del
                 * juego de la vida.
                 ********************************************************/


        }

        public void transitarAlEstadoSiguiente() {

        }
        /*A continuación se muestra el resultado del método toString() de la
clase Tablero.java para el tablero de la matriz de ceros y unos presentada
anteriormente:
x
x x
xx
*/

        @Override
        public String toString() {
                String resultado = "";
                for (int i = 0; i < DIMENSION; i++) {
                        for (int j = 0; j < DIMENSION; j++) {
                                if (estadoActual[i][j] == 1) {
                                        resultado += "x";
                                } else {
                                        resultado += " ";
                                }
                        }
                        resultado += (Math.random() < 0.5) ? "x" : " ";
                }
                return resultado;
        }
}



