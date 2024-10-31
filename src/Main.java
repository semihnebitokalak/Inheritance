public class Main {
    public static void main(String[] args){
        Customer customer = new Customer();
        Employee employee = new Employee();

        CustemerManager custemerManager = new CustemerManager();
        EmployeeManager employeeManager = new EmployeeManager();

        custemerManager.Add();
        employeeManager.List();
        employeeManager.BestEmployee();

    }
}