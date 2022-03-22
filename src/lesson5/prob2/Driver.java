package lesson5.prob2;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Driver {
    public static void main(String[] args) {

        DateTimeFormatter formatter =DateTimeFormatter.ofPattern("yyyy/M/d");

        Professor prof1 = new Professor("Professor1",20000, LocalDate.parse("1990/01/12", formatter), 70);
        Professor prof2 = new Professor("Professor2",15000, LocalDate.parse("2000/09/07", formatter), 40);
        Professor prof3 = new Professor("professor3",10000, LocalDate.parse("2010/04/17", formatter), 30);
        Secretary sec1 = new Secretary("Secretary1",8000,LocalDate.parse("1980/05/25", formatter),50);
        Secretary sec2 = new Secretary("Secretary2",5000,LocalDate.parse("1995/01/19", formatter),60);

        DeptEmployee[] deptEmployee = new DeptEmployee[5];

        deptEmployee[0]= prof1;
        deptEmployee[1]= prof2;
        deptEmployee[2] = prof3;
        deptEmployee[3]= sec1;
        deptEmployee[4]= sec2;

        System.out.print("Do you want total salaries of the professors and secretaries? : ");
        Scanner in = new Scanner(System.in);
        char c = in.next().charAt(0);
        if(c =='Y'){
            double sum = 0;
            for (DeptEmployee e: deptEmployee
                 ) {
                sum += e.computeSalary();
            }
            //double sum = Arrays.stream(deptEmployee).mapToDouble(DeptEmployee::computeSalary).sum();
            System.out.println(sum);
        }

    }

}
