package opgave01.storage;

import opgave01.application.model.Company;
import opgave01.application.model.Employee;

import java.util.ArrayList;

public class Storage {
    private static ArrayList<Company> companies = new ArrayList<>();
    private static ArrayList<Employee> employees = new ArrayList<>();

    // -------------------------------------------------------------------------

    public static ArrayList<Company> getCompanies() {
        return new ArrayList<>(companies);
    }

    public static void addCompany(Company company) {
        companies.add(company);
    }

    public static void removeCompany(Company company) {
        companies.remove(company);
    }

    // -------------------------------------------------------------------------

    public static ArrayList<Employee> getEmployees() {
        return new ArrayList<>(employees);
    }

    public static void addEmployee(Employee employee) {
        employees.add(employee);
    }

    public static void removeEmployee(Employee employee) {
        employees.remove(employee);
    }

    // -------------------------------------------------------------------------

}