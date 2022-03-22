package lesson3;

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

import static java.lang.Math.PI;
import static lesson3.HeartRates.maxHeartRate;
import static lesson3.HeartRates.targetHeartRate;

class Customer {

    private String firstName;
    private String lastName;
    private String socSecurityNum;
    private Address billingAddress;
    private Address shippingAddress;

    public Customer(String firstName, String lastName, String socSecurityNum) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.socSecurityNum = socSecurityNum;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getSocSecurityNum() {
        return socSecurityNum;
    }

    public void setSocSecurityNum(String socSecurityNum) {
        this.socSecurityNum = socSecurityNum;
    }

    public Address getBillingAddress() {
        return billingAddress;
    }

    public void setBillingAddress(Address billingAddress) {
        this.billingAddress = billingAddress;
    }

    public Address getShippingAddress() {
        return shippingAddress;
    }

    public void setShippingAddress(Address shippingAddress) {
        this.shippingAddress = shippingAddress;
    }

    @Override
    public String toString() {
        return "[" + firstName + ", " + lastName + ", " + "ssn: " + socSecurityNum
                + "]";
    }
}

class Address {
    private String street;
    private String city;
    private String state;
    private String zip;

    public Address(String street, String city, String state, String zip) {
        this.street = street;
        this.city = city;
        this.state = state;
        this.zip = zip;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getZip() {
        return zip;
    }

    public void setZip(String zip) {
        this.zip = zip;
    }
}

class HeartRates {
    private String firstName;
    private String lastName;
    private String dateOfBirth;

    public HeartRates(String firstName, String lastName, String dateOfBirth) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.dateOfBirth = dateOfBirth;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(String dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    @Override
    public String toString() {
        return "First Name: " + firstName + '\n' +
                "Last Name: " + lastName + '\n' +
                "date of Birth: " + dateOfBirth + '\n' +
                "Age: " + ageCalculator() + '\n' +
                "Maximum Heart Rate: " + maxHeartRate(ageCalculator()) + '\n';
    }

    int ageCalculator() {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-M-d");

        return Period.between(LocalDate.parse(dateOfBirth, formatter), LocalDate.now()).getYears();
    }

    static int maxHeartRate(int age) {
        int MHR = 220 - age;
        return MHR;
    }

    static void targetHeartRate(int maxHearRate) {
        final int RHR = 70;
        final double LB = 0.5;
        final double UB = 0.85;
        int MHR = maxHearRate;
        int AHR = MHR - RHR;
        double LBTHR = (AHR * LB) + RHR;
        double UBTHR = (AHR * UB) + RHR;
        System.out.printf("The Target Heart Rate is between %f and %f \n", LBTHR, UBTHR);
        ;
    }
}


final class Rectangle {
    private final double width;
    private final double length;

    public Rectangle(double width, double length) {
        this.width = width;
        this.length = length;
    }

    public double getWidth() {
        return width;
    }

    public double getLength() {
        return length;
    }

    public double computeArea() {
        return width * length;
    }

}

final class Triangle {
    private final double base;
    private final double height;

    public Triangle(double base, double height) {
        this.base = base;
        this.height = height;
    }

    public double getBase() {
        return base;
    }

    public double getHeight() {
        return height;
    }

    public double computeArea() {
        return 0.5 * base * height;
    }
}

final class Circle {
    private final double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public double computeArea() {
        return PI * radius * radius;
    }
}

public class lesson3 {
    public static void main(String[] args) {
        System.out.println("++++++++++++++++++++++++++ Solution for problem - 1 +++++++++++++++:");
        Customer c1 = new Customer("Tesfamichael", "Adugna", "6789");
        Customer c2 = new Customer("Solomon", "David", "6789");
        Customer c3 = new Customer("Sara", "Adam", "6789");

        Address b1 = new Address("1000 N 4th st", "Chicago", "Iowa", "52557");
        Address b2 = new Address("1001 N 4th st", "Fairfield", "Iowa", "52558");
        Address b3 = new Address("1002 N 4th st", "Iowa", "Iowa", "52559");

        Address s1 = new Address("1000 N 4th st", "Fairfield", "Iowa", "52557");
        Address s2 = new Address("1001 N 4th st", "Fairfield", "Iowa", "52558");
        Address s3 = new Address("1002 N 4th st", "Fairfield", "Iowa", "52559");

        // setting billing and shipping address of a customer
        c1.setBillingAddress(b1);
        c1.setShippingAddress(s1);
        c2.setBillingAddress(b2);
        c2.setShippingAddress(s2);
        c3.setBillingAddress(b3);
        c3.setShippingAddress(s3);

        // array of customers
        Customer[] customers = new Customer[3];
        customers[0] = c1;
        customers[1] = c2;
        customers[2] = c3;
        for (Customer c : customers)
            if (c.getBillingAddress().getCity().compareToIgnoreCase("Chicago") == 0)
                System.out.println(c);

        System.out.println("++++++++++++++++++++++++++ Solution for problem - 2 +++++++++++++++:");

        Scanner in = new Scanner(System.in);
        System.out.println("Enter C for Circle \nEnter R for Rectangle\nEnter T for Triangle");
        char s = in.next().charAt(0);
        switch (s) {
            case 'R': {
                System.out.println("Enter the width of the Rectangle");
                double w = in.nextDouble();
                System.out.println("Enter the length of the Rectangle");
                double l = in.nextDouble();
                Rectangle r = new Rectangle(w, l);
                System.out.printf("The area of Rectangle is : %f", r.computeArea());
            }
            break;
            case 'T': {
                System.out.println("Enter the base of the Triangle");
                double b = in.nextDouble();
                System.out.println("Enter the height of the Triangle");
                double h = in.nextDouble();
                Triangle r = new Triangle(b, h);
                System.out.printf("The area of Triangle is : %f", r.computeArea());

            }
            break;
            case 'C': {
                System.out.println("Enter the radius of a circle");
                double r = in.nextDouble();
                ;
                Circle cr = new Circle(r);
                System.out.printf("The area of Circle is : %f", cr.computeArea());

            }
            default:
                System.out.println(" you did not write the right letter!");
        }
        System.out.println("\n++++++++++++++++++++++++++ Solution for problem - 3 +++++++++++++++:\n");

        Scanner sc = new Scanner(System.in);
        System.out.println("Please, enter your first name:");
        String fname = sc.nextLine();
        System.out.println("Please, enter your last name:");
        String lname = sc.nextLine();
        System.out.println("please, enter your birth date in a format (yyyy-mm-dd- Example 1989-4-14");
        String bdate = sc.nextLine();
        HeartRates hr = new HeartRates(fname, lname, bdate);
        targetHeartRate(maxHeartRate(hr.ageCalculator()));
        System.out.println(hr);
    }
}


