
package noura_college_system_oop;

public class Undergraduate extends Student{

	// Attributes - Data filed
	private String High_school;
        private String SAT_score;
        
        
	// Defualt Constructor
	public Undergraduate() {
		super();
	}

        // Overlaoding multi arguments CONSTRUCTOR
    public Undergraduate(String High_school, String SAT_score, String namely_roll_number, String name, String major, String college, String GPA) {
        super(namely_roll_number, name, major, college, GPA);
        this.High_school = High_school;
        this.SAT_score = SAT_score;
    }
        
        
        

	// Getter and Setter Methods

    public String getHigh_school() {
        return High_school;
    }

    public void setHigh_school(String High_school) {
        this.High_school = High_school;
    }

    public String getSAT_score() {
        return SAT_score;
    }

    public void setSAT_score(String SAT_score) {
        this.SAT_score = SAT_score;
    }
    
    
     //print the nice summary when student objects is printed

    @Override
    public String toString() {
        return super.toString() + "Undergraduate{" + "High_school=" + High_school + ", SAT_score=" + SAT_score + '}';
    }
	
}
      // End of Undergraduate class