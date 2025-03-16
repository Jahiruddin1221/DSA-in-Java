package OOPs;

public class Employee {
    private String name;
    private String jobTitle;
    private double salary;

    public Employee(String name, String jobTitle, double salary) {
        this.name = name;
        this.jobTitle = jobTitle;
        this.salary = salary;
    }

    public String getJobTitle() {
        return jobTitle;
    }

    public void setJobTitle(String jobTitle) {
        this.jobTitle = jobTitle;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    // Method to update salary
    public void addSalary(double newSalary) {
        this.salary = newSalary;
    }

    // After added salary
    public void updateSalary(double percentage) {
        this.salary += (this.salary * percentage / 100);
    }
    public void displayDetails() {
        System.out.println("Employ name: " + name);
        System.out.println("Job title: " + jobTitle);
        System.out.println("Salary: " + salary);
    }

    public static void main(String[] args) {
        Employee e1 = new Employee("Rohan", "Softwer engineer", 8000);
        e1.updateSalary(10);
        e1.displayDetails();
        e1.salary = 1000;
        e1.displayDetails();
        e1.updateSalary(10);
        e1.displayDetails();
        e1.addSalary(5000);
        e1.displayDetails();
        e1.updateSalary(5);
        e1.displayDetails();
        e1.jobTitle = "teacher";
        e1.displayDetails();
    }
}
