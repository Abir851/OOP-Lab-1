public class Student {
    String id;
    String name;
    float cgpa;
    public void doStudy() {
        System.out.println("Studying Properly.");
    }
    public void doAssignment() {
        System.out.println("Submitted The Assignment Properly.");
    }
    public void display() {
        System.out.println("----- Student Information -----");
        System.out.println("ID "+"    : " + id);
        System.out.println("Name "+"  : " + name);
        System.out.println("CGPA "+"  : " + cgpa);
    }
}
