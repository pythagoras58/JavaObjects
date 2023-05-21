package inheritance;

public class EmpClass {

    private int empId;

    private String name;

    private String empDate;

    public EmpClass() {
    }

    public EmpClass(int empId, String name, String empDate) {
        this.empId = empId;
        this.name = name;
        this.empDate = empDate;
    }

    public int getEmpId() {
        return empId;
    }

    public void setEmpId(int empId) {
        this.empId = empId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmpDate() {
        return empDate;
    }

    public void setEmpDate(String empDate) {
        this.empDate = empDate;
    }
}
