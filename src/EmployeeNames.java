public class EmployeeNames {
    public static void main(String[] args) throws Exception {
        String firstName, lastName, fullName;
        int salary;
        int ID;
        Employee James = new Employee("James", "Baker", 500, 2415);
        Employee Margaret = new Employee("Margaret", "Samson", 50000, 4826);
        Margaret.getID();
        System.out.println(James.getSalary());
        James.raiseSalary(23);
        System.out.println(James.getSalary());
        Margaret.raiseSalary(45);
        System.out.println(Margaret.getSalary());
    }
}
