package com.Anjali;

public class SimplePattern {
    /*
     1)          *****
                 *****
                 *****
                 *****
                 *****
     */
    public static void main(String[] args) {
        System.out.println("1.");
       for (int i = 0; i < 5; i++) {
           for (int j = 0; j < 5; j++) {
               System.out.print("*");

           }
           System.out.println();
       }


         System.out.println("______________________________________");
        System.out.println("2.");
        /*
         2)
                     *
                     **
                     ***
                     ****
         */
       for (int i = 1; i <= 5; i++) {
           for (int j = 1; j <=i; j++) {
               System.out.print("*");

           }
           System.out.println();
       }


         System.out.println("______________________________________");
        System.out.println("3.");
        /*
        3)
                     *****
                     ****
                     ***
                     **
                     *
         */
       for (int i = 5; i >=1; i--) {
           for (int j = 1; j <=i; j++) {
               System.out.print("*");

           }
           System.out.println();
       }
       System.out.println("______________________________________");
System.out.println("4.");

       /*
       4)
                        1
                        12
                        123
                        1234
                        12345
        */
       for (int i = 1; i <=5; i++) {
           for (int j = 1; j <=i; j++) {
               System.out.print(j+" " );

           }
           System.out.println();
       }
       System.out.println("______________________________________");
System.out.println("5.");

        /*
        5)
                     *
                     **
                     ***
                     ****
                     *****
                     ****
                     ***
                     **
                     *

         */
      for (int i = 1; i <= 5; i++) {
           for (int j = 1; j <=i; j++) {
               System.out.print("*");

           }
           System.out.println();
       }
       for (int i = 4; i >=1; i--) {
           for (int j = 1; j <= i; j++) {
               System.out.print("*");

           }
           System.out.println();
       }
       System.out.println("______________________________________");
System.out.println("6");

        /*
        6)
                 *
                 **
                 ***
                 ****
                 *****

         */
       for (int i = 5; i >=1; i--) {
           for (int k = 1; k <=i ; k++) {
               System.out.print(" ");
           }
           for (int j = 1; j <=(5-(i-1)); j++) {
               System.out.print("*");
           }
           System.out.println();
       }



        System.out.println("______________________________________");
        System.out.println("7.");
        /*
        7)
                 *****
                 ****
                 ***
                 **
                 *

         */
      for (int i = 1; i <=5; i++) {
           for (int k = 1; k <=i ; k++) {
               System.out.print(" ");
           }
           for (int j = 1; j <=(5-(i-1)); j++) {
               System.out.print("*");
           }
           System.out.println();
       }


        System.out.println("______________________________________");
        System.out.println("8.");

        /*
        8)
                      *
                     ***
                    *****
                   *******
                  *********
         */

        int n = 0;
        for (int i = 5; i >= 1; i--) {

            for (int k = 1; k <= i; k++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= ((5 - (i - 1)) + n); j++) {
                System.out.print("*");
            }
            n = n + 1;
            System.out.println();
        }
        System.out.println("______________________________________");
        System.out.println("9.");
        /*
            9)
                    *********
                     *******
                      *****
                       ***
                        *
         */

        int n2 = 5;
        for (int i = 1; i <=5; i++) {
            for (int k = 1; k <=i ; k++) {
                System.out.print(" ");
            }
            for (int j = 1; j <=(5-(i-1))+5-i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
     /*   6)
                  *
                 * *
                * * *
               * * * *
              * * * * *

         */
        System.out.println("______________________________________");
        System.out.println("10.");
        for (int i = 5; i >=1; i--) {
           for (int k = 1; k <=i ; k++) {
               System.out.print(" ");
           }
           for (int j = 1; j <=(5-(i-1)); j++) {
               System.out.print("* ");
           }
           System.out.println();
       }
       /*
        7)
              * * * * *
               * * * *
                * * *
                 * *
                  *

         */
        System.out.println("______________________________________");
        System.out.println("11.");
        for (int i = 1; i <=5; i++) {
           for (int k = 1; k <=i ; k++) {
               System.out.print(" ");
           }
           for (int j = 1; j <=(5-(i-1)); j++) {
               System.out.print("* ");
           }
           System.out.println();
       }

}


}


