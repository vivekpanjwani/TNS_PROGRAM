package Exercise_3;

public class Student {
    private String name;
    private int age;
    private String address;

    // Constructor with default values
    public Student() {
        name = "unknown";
        age = 0;
        address = "not available";
    }

    // Method to set name and age
    public void setInfo(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Method to set name, age, and address
    public void setInfo(String name, int age, String address) {
        this.name = name;
        this.age = age;
        this.address = address;
    }

    // Method to display student information
    public void displayInfo() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Address: " + address);
        System.out.println();
    }

    public static void main(String[] args) {
        // Create an array of 10 Student objects
        Student[] students = new Student[10];

        // Initialize the array with Student objects
        for (int i = 0; i < students.length; i++) {
            students[i] = new Student();
        }

        // Set information for each student
        students[0].setInfo("Alice", 20, "123 Main St");
        students[1].setInfo("Bob", 21, "456 Elm St");
        students[2].setInfo("Charlie", 22, "789 Oak St");
        students[3].setInfo("David", 23, "101 Pine St");
        students[4].setInfo("Eve", 24, "202 Cedar St");
        students[5].setInfo("Frank", 25, "303 Birch St");
        students[6].setInfo("Grace", 26, "404 Willow St");
        students[7].setInfo("Hannah", 27, "505 Redwood St");
        students[8].setInfo("Isaac", 28, "606 Sequoia St");
        students[9].setInfo("Jack", 29, "707 Sycamore St");

        // Display information for each student
        for (Student student : students) {
            student.displayInfo();
        }
    }
}

