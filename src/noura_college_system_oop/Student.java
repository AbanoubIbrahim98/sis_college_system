package noura_college_system_oop;

public class Student {
    
    // Attributes - Data filed  
        private String namely_roll_number;
        private String name;
	private String major;
         private String college;
	private String GPA;

	// Default CONSTRUCTOR
	public Student() {

	}

        // Overlaoding multi arguments CONSTRUCTOR
    public Student(String namely_roll_number, String name, String major, String college, String GPA) {
        this.namely_roll_number = namely_roll_number;
        this.name = name;
        this.major = major;
        this.college = college;
        this.GPA = GPA;
    }

	// Getter and Setter Methods

    public String getNamely_roll_number() {
        return namely_roll_number;
    }

    public void setNamely_roll_number(String namely_roll_number) {
        this.namely_roll_number = namely_roll_number;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMajor() {
        return major;
    }

    public void setMajor(String major) {
        this.major = major;
    }

    public String getCollege() {
        return college;
    }

    public void setCollege(String college) {
        this.college = college;
    }

    public String getGPA() {
        return GPA;
    }

    public void setGPA(String GPA) {
        this.GPA = GPA;
    }
	

//print the nice summary when student objects is printed

    @Override
    public String toString() {
        return  "namely_roll_number=" + namely_roll_number + ", name=" + name + ", major=" + major + 
                ", college=" + college + ", GPA=" + GPA + '}';
    }

   
    
}
// End of student class