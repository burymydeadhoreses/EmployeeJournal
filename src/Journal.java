import java.util.ArrayList;
import java.util.List;

class Journal {
    private final List<Employee> employees;

    public Journal() {
        this.employees = new ArrayList<>();
    }

    public void addEmployee(Employee employee) {
        employees.add(employee);
    }

    public List<Employee> findEmployeesByExperience(int experience) {
        List<Employee> result = new ArrayList<>();
        for (Employee emp : employees) {
            if (emp.experience() == experience) {
                result.add(emp);
            }
        }
        return result;
    }

    public List<String> findPhoneNumbersByName(String name) {
        return employees
                .stream()
                .filter(emp -> emp.name().equals(name))
                .map(Employee::phoneNumber)
                .toList();
    }

    public Employee findEmployeeById(int id) {
        for (Employee emp : employees) {
            if (emp.id() == id)
                return emp;
        }
        return null;
    }
}
