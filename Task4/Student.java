package Task4;

//Custom exception for invalid age
class AgeNotWithinRangeException extends Exception {
 public AgeNotWithinRangeException(String message) {
     super(message);
 }
}

//Custom exception for invalid name
class NameNotValidException extends Exception {
 public NameNotValidException(String message) {
     super(message);
 }
}

class Student {
 private int rollNumber;
 private String name;
 private int age;
 private String course;

 //  student details
 public Student(int rollNumber, String name, int age, String course) throws AgeNotWithinRangeException, NameNotValidException {
     this.rollNumber = rollNumber;
     setName(name);
     setAge(age);
     this.course = course;
 }

 //to validate and set the name
 public void setName(String name) throws NameNotValidException {
     if (!name.matches("[a-zA-Z]+")) { // Name should only contain letters
         throw new NameNotValidException("Name should not contain numbers or special characters.");
     }
     this.name = name;
 }

 // validate and set the age
 public void setAge(int age) throws AgeNotWithinRangeException {
     if (age < 15 || age > 21) {
         throw new AgeNotWithinRangeException("Age should be between 15 and 21.");
     }
     this.age = age;
 }

 // student details
 public void displayDetails() {
     System.out.println("Roll Number: " + rollNumber);
     System.out.println("Name: " + name);
     System.out.println("Age: " + age);
     System.out.println("Course: " + course);
 }

 // Main method 
 public static void main(String[] args) {
     try {
         Student student1 = new Student(8042, "Sai", 20, "data science");
         student1.displayDetails();


     } catch (AgeNotWithinRangeException | NameNotValidException e) {
         System.out.println(e.getMessage());
     }
 }
}



