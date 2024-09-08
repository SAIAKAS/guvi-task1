package Task4;

class InvalidVoterAgeException extends Exception {
 public InvalidVoterAgeException(String message) {
     super(message);
 }
}


class Voter {
 private int voterID;
 private String name;
 private int age;


 public Voter(int voterID, String name, int age) throws InvalidVoterAgeException {
     if (age < 18) {
         throw new InvalidVoterAgeException("Invalid age for voter"); // Throw exception if age is less than 18
     }
     this.voterID = voterID;
     this.name = name;
     this.age = age;
 }

// voter details
 public void displayDetails() {
     System.out.println("Voter ID: " + voterID);
     System.out.println("Name: " + name);
     System.out.println("Age: " + age);
 }


 public static void main(String[] args) {
     try {
         
         Voter voter1 = new Voter(101, "Sai", 20);
         voter1.displayDetails();
Voter voter2 = new Voter(210,"akash",11);
voter2.displayDetails();
       
     } catch (InvalidVoterAgeException e) {
         System.out.println(e.getMessage()); 
     }
 }
}

