package assignment;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        printHelloWorld();
        multiplicationTable();
        isPalindrome("zooz");
        isPalindrome("azoozb");
        ArrayList<String> list1 = new ArrayList<>();
        ArrayList<String> list2 = new ArrayList<>();
        list1.add("a");
        list1.add("b");
        list1.add("c");
        list2.add("1");
        list2.add("2");
        list2.add("3");
        combineLists(list1, list2);
        printFibonacci();
        isLeapYear(2024);
        isLeapYear(2023);
    }
    // Q2
    public static void printHelloWorld() {
        System.out.println("Hello World");
    }
    // Q3
    public static void multiplicationTable() {
        for (int i = 1; i <= 12; i++) {
            for (int j = 1; j <= 12; j++) {
                System.out.printf("%4d",i*j);
            }
            System.out.println();
        }
    }
    // Q4
    public static void isPalindrome(String string) {
        int left = 0, right = string.length() - 1;
        while (left < right) {
            if (string.charAt(left) == string.charAt(right)) {
                left++;
                right--;
            } else break;
        }
        if (left >= right) {
            System.out.println(string + " is palindrome");
        } else System.out.println(string + " is not palindrome");
    }
    // Q5
    public static void combineLists(ArrayList<String> list1, ArrayList<String> list2) {
        ArrayList<String> newList = new ArrayList<>();
        int index = 0;
        while (index < list1.size() && index < list2.size()) {
            newList.add(list1.get(index));
            newList.add(list2.get(index));
            index++;
        }
        while (index < list1.size()) {
            newList.add(list1.get(index));
            index++;
        }
        while (index < list2.size()) {
            newList.add(list2.get(index));
            index++;
        }
        for (int i = 0; i < newList.size(); i++) {
            System.out.print(newList.get(i) + " ");
        }
    }
    // Q6
    public static void printFibonacci() {
        long a = 1, b = 1, c;
        System.out.println(a + "\n" + b);
        for (int i = 0; i < 98; i++) {
            c = a + b;
            System.out.println(c);
            a = b;
            b = c;
        }
    }
    // Q7
    public static void isLeapYear(int year) {
        if (year % 4 == 0) {
            System.out.println(year + " is leap year");
        } else {
            System.out.println(year + " is not leap year");
        }
    }
}
