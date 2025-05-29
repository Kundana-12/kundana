import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        String[][] cities=new String[3][3];
        cities[0][0]="Banglore";
        cities[0][1]="Chennai";
        cities[0][2]="Mumbai";
        cities[1][0]="Kadapa";
        cities[1][1]="ATP";
        cities[1][2]="Nellore";
        cities[2][0]="Vijayawada";
        cities[2][1]="Vellore";
        cities[2][2]="Kakinada";
        for(int i=0;i<cities.length;i++){
            System.out.println(cities[i]);
            for(int j=0;j<cities[i].length;j++){
                System.out.print(cities [i] [j]+ " ");
        }
        }
    }
}
Banglore Chennai Mumbai 
Kadapa ATP Nellore 
Vijayawada Vellore Kakinada 

import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int rows;
        int columns;
        String symbol="";
        System.out.println("Enter no. of rows:");
        rows=sc.nextInt();
        System.out.println("Enter no. of columns:");
        columns=sc.nextInt();
        System.out.println("Enter ur symbol:");
        symbol=sc.next();
        for(int i=0;i<rows;i++){
            System.out.println();
            for(int j=0;j<columns;j++){
                System.out.print(symbol);
            }
        }
    }
}
Enter no. of rows:
3
Enter no. of columns:
4
Enter ur symbol:
&

&&&&
&&&&
&&&&

import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        String name="Sunny";
        boolean result=name.equalsIgnoreCase("sunny");
        System.out.println(result);
    }
}
true

import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        String name="Sunny";
        boolean result=name==("sunny");
        System.out.println(result);
    }
}
false

String name="Sunny";
        int result=name.length();
        System.out.println(result);
char result=name.charAt(0);
int result=name.indexOf("u");
Boolean result=name.isEmpty();
String result=name.toUpperCase();
String result=name.toLowerCase();
String result=name.trim();
String result=name.replace('u','a');


