package day06_PrimitiveTypeCastings;

public class PrimitiveCastings {

    public static void main(String[] args) {

        //Implicit ; automatically (smaller to larger)
        //Explicit ; manually (larger to smaller)
        //Shortcut ; alt + enter -- select "cast to ...."
        // or u can use the solution button ( red light bulb)

        byte a = 100;
        short b = (short)a; // byte a is in the range of short

        // casting to the short;  (short)a
        // but we dont have to write (short) part because it will be done implicitly.
        // if the range is smaller to larger it will be casting by itself
       // it will be done automatically every single time. (Implicit)
        int c = b;
        long d = c;
        float e = d;
        double f = e;

        System.out.println("-------------------------------");

        int x = 55;
        //short y = x; short does not have enough rage to be cast in int
        short y = (short) x;
        // that is why I need to write "(short) x" not just "x"
        // we need to do it manually every single time (Explicit)

        System.out.println(x + " : " + y);

     long j = 1000000;
     short k = (short) j;

        System.out.println(j+" : "+k);

     double l = 2.5;
     float m = (float) l;

        System.out.println(l+" : "+m);

     double n = 10.8;
     int s = (int) n;

        System.out.println(n+" : "+s);

        double d1 = 20.5;
        short s1 = (short) d1;

        System.out.println(d1+" : "+s1);

        float f1 = 30.5F;
        long l1 = (long) f1;

        System.out.println(f1+" : "+l1);

    }

}


