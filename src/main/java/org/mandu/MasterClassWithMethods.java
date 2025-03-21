package org.mandu;

import java.util.ArrayList;
import java.util.List;

public class MasterClassWithMethods {

    // Method to swap 2 numbers
    public  void swapTwoNumbers(Integer num1, Integer num2){

        System.out.println("Numbers before swapping are num1:"+num1+" num2:"+num2);
        num1 = num1+num2; //13
        num2 = num1-num2; //5
        num1 = num1-num2;
        System.out.println("Numbers after swapping are num1:"+num1+" num2:"+num2);
    }

    //Method to reverse an integer
    public void reverseNumber(Integer i) {
        System.out.println("Initial Number is: "+i);
        Integer revNum = 0;
        while(i!=0){
            // a = i%10;
            revNum = revNum*10 + i%10;
            i = i/10;
        };
    }

    public void reverseString(String s) {

        Integer stringLength = s.length();
        String reversedStringOwnLogic = "";
        char[] stringArray = new char[stringLength-1];
        List<Character> reversedStringArray = new ArrayList<>();


        //Reverse string with own logic
        for (Integer i=stringLength-1; i>=0; i--){
            reversedStringOwnLogic = reversedStringOwnLogic + s.charAt(i);
        };

        //Reverse string with character array
        for (Integer i=stringLength-1; i>=0; i--){
            Integer j = 0;
            reversedStringArray.add(s.charAt(i));
            j++;
        };

        System.out.println("Original String is: "+s);
        System.out.println("Reversed String using my own logic is: "+reversedStringOwnLogic);
        System.out.println("Reversed String using Character Array is: ");
        for (char ch: reversedStringArray){
            System.out.print(ch);
        };
    }

    public void checkIfNumberIsPalindrome(int i) {
        if (i<0){
            System.out.println("Number is negative and not a valid input");
            return;
        }
        Integer reversedNumber = 0;
        Integer originalNumber = i;
        while (i>0){
            reversedNumber = reversedNumber*10 + i%10;
            i = i/10;
        }
        if (originalNumber/100 == 0){
            System.out.println("Number "+originalNumber+" only has 2 digits");
        } else if (originalNumber.equals(reversedNumber)) {
            System.out.println("Number "+originalNumber+" is a Palindrome");
        } else System.out.println("Number "+originalNumber+" is not a Palindrome");

    };

    public void countNumberOfDigitsInNumber(int i) {
        Integer numOfDigits = 0;
        Integer originalNumber = i;
        while (i > 0) {
            i=i/10;
            numOfDigits++;
        };
        System.out.println("Count of digits in "+ originalNumber+" is "+numOfDigits);
    };

    public void countEvenAndOddDigitsInNumber(int i) {
        Integer originalNumber = i;
        Integer evenCount = 0;
        Integer oddCount = 0;
        while (i>0){
            Integer j = i%10;
            if (j%2 == 0) evenCount++;
            else oddCount++;
            i = i/10;
        }
        System.out.println("Number of Even Digits in " + originalNumber + " is " +evenCount);
        System.out.println("Number of Odd Digits in " + originalNumber + " is " +oddCount);

    }
    public void findLargestOfThreeNumbers(int a, int b, int c) {
        if (a == b && b == c) {
            System.out.println("All three numbers are equal");
        } else {
            int largestNumber;
            if (a >= b && a >= c) {
                largestNumber = a;
            } else if (b >= a && b >= c) {
                largestNumber = b;
            } else {
                largestNumber = c;
            }
            System.out.println("Largest number is " + largestNumber);
        }
    }


    public void generateFibonacciSeries(int i) {
        int previousFibonacci = 0;
        int latestFibonacci = 1;
        System.out.print(previousFibonacci+" ");
        for (int j=1; j<i; j++){
            System.out.print(latestFibonacci+" ");
            latestFibonacci = previousFibonacci + latestFibonacci;
            previousFibonacci = latestFibonacci - previousFibonacci;
        }

    }

    public void checkIfNumberIsPrime(int i) {
        if (i==1){
            System.out.println("1 not a valid input");
        } else if (i%2==0) {
            System.out.println(i +" is a factor of 2, and hence not a prime number");
        } else {
            int j = 3;
            while (j<i){
                if (i%j==0){
                    System.out.println(i +" is a factor of "+j+", and hence not a prime number");
                    return;
                } else j = j+2;
            }
            System.out.println(i +" is a prime number");
            String str;

        }
    }

    public void sumOfElementsInAnArray(int[] arr) {
        int sum = 0;
        System.out.println("The array is:");
        for (int num: arr){
            sum = sum + num;
            System.out.print(num+" ");
        }
        System.out.println();
        System.out.println("Sum of all the elements is "+sum);
    }

    public void compareTwoArrays(int[] arr1, int[] arr2) {
        if (arr1.length == arr2.length){
            for (int i=0;i<arr1.length;i++){
                if (arr1[i]!=arr2[i]){
                    System.out.println("Arrays are not equal as the elements in index "+i+" are not equal");
                    return;
                }

            }
            System.out.println("The arrays are equal");
        } else{
            System.out.println("Length of the arrays are not equal");
        }
    }

    public void findMaxAndMinNumbersInArray(int[] arr) {
        if (arr == null || arr.length == 0) {
            System.out.println("Array is empty or null.");
            return;
        }

        int max = arr[0]; // Assume the first element is the max
        int min = arr[0]; // Assume the first element is the min

        // Traverse the array to find the actual max and min
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i]; // Update max if current element is greater
            }
            if (arr[i] < min) {
                min = arr[i]; // Update min if current element is smaller
            }
        }

        System.out.println("Maximum number in the array is " + max);
        System.out.println("Minimum number in the array is " + min);
    }

    public void findSecondLargestNumberInArray(int[] arr) {
        if (arr == null || arr.length <2  ){
            System.out.println("Invalid Input");
            return;
        }


        int largestNumber = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;
        //int arrLength = arr.length;
        for (int i:arr){
            if (i>largestNumber){
                secondLargest = largestNumber;
                largestNumber = i;

            } else if (i>secondLargest && i!=largestNumber) {
                secondLargest = i;

            }

        }
        System.out.println("Largest Number in array is "+largestNumber);
        System.out.println("Second largest Number in array is "+secondLargest);
    }


    public void findDuplicateElementsInArray(int[] arr) {
        List<Integer> uniqueNumbers = new ArrayList<>();
        for (int i=0;i<arr.length;i++){
            if (uniqueNumbers.contains(arr[i])){
                continue;
            }
            int duplicateCount = 0;
            for (int j=0;j<arr.length;j++){
                if (arr[i]==arr[j]){
                    duplicateCount++;
                }

            }
            if (duplicateCount>1){
                System.out.println("The array has "+duplicateCount+ " "+arr[i]+"s");
                uniqueNumbers.add(arr[i]);
            }

        }
    }
};
