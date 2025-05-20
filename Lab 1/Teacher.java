public class Teacher {
    String id;
    String name;
    String hometown;
    public void doClass() {
        System.out.println( "Teaching Properly");
    }
    public void doEvaluation() {
        System.out.println("Evaluating Student Assignment");
    }
    public void display() {
        System.out.println();
        System.out.println("----- Teacher Information -----");
        System.out.println("ID "+"           : " + id);
        System.out.println("Name "+"         : " + name);
        System.out.println("Hometown"+"      : " + hometown);
    }
}
