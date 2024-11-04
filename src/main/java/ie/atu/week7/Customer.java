package ie.atu.week7;

import java.util.Scanner;

import java.util.ArrayList;

public class Customer {
    private String customerId;
    private String name;
    private String email;
    private String phoneNumber;

    public Customer() { }

    public Customer (String customerId, String name, String email, String phoneNumber) {
        this.customerId = customerId;
        this.name = name;
        this.email = email;
        this.phoneNumber = phoneNumber;
    }

    public String getCustomerId() {
        return customerId;
    }

    public void setCustomerId(String customerId) {
        this.customerId = customerId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public static void main(String[] args) {
        ArrayList<String> customerInfo = new ArrayList<String>();
        customerInfo.add("Customer 1");
        customerInfo.add("Mia");
        customerInfo.add("miaacton@atu.ie");
        customerInfo.add("0858444514");

        System.out.println("ArrayList contents before adding new customer: ");
        displayList(customerInfo);

        Scanner scanner = new Scanner(System.in);
        System.out.print("\nEnter new customerId to add to the ArrayList: ");
        String newValue = scanner.next();
        customerInfo.add(newValue);

        System.out.print("\nEnter new customer name to add to the ArrayList: ");
        String newValue2 = scanner.next();
        customerInfo.add(newValue);

        System.out.print("\nEnter new customer email to add to the ArrayList: ");
        String newValue3 = scanner.next();
        customerInfo.add(newValue);

        System.out.print("\nEnter new customer phone number to add to the ArrayList: ");
        String newValue4 = scanner.next();
        customerInfo.add(newValue);

        customerInfo.add(newValue);
        customerInfo.add(newValue2);
        customerInfo.add(newValue3);
        customerInfo.add(newValue4);

        System.out.println("\nArrayList contents after adding new customer: ");
        displayList(customerInfo);

        scanner.close();
    }

    public static void displayList(ArrayList<String> List) {
        int index = 0;
        for (String value : List) {
            System.out.println("Element at index" + index + ": " + value);
            index++;
        }
    }
}

