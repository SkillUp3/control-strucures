/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package control.structures;

/**
 *
 * @author ian
 */
public class ControlStructures {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int value = 3;
//        if(value == 1){
//            System.out.println("value was 1");
//        }else if(value ==2){
//            System.out.println("value was 2");
//
//        }else {
//            System.out.println("was not 1 or 2");
//
//        }

//        switch (value) {
//            case 1:
//                System.out.println("value was 1");
//                break;
//
//            case 2:
//                System.out.println("value was 1");
//                break;
//
//            case 3:
//            case 4:
//            case 5:
//                System.out.println("value is 3, 4 , or 5");
//                break;
//            default:
//                System.out.println("not any of the numbers");
//                break;
//
//        }
//for(initialzer,terminator,increment/deccrement)
//        for (int i = 1; i <= 5; i++) {
//            System.out.println("Hello World");
//        }
//        System.out.println("10,000 at 2% interest = " + calculateInterest(10000.0, 2.0));
//        System.out.println("10,000 at 3% interest = " + calculateInterest(10000.0, 3.0));
//        System.out.println("10,000 at 4% interest = " + calculateInterest(10000.0, 4.0));
//        System.out.println("10,000 at 5% interest = " + calculateInterest(10000.0, 5.0));
        // using the for statement, call the calculateInterest method with
        // the amount of 10000 with an interestRate of 2,3,4,5,6,7, and 8
        // and print the results to the console window
//        for (int i = 2; i <= 9; i++) {
//            System.out.println("10,000 at" + i + "% interest =" + String.format("%.2f", calculateInterest(10000, i)));
//        }
//        int count = 1;
//        while (count!=6){
//            System.out.println("Count value =" + count);
//            count++;
//        }
//        for (int i = 1; i <= 5; i++) {
//            System.out.println("Count value =" + i);
//        }
//        do {
//            System.out.println("Count value =" + count);
//            count++;
//        } while (count != 6);
        int number = 5;
        int finishNumber = 20;
        while(number <= finishNumber){
            if(!isEvenNumber(number)){
                number++;
                continue;
                  
            }
            System.out.println("Even number" + number);
            number++;
        }

    }

    private static double calculateInterest(double amount, double interestRate) {
        int increaseRate = 3;
        return (amount * (interestRate / 100));
    }

    private static boolean isEvenNumber(int number) {
        if(number %2 == 0){
            return true;
        }else{
            return false;
        }
    }

}
