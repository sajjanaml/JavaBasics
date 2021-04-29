package com.pluralsight.bascis.variables;

public class OperatorPrecedence {

    public static void main(String[] args) {

        int valA =21;
        int valB =6;
        int valC =3;
        int valD=1;

        int result1 = valA-valB/valC;
        System.out.println(result1);

        int result2 = (valA-valB)/valC;
        System.out.println(result2);

        int result3 = valA/(valC*(valB+valD));
        System.out.println(result3);

        int result4 = valA/valC*valB+valD;
        System.out.println(result4);

    }
}
