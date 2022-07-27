package com.codewithmosh;

import java.text.NumberFormat;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        final int MONTHS_IN_YEAR = 12;
        final int PERCENT = 100;
        Scanner scanner = new Scanner(System.in);

        System.out.print("Principal: ");
        int principal = scanner.nextInt();

        System.out.print("Annual Interest Rate:");
        float annualInterest = scanner.nextFloat();
        float monthlyInterest = annualInterest/PERCENT/MONTHS_IN_YEAR;

        System.out.print("Period(Years): ");
        int period = scanner.nextInt();
        int numberOfPayments = period * MONTHS_IN_YEAR;

        double mortgagePayments = principal*(monthlyInterest*Math.pow(1+monthlyInterest,numberOfPayments)/(Math.pow(1+monthlyInterest,numberOfPayments)-1));

        NumberFormat nf = NumberFormat.getCurrencyInstance();
        String mortgagePaymentsFormatted = nf.format(principal);
        System.out.println("Morgage = " + mortgagePaymentsFormatted);

    }
}
