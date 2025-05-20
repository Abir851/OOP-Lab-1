public class Main {
    public static void main(String[] args) {
        // Creating a Student object
        Student obj1 = new Student();
        obj1.id = "241-15-851";
        obj1.name = "Yah-Yea Bin Zakaria";
        obj1.cgpa = 3.00f;
        obj1.display();
        obj1.doStudy();
        obj1.doAssignment();
        // Creating a Teacher object
       Teacher obj2 = new Teacher();
       obj2.id = "27537657623";
       obj2.name = "Rafiq";
       obj2.hometown = "Bogura";
       obj2.display();
       obj2.doEvaluation();
       obj2.doClass();
    }
}