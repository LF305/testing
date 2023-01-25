public class Employee {
    String firstName, lastName, fullName;
    int salary, ID;
    public Employee(String firstName, String lastName, int salary, int ID){
        this.firstName = firstName;
        this.lastName = lastName;
        this.salary = salary;
        this.ID = ID;
    }
    public String getFirstName(){
        return firstName;
    }
    public String getLastName(){
        return lastName;
    }
    public int getID(){
        return ID;
    }
    public int getSalary(){
        return salary;
    }
    public void raiseSalary(int percent){
        salary += (salary * percent) / 100;
    }
    public String getFullName(){
        return firstName + " " + lastName;
    }
}
/*getFirstName(), getLastName(),
getFullName(), getID(), getSalary(), and raiseSalary(int percent),
*/