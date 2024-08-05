import java.util.List;

public class Main {
    public static void main(String[] args) {
        Journal employees = new Journal();

        employees.addEmployee(new Employee(1, "1234567890", "Alice", 5));
        employees.addEmployee(new Employee(2, "9876543210", "Bob", 3));
        employees.addEmployee(new Employee(3, "5555555555", "Alice", 7));

        List<Employee> experiencedEmployees = employees.findEmployeesByExperience(5);
        System.out.println("Employees with experience 5 years:");
        for (Employee emp : experiencedEmployees)
            System.out.println(emp.name() + ", " + emp.phoneNumber());

        List<String> alicePhoneNumbers = employees.findPhoneNumbersByName("Alice");
        System.out.println("Phone numbers of employees named Alice:");
        alicePhoneNumbers.forEach(System.out::println);

        Employee employeeById = employees.findEmployeeById(2);
        if (employeeById != null)
            System.out.println("Employee found by ID 2: " + employeeById.name());
        else
            System.out.println("Employee with ID 2 not found.");
    }
}