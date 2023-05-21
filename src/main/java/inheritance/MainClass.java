package inheritance;

public class MainClass {
    public static void main(String[] args) {

        EmpClass empClass = new EmpClass();

        empClass.setEmpId(12);
        empClass.setName("Pythagoras web");
        empClass.setEmpDate("2023-05-22");

        System.out.println("=====================EMP DATA============");
        System.out.println("EMP ID =====> " + empClass.getEmpId());
        System.out.println("EMP NAME====> " + empClass.getName());
        System.out.println("EMP DATA====> " + empClass.getEmpDate());
    }
}
