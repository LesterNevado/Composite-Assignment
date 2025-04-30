public class Main {
    public static void main(String[] args) {
        // Create students
        Student s1 = new Student("Alice", "001", 30000);
        Student s2 = new Student("Bob", "002", 32000);
        Student s3 = new Student("Charlie", "003", 28000);

        // Create teachers
        Teacher t1 = new Teacher("Prof. John", "Web Development", 50000);
        Teacher t2 = new Teacher("Dr. Doe", "OOP", 60000);

        // Create departments
        Department csDept = new Department("Computer Science");
        csDept.add(t2);
        csDept.add(s1);
        csDept.add(s2);

        Department itDept = new Department("Information Technology");
        itDept.add(t1);
        itDept.add(s3);

        // Create college
        College cicsCollege = new College("College of Informatics and Computing Studies");
        cicsCollege.add(csDept);
        cicsCollege.add(itDept);

        // Output
        System.out.println("Displaying University Structure:");
        cicsCollege.displayDetails();

        System.out.println("\nTotal Students: " + cicsCollege.getNumberOfStudents());
        System.out.println("Total Budget: " + cicsCollege.getBudget());
    }
}
