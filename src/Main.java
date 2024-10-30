import java.lang.reflect.Array;
import java.sql.SQLOutput;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println("Hello world!");
        int num=20;
        byte b=9;
        float f=5.5f;
        double d=66.6;
        char c='h';
        boolean t=false;
        System.out.println(num>b?"num":"b"+"bigger");
        b= (byte) num;
       f= (float) d;
        for (int i = 0; i <b; i++) {
            System.out.println("hello");
        }
        System.out.println(t?"true":"false");
        switch (c)
        {
            case 'h':
                System.out.println((int) c);
                   break;
            case 'e':
                System.out.println((int) c);
                break;
            case 'l':
                System.out.println((int) c);
                break;
            case 'o':
                System.out.println((int) 'o');
                break;
            default:
                System.out.println("the letter is not h/e/l/o");
        }

        System.out.println( "between 50 and 7 is: " + func(50,7));

double[] d1={1,2,3,4,5,6};
float[] f1=new float[5];
        for (int i = 0; i < d1.length; i++) {
            System.out.println(d1[i]);
        }
        for (int i = 0; i < f1.length; i++) {
           System.out.println(f1[i]);
        }
int[][] mat=new int [3][5];
        int[] d11={1,2,3,4,5,6};
        int[] d12={1,2,3,4,5,6};
        System.out.println(Arrays.equals(d11,d12));
        int[] arr=Arrays.copyOf(d11,3);
        int[] arr1={3,1,2};
        Arrays.sort(arr1);
        for (int i = 0; i < arr1.length; i++) {
            System.out.println(arr1[i]);
        }
int x=3,y=2;
        System.out.println(Math.pow(x,y));
        System.out.println(Math.sqrt(25));
        Random r=new Random();
        for (int i = 0; i <15 ; i++) {
            //System.out.println(r.nextInt(10));
            System.out.println( (int) (Math.random()*10));
        }
        System.out.println("enter number ,float ,and string please");
        Scanner s=new Scanner(System.in);
int i=s.nextInt();
String str=s.next();
        float j=s.nextFloat();
        System.out.println("i j str " + i+" "+j+" "+str);

    }

    /**
     * this <code> function <code\> check the range and returns -1 or a/b
     *     @param a integer provided
     *     @param a integer provided
     *              @reterns a/b or -1;
     */

    public static double func(int a, int b)
    {
        return((a>100&&a<1000)&&(b>100&&b<1000)) ?  (double) a/b:  -1;
    }

}