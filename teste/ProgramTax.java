package udemyCurso.taxes.teste;

import udemyCurso.taxes.classes.LegalEntity;
import udemyCurso.taxes.classes.NaturalPerson;
import udemyCurso.taxes.classes.Person;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ProgramTax {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Person> list = new ArrayList<>();
        System.out.println("Please enter the number of taxpayers:");
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            System.out.println("Tax payer " + (i + 1) + " data:");
            System.out.print("Natural or legal person? (N/L):");
            char typeOfPerson = sc.next().charAt(0);
            System.out.println("Name:");
            sc.nextLine();
            String name = sc.nextLine();
            System.out.println("Annual income:");
            Double annualIncome = sc.nextDouble();
            if (typeOfPerson == 'n') {
                System.out.println("Health spending:");
                Double healthExpenses = sc.nextDouble();
                list.add(new NaturalPerson(name, annualIncome, healthExpenses));
            } else {
                System.out.println("Number Employees");
                Integer numberEmployees = sc.nextInt();
                list.add(new LegalEntity(name, annualIncome, numberEmployees));
            }


        }
        System.out.println("-----------------------------------");
        for (Person p : list) {
            System.out.println("Name: " + p.getName() + " Taxes: " + p.Calculatestax());

        }
        {

        }
    }
}
