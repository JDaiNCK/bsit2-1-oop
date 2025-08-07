public class Main {
    public static void main(String[] args) {
        Student s1 = new Student("Asa Mitaka", 20, "BSIT", 85.0, 90.0, 88.0);
        Student s2 = new Student("Denji", 19, "BSIT", 85.0, 75.0, 75.0);
        Student s3 = new Student("Aki Hayakawa", 21, "BSIT", 95.0, 85.0, 95.0);

        Student[] students = {s1, s2, s3};
        int passing = 0;

        for (Student stdnt : students) {
            stdnt.displayInfo();
            if (stdnt.isPassing()) {
                passing++;
            }
        }

        System.out.println("Overall: " + passing + " out of " +
                students.length + " students are passing. Thank you.");
    }
}