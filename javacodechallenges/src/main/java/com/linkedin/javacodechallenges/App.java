package com.linkedin.javacodechallenges;

import java.util.Scanner;

public class App {

    public static double calculateWaterBill(double gallonsUsage) {
        // TODO: Implement method
        double minimumBill = 18.84;
        double gallonsPerCCF = 748;
        double includedGallons = 2 * gallonsPerCCF;

        if (gallonsUsage <= includedGallons) {
            return minimumBill;
        } else if (gallonsUsage > includedGallons) {
            // System.out.println(gallonsUsage - includedGallons);
            if (gallonsUsage - includedGallons <= gallonsPerCCF) {
                System.out.println("Test");
                return minimumBill + 3.90;
            } else {
                double numberOfExtraCCFs = (gallonsUsage - includedGallons) / gallonsPerCCF;
                // System.out.println("Extras " + numberOfExtraCCFs);
                return minimumBill + (Math.ceil(numberOfExtraCCFs) * 3.90);
            }
        }

        return 0;

    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("How many gallons of water did you " +
                "use this month?");
        double usage = scanner.nextDouble();
        System.out.println("Your water bill is " +
                calculateWaterBill(usage));
        scanner.close();
    }
}
