package pro.sky.employee.exceptions.proskyemployeeexceptions;

public interface EmployeeService {
    Employee addEmployee(String firstName, String lastName);
    Employee deleteEmployee(String firstName, String lastName);
    Employee findEmployee(String firstName, String lastName);

}
