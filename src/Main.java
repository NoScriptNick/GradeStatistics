public class Main {
    public static void main(String[] args) {
        // Creates a HashMap object
        HashMap<String, Integer> classGrades = new HashMap<String, Integer>();

        int classCount = 0;
        String highClass ="";
        String lowClass = "";
        int high = -1;
        int low = 1000;
        int sum = 0;
        int avg = 0;
        // Add keys and values (Class, Grade)
        classGrades.put("Comp", 97);
        classGrades.put("AP Calc", 99);
        classGrades.put("Programming", 102);
        classGrades.put("AP Computer Science", 95);
        classGrades.put("AP Physics", 100);
        classCount = classGrades.size();
        System.out.println("Grades by Subject:");
        for (String subject: classGrades.keySet()) {
            System.out.printf("\n%-20s %5d", subject, classGrades.get(subject));
            if (classGrades.get(subject) < low) {
                low = classGrades.get(subject);
                lowClass = subject;
            }
            if (classGrades.get(subject) > high) {
                high = classGrades.get(subject);
                highClass = subject;
            }
            sum = sum + classGrades.get(subject);
        }
        avg = sum/classCount;
        System.out.println("\nNumber of Classes: " + classCount);
        System.out.println("Highest Grade:" +"\n"+ highClass + ": " + high);
        System.out.println("Lowest Grade:" +"\n"+ lowClass + ": " + low);
        System.out.println("Average Grade: " + avg);

    }
}
