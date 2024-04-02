import java.util.HashMap;
public class Main {
    public static void main(String[] args) {
        // Creates a HashMap object
        HashMap<String, Integer> classGrades = new HashMap<String, Integer>();

        int classCount = 0;
        // Add keys and values (Class, Grade)
        classGrades.put("Comp", 97);
        classGrades.put("AP Calc", 99);
        classGrades.put("Programming", 102);
        classGrades.put("AP Computer Science", 95);
        classGrades.put("AP Physics", 100);
        classCount = classGrades.size();
        System.out.println("Grades by Subject:");
        for (int i = 0; i < classGrades.size(); i++) {
            System.out.println("%-10s %5d", classGrades.getKey(i), classGrades.getValue(i));
        }
        System.out.println("Number of Classes: " + classCount);
    }
}