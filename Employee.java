import java.util.Objects;

public class Employee {
    String lastName;
    String firstName;
    String jobTitle;
    String department;
    double annualSalary;
    double estimatedAnnualMinusFurloughs;

    public Employee(String lastName, String firstName, String jobTitle,
                    String department, double annualSalary, double estMinusFurloughs) {
        this.lastName = lastName;
        this.firstName = firstName;
        this.jobTitle = jobTitle;
        this.department = department;
        this.annualSalary = annualSalary;
        this.estimatedAnnualMinusFurloughs = estMinusFurloughs;
    }

    //add a no-argument constructor
    public Employee() {
        this.lastName = "";
        this.firstName = "";
        this.jobTitle = "";
        this.department = "";
        this.annualSalary = 0.0;
        this.estimatedAnnualMinusFurloughs = 0.0;
    }

    //add getters and setters for each field
    public String getLastName() {
        return lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getJobTitle() {
        return jobTitle;
    }

    public String getDepartment() {
        return department;
    }

    public double getAnnualSalary() {
        return annualSalary;
    }

    public double getEstimatedAnnualMinusFurloughs() {
        return estimatedAnnualMinusFurloughs;
    }

    //an equal() and hashCode() method (use lastName, firstName, and department to determine equality)
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;

        Employee employee = (Employee) obj;

        return lastName.equalsIgnoreCase(employee.lastName) &&
               firstName.equalsIgnoreCase(employee.firstName) &&
               department.equalsIgnoreCase(employee.department);
    }

    @Override
    public int hashCode() {
        return Objects.hash(lastName.toLowerCase(), firstName.toLowerCase(), department.toLowerCase());
    }

    //add toString() method for easy printing
    @Override
    public String toString() {
        return firstName + " " + lastName + " (" + department + ")";
    }

}
