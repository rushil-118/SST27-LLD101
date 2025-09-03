package exercise; 


public class EmployeeCSVAdapter implements Employee {
    private EmployeeCSV employeeCSV;

    public EmployeeCSVAdapter(EmployeeCSV employeeCSV){
        this.employeeCSV = employeeCSV;
    }

    @Override
    public String getId() {
        return this.employeeCSV.tokens()[0];
    }

    @Override
    public String getFirstName() {
        return this.employeeCSV.tokens()[1];
    }

    @Override
    public String getLastName() {
        return this.employeeCSV.tokens()[2];
    }

    @Override
    public String getEmail() {
        return this.employeeCSV.tokens()[3];
    }
}
