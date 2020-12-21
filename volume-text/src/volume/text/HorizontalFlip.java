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
public class HorizontalFlip {
   public static String[][] horizontalFlip(String[][] matrix) {
        String[][] horMatrix = new String[4][10];
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 10; j++) {
                horMatrix[i][j] = matrix[i][9 - j];
            }
        }
        return horMatrix;
    }
}
