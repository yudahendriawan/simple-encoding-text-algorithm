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
public class Shift {
    //methods for shifting matrix
    public static String[][] shift(String[][] matrix, int N) {
        String[][] shiftedMatrix = new String[4][10];
        String[] tempMatrixElement = new String[40];
        //creating 1x40 array to store all data to ease shifting
        //   String[][] tempMatrix = new String[1][40];
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 10; j++) {
                if (i == 0) {
                    tempMatrixElement[j] = matrix[i][j];
                } else if (i == 1) {
                    tempMatrixElement[10 + j] = matrix[i][j];
                } else if (i == 2) {
                    tempMatrixElement[20 + j] = matrix[i][j];
                } else if (i == 3) {
                    tempMatrixElement[30 + j] = matrix[i][j];
                }

            }
        }

        String[] shiftArray = new String[40];

        //for right-shifted
        if (N > 0) {
            for (int i = 0; i < 40; i++) {
                if (i + N < 40) {
                    shiftArray[i + N] = tempMatrixElement[i];
                } else if (i + N >= 40) {
                    for (int k = 0; k < N; k++) {
                        shiftArray[k] = tempMatrixElement[40 - N + k];
                    }
                }
            }
        } //for left-shifted
        else {
            for (int i = 0; i < 40; i++) {
                if (i - N < 40) {
                    shiftArray[i] = tempMatrixElement[i - N];
                } else {
                    for (int k = 0; k < Math.abs(N); k++) {
                        shiftArray[40 + N + k] = tempMatrixElement[k];
                    }
                }
            }
        }
        
       
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 10; j++) {
                if (i == 0) {
                    shiftedMatrix[i][j] = shiftArray[j];
                } else if (i == 1) {
                    shiftedMatrix[i][j] = shiftArray[j + 10];
                } else if (i == 2) {
                    shiftedMatrix[i][j] = shiftArray[j + 20];
                } else {
                    shiftedMatrix[i][j] = shiftArray[j + 30];
                }

            }
        }

        return shiftedMatrix;
    }
}
