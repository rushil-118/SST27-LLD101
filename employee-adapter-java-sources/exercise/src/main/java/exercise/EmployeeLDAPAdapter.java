package exercise;

public class EmployeeLDAPAdapter implements Employee{
    private EmployeeLDAP employeeLDAP;
    public EmployeeLDAPAdapter(EmployeeLDAP employeeLDAP){
        this.employeeLDAP = employeeLDAP;
    }

    @Override
    public String getId() {
        return this.employeeLDAP.get("uid");
    }

    @Override
    public String getFirstName() {
        return this.employeeLDAP.get("givenName");
    }

    @Override
    public String getLastName() {
        return this.employeeLDAP.get("sn");
    }

    @Override
    public String getEmail() {
        return this.employeeLDAP.get("mail");
    }
}
