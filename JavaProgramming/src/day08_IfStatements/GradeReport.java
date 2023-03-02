package day08_IfStatements;

public class GradeReport {

    public static void main(String[] args) {

        /*
        System.out.println( true == !false ); // true
        System.out.println( !true != false ); // false
        System.out.println( !false == true); // true
        System.out.println(!!false); //false
        System.out.println(!!!true); // false
         */

int score = 85;

boolean a = score >= 90 && score <=100;

if(a){ //if the student made an A
    System.out.println("Excellent");
}

boolean b = score >=80 && score <=89;
        //  boolean b = score >= 80 && !a; // if score is A, but score is greater than 80
if(b){ //if the student made an B
    System.out.println("Great");

boolean c = score >= 70 && score <=79;
// boolean c =!a && !b && score >= 70
if(c){ //if the student made an C
    System.out.println("Good");
}

boolean d = score >=60 && score <=69;

if(d){ //if the student made an D
    System.out.println("Passed");
}

boolean f = score >= 0 && score <=59;
//  boolean f = !a && !b && !c && !d;

if(f){ //if the student made an F
    System.out.println("Failed");
}

}

    }
}
/*
score:
    90 ~ 100 ==> Excellent
    80 ~ 89 ==> Great
    70 ~ 79 ==> Good
    60 ~ 69 ==> Passed
    0 ~ 59 ==> Failed
 */