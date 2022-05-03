package com.company;

import java.util.Scanner;

public class Actions {
    public void calcaulateIndexBody() {
        Scanner input = new Scanner(System.in);

        System.out.print("Input weight in pounds: ");
        double weight = input.nextDouble();

        System.out.print("Input height in inches: ");
        double inches = input.nextDouble();

        double BMI = weight * 0.45359237 / (inches * 0.0254 * inches * 0.0254);
        System.out.print("Body Mass Index is " + BMI + "\n");
    }

    public void convertHours(int hours) {
        int convertHours = hours * 60;
        System.out.println(convertHours);
    }

    public void convertMeterToInch() {
        Scanner input = new Scanner(System.in);

        System.out.print("Input a value for inch: ");
        double inch = input.nextDouble();
        double meters = inch * 0.0254;
        System.out.println(inch + " inch is " + meters + " meters");
    }

    public void printRandom() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Input the starting number of the range: ");
        int rsnum = sc.nextInt();
        System.out.print("Input the ending number of the range: ");
        int renum = sc.nextInt();
        int random_num = rsnum + (int) (Math.random() * ((renum - rsnum) + 1));
        System.out.println(random_num);
    }

    public void printSpeed() {
        try (Scanner scanner = new Scanner(System.in)) {

            float timeSeconds;
            float mps, kph, mph;

            System.out.print("Input distance in meters: ");
            float distance = scanner.nextFloat();

            System.out.print("Input hour: ");
            float hr = scanner.nextFloat();

            System.out.print("Input minutes: ");
            float min = scanner.nextFloat();

            System.out.print("Input seconds: ");
            float sec = scanner.nextFloat();

            timeSeconds = (hr * 3600) + (min * 60) + sec;
            mps = distance / timeSeconds;
            kph = (distance / 1000.0f) / (timeSeconds / 3600.0f);
            mph = kph / 1.609f;

            System.out.println("Your speed in meters/second is " + mps);
            System.out.println("Your speed in km/h is " + kph);
            System.out.println("Your speed in miles/h is " + mph);

        }

    }

    public void calculateSquad(int numOne, int numTwo, int numThree) {
        numOne *= numOne;
        numTwo *= numTwo;
        numThree *= numThree;
        int findArifmetic = (numOne + numTwo + numThree) / 2;
        System.out.println(findArifmetic);
    }

    public void calculateSqaure(int a, int b) {
        int areaTriangle = (a * b) / 2;
        System.out.println(areaTriangle);
    }

    public void printYears() {
        double minutesInYear = 60 * 24 * 365;

        Scanner input = new Scanner(System.in);

        System.out.print("Input the number of minutes: ");

        double min = input.nextDouble();

        long years = (long) (min / minutesInYear);
        int days = (int) (min / 60 / 24) % 365;

        System.out.println((int) min + " minutes is approximately " + years + " years and " + days + " days");
    }

    public void calculateKelvin(double kelvin) {
        double celcius = kelvin * 273.6;
        System.out.println(celcius);
    }

    public void printDate() {


        Scanner input = new Scanner(System.in);

        int number_Of_DaysInMonth = 0;
        String monthOfName = "Unknown";

        System.out.print("Input a month number: ");
        int month = input.nextInt();

        System.out.print("Input a year: ");
        int year = input.nextInt();

        switch (month) {
            case 1:
                monthOfName = "January";
                number_Of_DaysInMonth = 31;
                break;
            case 2:
                monthOfName = "February";
                if ((year % 400 == 0) || ((year % 4 == 0) && (year % 100 != 0))) {
                    number_Of_DaysInMonth = 29;
                } else {
                    number_Of_DaysInMonth = 28;
                }
                break;
            case 3:
                monthOfName = "March";
                number_Of_DaysInMonth = 31;
                break;
            case 4:
                monthOfName = "April";
                number_Of_DaysInMonth = 30;
                break;
            case 5:
                monthOfName = "May";
                number_Of_DaysInMonth = 31;
                break;
            case 6:
                monthOfName = "June";
                number_Of_DaysInMonth = 30;
                break;
            case 7:
                monthOfName = "July";
                number_Of_DaysInMonth = 31;
                break;
            case 8:
                monthOfName = "August";
                number_Of_DaysInMonth = 31;
                break;
            case 9:
                monthOfName = "September";
                number_Of_DaysInMonth = 30;
                break;
            case 10:
                monthOfName = "October";
                number_Of_DaysInMonth = 31;
                break;
            case 11:
                monthOfName = "November";
                number_Of_DaysInMonth = 30;
                break;
            case 12:
                monthOfName = "December";
                number_Of_DaysInMonth = 31;
        }
        System.out.print(monthOfName + " " + year + " has " + number_Of_DaysInMonth + " days\n");
    }
}

