//my local package:
package com.JavaCoursePackage;

//import packages
import java.util.Scanner;


public class Basics_section{



//    Methods:
    static void printHello(){
        System.out.printf("hello!\n");
    }



//    Functions:
    static int square(int x){
        return x * x;
    }


//
//    overloading:
    static float square(float x){
        return x * x;
    }

    static int square(int x){
        return x * x;
    }


//    miltiarguments function:
    static public float avg(float...arg){
        float sum=0;
        for(float i:arg){
            sum +=i;
        }
        return sum/arg.length;
    }

//    recursion:
    public static long fact(int n){
        if(n <= 1)
            return 1;
        else
            return n * fact(n-1);
    }
    public static void fun(int n){
        if(n > 0)
            fun(n-1);
        System.out.printf("%d ", n);
    }
    public static int fib(int n){
        if(n <= 1)
            return n;
        else
            return fib(n-1) + fib(n-2);
    }
    public static void first_n_fib(int n){
        if(n > 1)
            first_n_fib(n-1);
        System.out.printf("%d)- [%d -> %d]\n",n, n-1, fib(n-1));
    }

    public static int rec_sum(int n1, int n2){
        if(n1 == n2)
            return n1;
        else
            return n2 + rec_sum(n1, n2-1);
    }


//    passing array to method:
    public static void disp(int[] arr){
        System.out.printf("[");
        for(int i:arr){
            System.out.printf("%d, ", i);
        }
        System.out.printf("]\n");
    }

//    return array:
    public static int[] get_array(int...elements){
        int[] arr = new int[elements.length];
        arr = elements;
        return arr;
    }

    public static void dim(int[][] mat){
        for(int[] row:mat){
            System.out.printf("1x%d\n", row.length);
        }
    }


    public static void disp_mat(int[][] mat){
        for(int[] row:mat){
            for(int i:row){
                System.out.printf("%d  ", i);
            }
            System.out.printf("\n");
        }
    }

    public static int[][] transpose(int[][] mat){
        int[][] newMat = new int[mat[0].length][mat.length];
        for(int i=0 ; i<mat[0].length ; i++){
            for(int j=0 ; j<mat.length ; j++){
                newMat[i][j] = mat[j][i];
            }
        }
        return newMat;
    }




    public static void main(String[] args){

//      output:
        System.out.println("Hello World!");
        System.out.printf("=====================================%n");

//      input:
/*
        nextInt() - reads the next integer from the user
        nextDouble() - reads the next double from the user
        nextLine() - reads the next line of text from the user
        next() - reads the next token from the user
        nextBoolean() - reads the next boolean from the user
        nextFloat() - reads the next float from the user
        nextLong() - reads the next long from the user
        nextShort() - reads the next short from the user
        nextByte() - reads the next byte from the user
 */

//      example:

        Scanner input = new Scanner(System.in);
//
        System.out.print("enter name: ");
        String name = input.nextLine();

        System.out.print("enter x: ");
        int x = input.nextInt();

        System.out.print("enter y: ");
        float y = input.nextFloat();
//
        System.out.printf("x = %d, y = %.2f, name = %S\n", x, y, name);


//      this line comment

/*
        this is
        a block
        comment
*/

//      dataTypes:

        int myFirstNumber = 5;
        float mySecondNumber = 5.5f;
        double myThirdNumber = 5.5;
        char myFourthNumber = 'A';
        boolean myFifthNumber = true;
        short mySixthNumber = 5;
        long mySeventhNumber = 5;
        byte myEighthNumber = 5;
        int __ = 5;
        float $ = 5.500f;
        String myNightNumber = "Hello World!";


//      operators:

        x + y (addition)
        x - y(subtraction)
        x * y(multiplication)
        x / y(division)
        x % y(modulus)
        x++ (increment)
        x-- (decrement)
        x += y(x = x + y)
        x -= y(x = x - y)
        x *= y(x = x * y)
        x /= y(x = x / y)
        x %= y(x = x % y)
        x == y(equal to)
        x != y(not equal to)
        x > y(greater than)
        x < y(less than)
        x >= y(greater than or equal to)
        x <= y(less than or equal to)
        x && y(logical and)
        x || y(logical or)
        !x(logical not)
        x & y(bitwise and)
        x | y(bitwise or)
        x ^ y(bitwise xor)
        ~x(bitwise complement)
        x << y(bitwise left shift)
        x >> y(bitwise right shift)
        x >>> y(bitwise zero fill right shift)


//      if statements:

        System.out.printf("enter a number: ");
        int num = input.nextInt();

        if(num > 0){
            System.out.printf("number is positive!");

            if (num % 2 == 0){
                System.out.printf(" and it is even!");
            }else {
                System.out.printf(" and it is odd!");
            }
        }else if(num < 0){
            System.out.printf("number is negative!");
        }else {
            System.out.printf("number is null!");
        }


        System.out.printf("\nenter a mark(between 0 and 100): ");
        int mark = input.nextInt();
        char result = (mark >= 90)? 'A' : (mark >= 80)? 'B' : (mark >= 70)? 'C' : (mark >= 60)? 'D' : 'F';
        System.out.print(result + " - ");


//      switch statements:

        switch (result){
            case 'A':
                System.out.printf("Exelent!");
                break;
            case 'B':
                System.out.printf("very good!");
                break;
            case 'C':
                System.out.printf("good!");
                break;
            case 'D':
                System.out.printf("ok!");
                break;
            case 'F': {

                System.out.printf("foo!\ndo you want to redo the exam? ");
                String res = input.next();

                if(res.toLowerCase().equals("yes")) {
                    System.out.printf("ok!");
                }else {
                    System.out.printf("goodluck in the next time");
                }
                break;
            }
            default:
                System.out.printf("is not a choice!");
        }

//      while loop:
        String res = "yes";
        int x = 0;

        while(res.toLowerCase().equals("yes")){
            System.out.printf("x = %d\n", x++);
            System.out.printf("do you want to increment? ");
            res = input.next();
        }
        System.out.printf("ok!");


//        do while loop:
        do{
            System.out.printf("x = %d\n", x);
        }while(x++ < 5);


//        for loop:
        for(int i=0, j=0 ; i<10 && (j%10)!=3; i=(2*i)+1, j++){
            System.out.printf("i = %d, j = %d\n", i, j);
        }

//        ex1:

        float sum = 0;
        for(int i=1; i<=10; i++){
            System.out.printf("enter the number No%d: ", i);
            sum += input.nextFloat();
        }
        System.out.printf("the sum: %.2f", sum);

//        ex2:

        System.out.printf("enter a positive number: ");
        float n = input.nextFloat();
        for(int i=1; i<=10; i++){
            System.out.printf("%.2f x %d = %.2f\n", n, i, n*i);
        }

//        ex3:

        System.out.printf("enter a natural number: ");
        int n = input.nextInt();
        int fact=1;
        do{
            fact *= n;
        }while(--n != 0);
        System.out.printf("fact(n) = %d", fact);

//        ex4:
        int even = 0, odd = 0;
        for(int i=1; i<=10; i++){
            System.out.printf("enter the %dth natural number: ", i);
            int n = input.nextInt();
            if(n%2 == 0)
                even += n;
            else
                odd += n;
        }
        System.out.printf("========================================\n");
        System.out.printf("even_sum = %d \nodd_sum = %d", even, odd);

//        ex5:
        int nb_even = 0, nb_odd = 0;
        for(int i=1; i<=10; i++){
            System.out.printf("enter the %dth natural number: ", i);
            int n = input.nextInt();
            if(n%2 == 0)
                nb_even++;
            else
                nb_odd++;
        }
        System.out.printf("========================================\n");
        System.out.printf("nb_even = %d \nb_odd = %d", nb_even, nb_odd);

//        ex6:
        System.out.printf("enter a natural number: ");
        int n = input.nextInt();
        float result = 0;
        for(int i=1 ; i<=n ; i++){
            result += (float) 1/i;
        }
        System.out.printf("=========================================\n");
        System.out.printf("result = %.2f", result);


//        break:
        for(int i=0; i<=10 ; i++){
            System.out.printf("%d ", i);
            if(i == 5)
                break;
        }

//        continue:
        for(int i=0 ; i<=10 ; i++){
            if(i % 2 != 0)
                continue;
            System.out.printf("%d ", i);
        }

//        nrsted loop:
        System.out.println("multiplication table:\n");
        for(int i=1 ; i<=10 ; i++){
            for(int j=1 ; j<=10 ; j++){
                System.out.printf("%d ", i*j);
            }
            System.out.printf("\n");
        }


//        multicounter loop:
        System.out.printf("multiplication table of 9:\n");
        for(int i=0,j=9 ; i<=9 && j>=0 ; i++, j--){
            System.out.printf("[%d%d]\n", i, j);
        }


//        labeled break and continue:
        label: for(int i=0 ; i<=10 ; i++){
            for(int j=0 ; j<=10 ; j++) {
                System.out.printf("do you want to egnore this block? ");
                if (input.next().toLowerCase().equals("yes"))
                    break label;
                else
                    System.out.printf("continue\n");
                    continue label;
            }
            System.out.printf("heyyy!\n");
        }
        System.out.printf("GG!");


//        methods:
        printHello();

//        functions:
        System.out.printf("enter a number: ");
        System.out.printf("its square = %d\n", square(input.nextInt()));

        System.out.printf("enter the 3 numbers respectly: ");
        System.out.printf("min = %.2f", min(input.nextFloat(), input.nextFloat(), input.nextFloat()));
        System.out.printf("min = %.2f", Math.min(input.nextFloat(), input.nextFloat()), input.nextFloat());


//        recursion call:
        System.out.printf("enter n: ");
        System.out.printf("fact(n)= %d", fact(input.nextInt()));


        System.out.printf("enter n: ");
        fun(input.nextInt());


        System.out.printf("enter a number: ");
        first_n_fib(input.nextInt());


        System.out.printf("enter two numbers respectly: ");
        int n1 = input.nextInt();
        int n2 = input.nextInt();
        System.out.printf("the recursive sum between the two numbers = %d", rec_sum(Math.min(n1,n2), Math.max(n1, n2)));


//        1d array;
        int Array[] = {0,-6,-4,6,-3,56,43};
        String[] list = {"ali", "ahmad", "mohammad", "mohsen"};
        System.out.print(Arrays.stream(Array).average().getAsDouble());

        System.out.println("list of string: " + Arrays.stream(list).toList());

        float sum = 0;
        for(int i:Array){
            sum += i;
        }
        System.out.printf("sum of array: %.2f\n", sum);
        System.out.printf("average: %.2f\n", sum/Array.length);


    int x = input.nextInt();
    label:{
        for (int i : Array) {
            if (x == i) {
                System.out.printf("%d found!", x);
                break label;
            }
        }
        System.out.printf("%d not found!", x);
    }

    float min = Array[0];
    for(float i:Array){
        if (min > i)
            min = i;
    }
        System.out.printf("\nmin = %.2f", min);
        Arrays.sort(Array);
        for(float i:Array){
            System.out.printf("%.0f ", i);
        }


//        1d characters array:
        char ch[] = {'y','a','s','s','e','r'};
        System.out.println(ch);

        String b = "yasser".indent(4);
        System.out.print(b);


        int[] array={2,34,3,6,643,6,43,3,435,46,456,4,543,5,435,46,456,4,64,56,435,345,34,523,53,45,2};
        System.out.printf("Array elements:\n");
        disp(array);


        disp(get_array(2,3,4,5,654,645,643,634,5,45,34));


        int[][] matrice = {
                {0,3,6,3},
                {6,3,6,7},
                {7,3,2,0},
        };

//        dim(matrice);
        disp_mat(matrice);
        System.out.printf("matrice transpode:\n");
        disp_mat(transpose(matrice));

        String s = new String("h-e-l-l-o");
        String c = new String("gsd");








    }
}