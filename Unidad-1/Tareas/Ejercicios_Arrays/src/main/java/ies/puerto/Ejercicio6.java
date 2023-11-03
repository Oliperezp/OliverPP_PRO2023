package ies.puerto;



public class Ejercicio6 {


    /**
     * Funcion que coge una matriz original y la invierte en otro array llamado matrizTranspuesta
     */
    public int[][] matrizOriginal(int array[][]) {

        int[][] matrizOriginal = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        int[][] matrizTraspuesta = new int[3][3];


        int filas = matrizOriginal.length;
        int columnas = matrizOriginal[0].length;


        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                matrizTraspuesta[j][i] = matrizOriginal[i][j];
            }
        }


        return matrizTraspuesta;
    }

    /**
     * Funcion que muestra la matriz
     * @param matriz
     */
    public void mostrarMatriz(int[][] matriz) {
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[0].length; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
        }


    }

}
