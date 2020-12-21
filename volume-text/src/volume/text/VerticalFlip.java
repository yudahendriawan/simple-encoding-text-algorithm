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
public class VerticalFlip {
     public static String[][] verticalFlip(String[][] matrix) {
        String[][] verMatrix = new String[4][10];
        for (int i = 0; i < 4; i++) {
            System.arraycopy(matrix[3 - i], 0, verMatrix[i], 0, 10);
        }
        return verMatrix;
    }
}
