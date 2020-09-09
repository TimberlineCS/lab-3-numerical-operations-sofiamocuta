//Sofia Mocuta
//AP CSA
//090220
public class NumericalOperations{
  public static void main(String args[]){
    /*Challenge 1: predict the results to 5 equations, then print them to console and compare*/
    double d1 = 37.9;
    double d2 = 1004.128;
    int i1 = 12;
    int i2 = 18;

    System.out.println(57.2*(i1/i2)+1); 
    System.out.println(57.2 * ((double)i1 / i2) + 1);  
    System.out.println(15 - i1 * (d1 * 3) + 4);  
    System.out.println(15 - i1 * ((int)d1 * 3) + 4);  
    System.out.println(15 - i1 * (int)(d1 * 3) + 4);  

    /*Challenge 2: create a set of code which prints out the reverse of every four digit number you input*/
    //version 1
    String input1 = "1234";
    System.out.print(input1.substring(3,4));
    System.out.print(input1.substring(2,3));
    System.out.print(input1.substring(1,2));
    System.out.println(input1.substring(0,1));

    //version 2
    int input = 1234;
    int x4 = input/1000;
    int x3 = input/100-x4*10;
    int x2 = input/10-x4*100-x3*10;
    int x1 = input-x4*1000-x3*100-x2*10;
    System.out.print(x1);
    System.out.print(x2);
    System.out.print(x3);
    System.out.println(x4);

    //version 3
    int n = 1234;
    int a = n%10;
    int b = n/10%10;
    int c = n/100%10;
    int d = n/1000%10;
    String aa = ""+a;
    String bb = ""+b;
    String cc = ""+c;
    String dd = ""+d;
    System.out.println(aa+bb+cc+dd);
  }
}