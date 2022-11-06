package com.example.durga_soft_practice;
import java.util.Scanner;
public class calculator {
    public static void main(String[] args) {
        Scanner permit = new Scanner(System.in);


        // main heading


        System.out.println("----------------------------------------------------------------------");
        System.out.println("                      \uD83D\uDE4F WELCOME  \uD83D\uDE4F");
        System.out.println("----------------------------------------------------------------------");
        System.out.println("                       CALCULATOR "); // main heading
        System.out.println("----------------------------------------------------------------------");
        System.out.print("TOTAL NUMBER = ");
        int Totalnumber = permit.nextInt();
        System.out.println("----------------------------------------------------------------------");


//-------------------------------------- giving list of operaions----------------------------------------------------------------------------------------------------------------------------

        System.out.println("                       SELECT OPERATION"); // main heading
        System.out.println("----------------------------------------------------------------------");
        System.out.println("(1) ADDITION (+)");
        System.out.println("(2) SUBTRACTION (-)");
        System.out.println("(3) MULTIPLICATION (*)");
        System.out.println("(4) DIVISION (/)");
        System.out.println("(5) REMINDER (%)");
        System.out.println("----------------------------------------------------------------------");

//--------------------------------------TAKING OPERATION INDEX ----------------------------------------------------------------------------------------------------------------------------


        System.out.print("ENTER YOUR OPERATION [INDEX NUMBER] = ");

        int operation_index_number= permit.nextInt();
        System.out.println("----------------------------------------------------------------------");



//-------------------------------------- ----------performing addition for max no-2------------------------------------------------------------------------------------------------------------------

        if (Totalnumber==2)
        {
            System.out.print("• ENTER 1ST VALUE = ");
            double num2_1 = permit.nextDouble();
            System.out.print("• ENTER 2ND VALUE = ");
            double num2_2 = permit.nextDouble();


            switch (operation_index_number)
            {


                // addition
                case 1:
                    double result_2_add=num2_1+num2_2;
                    System.out.println("----------------------------------------------------------------------");
                    System.out.println("• RESULT = "+ result_2_add);
                    break;


                    // subtraction

                case 2:
                    double result_2_sub=num2_1-num2_2;
                    System.out.println("----------------------------------------------------------------------");
                    System.out.println("• RESULT = "+ result_2_sub);
                    break;


                    // multiplication

                case 3:
                    double result_2_multiply=num2_1*num2_2;
                    System.out.println("----------------------------------------------------------------------");
                    System.out.println("• RESULT = "+ result_2_multiply);
                    break;

                    // division


                case 4:
                    double result_2_divide=num2_1/num2_2;
                    System.out.println("----------------------------------------------------------------------");
                    System.out.println("• RESULT = "+ result_2_divide);
                    break;

                    // reminder
                case 5:
                    double result_2_reminder=num2_1%num2_2;
                    System.out.println("----------------------------------------------------------------------");
                    System.out.println("• REMINDER = "+ result_2_reminder);
                    break;

            }
        }

        //-------------------------------------- ----------performing addition for max no-3------------------------------------------------------------------------------------------------------------------


        if (Totalnumber==3)
        {
            System.out.print("• ENTER 1ST VALUE = ");
            double num3_1 = permit.nextDouble();
            System.out.print("• ENTER 2ND VALUE = ");
            float num3_2 = permit.nextFloat();
            System.out.print("• ENTER 3RD VALUE = ");
            double num3_3 = permit.nextDouble();


            switch (operation_index_number)
            {


                // addition
                case 1:
                    double result_3_add=num3_1+num3_2+num3_3;
                    System.out.println("----------------------------------------------------------------------");
                    System.out.println("• RESULT = "+ result_3_add);
                    break;


                // subtraction

                case 2:
                    double result_3_sub=num3_1-num3_2-num3_3;
                    System.out.println("----------------------------------------------------------------------");
                    System.out.println("• RESULT = "+ result_3_sub);
                    break;


                // multiplication

                case 3:
                    double result_3_multiply=num3_1*num3_2*num3_3;
                    System.out.println("----------------------------------------------------------------------");
                    System.out.println("• RESULT = "+ result_3_multiply);
                    break;

                // division


                case 4:
                    double result_3_divide=num3_1/num3_2/num3_3;
                    System.out.println("----------------------------------------------------------------------");
                    System.out.println("• RESULT = "+ result_3_divide);
                    break;



            }
        }


        //-------------------------------------- ----------performing addition for max no-4------------------------------------------------------------------------------------------------------------------


        if (Totalnumber==4)
        {
            System.out.print("• ENTER 1ST VALUE = ");
            double num4_1 = permit.nextDouble();
            System.out.print("• ENTER 2ND VALUE = ");
            double num4_2 = permit.nextDouble();
            System.out.print("• ENTER 3RD VALUE = ");
            double num4_3 = permit.nextDouble();
            System.out.print("• ENTER 4TH VALUE = ");
            double num4_4 = permit.nextDouble();


            switch (operation_index_number)
            {


                // addition
                case 1:
                    double result_4_add=num4_1+num4_2+num4_3+num4_4;
                    System.out.println("----------------------------------------------------------------------");
                    System.out.println("• RESULT = "+ result_4_add);
                    break;


                // subtraction

                case 2:
                    double result_4_sub=num4_1-num4_2-num4_3-num4_4;
                    System.out.println("----------------------------------------------------------------------");
                    System.out.println("• RESULT = "+ result_4_sub);
                    break;


                // multiplication

                case 3:
                    double result_4_multiply=num4_1*num4_2*num4_3*num4_4;
                    System.out.println("----------------------------------------------------------------------");
                    System.out.println("• RESULT = "+ result_4_multiply);
                    break;

                // division


                case 4:
                    double result_4_divide=num4_1/num4_2/num4_3/num4_4;
                    System.out.println("----------------------------------------------------------------------");
                    System.out.println("• RESULT = "+ result_4_divide);
                    break;



            }
        }



















        /*switch (Totalnumber) {
            case 2: {
                System.out.print("ENTER 1ST VALUE = ");
                float num2_1 = permit.nextFloat();
                System.out.print("ENTER 2ND VALUE = ");
                float num2_2 = permit.nextFloat();
            }
            break;
            case 3: {
                System.out.print("ENTER 1ST VALUE = ");
                float num3_1 = permit.nextFloat();
                System.out.print("ENTER 2ND VALUE = ");
                float num3_2 = permit.nextFloat();
                System.out.print("ENTER 3RD VALUE = ");
                float num3_3 = permit.nextFloat();
            }
            break;
            case 4: {
                System.out.print("ENTER 1ST VALUE = ");
                float num4_1 = permit.nextInt();
                System.out.print("ENTER 2ND VALUE = ");
                float num4_2 = permit.nextInt();
                System.out.print("ENTER 3RD VALUE = ");
                float num4_3 = permit.nextInt();
                System.out.print("ENTER 4TH VALUE = ");
                float num4_4 = permit.nextInt();
            }
            break;
            case 5: {
                System.out.print("ENTER 1ST VALUE = ");
                float num5_1 = permit.nextFloat();
                System.out.print("ENTER 2ND VALUE = ");
                float num5_2 = permit.nextFloat();
                System.out.print("ENTER 3RD VALUE = ");
                float num5_3 = permit.nextFloat();
                System.out.print("ENTER 4TH VALUE = ");
                float num5_4 = permit.nextFloat();
                System.out.print("ENTER 5TH VALUE = ");
                float num5_5 = permit.nextFloat();
            }
            break;

            case 6: {
                System.out.print("ENTER 1ST VALUE = ");
                float num6_1 = permit.nextFloat();
                System.out.print("ENTER 2ND VALUE = ");
                float num6_2 = permit.nextFloat();
                System.out.print("ENTER 3RD VALUE = ");
                float num6_3 = permit.nextFloat();
                System.out.print("ENTER 4TH VALUE = ");
                float num6_4 = permit.nextFloat();
                System.out.print("ENTER 5TH VALUE = ");
                float num6_5 = permit.nextFloat();
                System.out.print("ENTER 6TH VALUE = ");
                float num6_6 = permit.nextFloat();
            }
            break;
        }
    

        System.out.println("----------------------------------------------------------------------");
        System.out.println("                       SELECT OPERATION"); // main heading
        System.out.println("----------------------------------------------------------------------");
        System.out.println("(1) ADDITION");
        System.out.println("(2) SUBTRACTION");
        System.out.println("(3) MULTIPLICATION");
        System.out.println("(4) DIVISION");
        System.out.println("(5) REMINDER");
        System.out.println("----------------------------------------------------------------------");

        System.out.print("ENTER INDEX OF OPERATOR = ");
        int operator_index= permit.nextInt();
        
            if (operator_index==1 && Totalnumber==2)
            {
                int num2_1 = 0;
                int num2_2 = 0;
                int add_num_max2= num2_1+num2_2;
                System.out.print("RESULT = ");
                System.out.println(add_num_max2);}*/
                        

                        
            
    }


    }

