/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package volume.text;

/**
 *
 * @author pc
 */
public class DataMatrix {
    //method for initializing normal matrix using keyboard character as an input
    public static void normalMatrix(String[][] matrix) {
        String[] firstRow = {"1", "2", "3", "4", "5", "6", "7", "8", "9", "0"};
        String[] secondRow = {"q", "w", "e", "r", "t", "y", "u", "i", "o", "p"};
        String[] thirdRow = {"a", "s", "d", "f", "g", "h", "j", "k", "l", ";"};
        String[] forthRow = {"z", "x", "c", "v", "b", "n", "m", ",", ".", "/"};
        
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 10; j++) {
                if (i == 0) {
                    matrix[i][j] = firstRow[j];
                } else if (i == 1) {
                    matrix[i][j] = secondRow[j];
                } else if (i == 2) {
                    matrix[i][j] = thirdRow[j];
                } else if (i == 3) {
                    matrix[i][j] = forthRow[j];
                }
            }
        }
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 10; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println("");
        }
    }
}
