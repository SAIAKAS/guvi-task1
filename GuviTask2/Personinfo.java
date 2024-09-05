package GuviTask2;

public class Personinfo {
	
	    private String name;
	    private int age;

	
	    public Personinfo(String name, int age) {
	        this.name = name;
	        this.age = age;
	    }

	    // Getter methods
	    public String getName() {
	        return name;
	    }

	    public int getAge() {
	        return age;
	    }

	    // Setter methods
	    public void setName(String name) {
	        this.name = name;
	    }

	    public void setAge(int age) {
	        this.age = age;
	    }

	    //  display person's information
	    public void displayPersonInfo() {
	        System.out.println("Name: " + name);
	        System.out.println("Age: " + age);
	    }
	}

