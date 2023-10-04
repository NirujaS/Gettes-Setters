class Student {
    private String name;
    private int age;
    private char grade;

    // Default constructor
    public Student() {
        name = "Unknown";
        age = 0;
        grade = ' ';
    }

    // Parameterized constructor with name, age, and grade
    public Student(String name, int age, char grade) {
        this.name = name;
        this.age = age;
        this.grade = grade;
    }

    // Parameterized constructor with name and age, default grade 'N'
    public Student(String name, int age) {
        this.name = name;
        this.age = age;
        this.grade = 'N';
    }

    // Method to display student information
    public void displayInfo() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Grade: " + grade);
    }
}