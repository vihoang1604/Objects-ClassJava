package Exercise1;

public class Employee {
    private String firstName;
    private String lastName;
    private double Salary;
    public Employee(){

    }
    public Employee(String firstname,String lastname,double salary){
        firstName=firstname;
        lastName=lastname;
        Salary=salary;
    }
    public void setFirstName(String firstname){
        this.firstName=firstname;
    }
    public String getFirstName(){
        return firstName;
    }
    public void setLastName(String lastname){
        this.lastName=lastname;
    }
    public String getLastName(){
        return lastName;
    }
    public void setSalary(double salary){
       this.Salary=salary;
    }
    public double getSalary(){
        if (Salary < 0) {
            return 0.0;
        }
        return Salary;
    }
    public double nextSalary(double salary) {
        return salary + salary *10/100;
    }

    @Override
    public String toString() {
        return "Full Name "+lastName +" "+ firstName +" - Salary "+Salary +" - Next Salary "+nextSalary(Salary);
    }
    public static void main(String [] args){
        Employee employee1 = new Employee();
        employee1.setFirstName("Hoang");
        employee1.setLastName("Vi");
        employee1.setSalary(3000000);
        System.out.println(employee1.toString());

        Employee employee2 = new Employee();
        employee2.setFirstName("Tran");
        employee2.setLastName("Thao");
        employee2.setSalary(4000000);
        System.out.println(employee2.toString());
    }
}
