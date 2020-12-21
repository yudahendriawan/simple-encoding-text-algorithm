/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package volume.text;

import java.util.Scanner;

/**
 *
 * @author pc
 */
public class VolumeText {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);

        System.out.println("---> a simple encoding of a large volume of text <----\n");

        System.out.println("Given a Normal Matrix below : ");
        
        //initialize the size of matrix
        String[][] matrix = new String[4][10];
        DataMatrix.normalMatrix(matrix);

        System.out.println("\nPlease choose this below character to give an action you want to do "
                + ":\n\nh to Horizontal Flip\nv to Vertical Flip"
                + "\na number (-40 to 40) for Shift (positive for right-shift and negative for left-shift)"
                + "\n0 for chained transformation");
        System.out.print("\nInsert the charachter you are choosen : ");
        String getCharacter = input.nextLine();

        boolean check = true;

        while (check) {
            if (getCharacter.equals("h")) {
                System.out.println("The result of Horizontal Flip is given below : ");
                
                for (int i = 0; i < 4; i++) {
                    for (int j = 0; j < 10; j++) {
                        System.out.print(HorizontalFlip.horizontalFlip(matrix)[i][j] + " ");
                    }
                    System.out.println("");
                }
                check = false;
            } else if (getCharacter.equals("v")) {
                System.out.println("The result of Vertical Flip is given below : ");

                for (int i = 0; i < 4; i++) {
                    for (int j = 0; j < 10; j++) {
                        System.out.print(VerticalFlip.verticalFlip(matrix)[i][j] + " ");
                    }
                    System.out.println("");
                }
                check = false;

            } else if (isNumeric(getCharacter) && !getCharacter.equals("0")) {
                System.out.println("The result of Shift by N = "+getCharacter+" is given below : ");
                int numbers = Integer.parseInt(getCharacter);
                if (numbers >= -40 && numbers <= 40) {
                    for (int i = 0; i < 4; i++) {
                        for (int j = 0; j < 10; j++) {
                            System.out.print(Shift.shift(matrix, numbers)[i][j] + " ");
                        }
                        System.out.println("");
                    }
                } else {
                    System.out.println("\n[[[[ the number is not in range ]]]"
                            + "\nPlease try to choose number between -40 and 40");
                    DataMatrix.normalMatrix(matrix);
                }
                check = false;

            } else if (getCharacter.equals("0")) {
                System.out.println("\nEnter the character of h,v,"
                        + "or a number to do chained transformation\n"
                        + "for example = v,h,-1,h");
                System.out.println("Enter : ");
                String transforms = input.nextLine();
                String[] charInput = transforms.split(",");
//                System.out.println(charOfInstruction[2]);
                String[][] tempResult = new String[4][10];
                //String[][] latestResult = new String[4][10];
                
                tempResult = matrix;
                
                for(int i = 0; i < charInput.length; i++){
                    if(charInput[i].equals("h")){
                        tempResult = HorizontalFlip.horizontalFlip(tempResult);
                    }
                    else if(charInput[i].equals("v")){
                        tempResult = VerticalFlip.verticalFlip(tempResult);
                      
                    }
                    else if(isNumeric(charInput[i])){
                        int shiftNum = Integer.parseInt(charInput[i]);
                        tempResult = Shift.shift(tempResult, shiftNum);
                    }
                    else{
                        System.out.println("It might be uncategorized inputed ");
                        DataMatrix.normalMatrix(matrix);
                    }
                }
                System.out.println("\n\n Chained Result : ");
                 for (int i = 0; i < 4; i++) {
                        for (int j = 0; j < 10; j++) {
                            System.out.print(tempResult[i][j] + " ");
                        }
                        System.out.println("");
                    }
                
                check = false;

            } else {
                System.out.println("Character is unrecognized : ");
                DataMatrix.normalMatrix(matrix);
                check = false;
            }
        }

    }

//to check wether the input is numeric or not
    public static boolean isNumeric(String strNum) {
        if (strNum == null) {
            return false;
        }
        try {
            int d = Integer.parseInt(strNum);
        } catch (NumberFormatException nfe) {
            return false;
        }
        return true;
    }

}
