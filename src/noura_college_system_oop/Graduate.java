package noura_college_system_oop;

public class Graduate extends Student{

	// Attributes - Data filed
	private String Bachelor_major;
	private String GRE_score;

      //Default Constructor
    public Graduate() {
       super();
    }
        // Overlaoding multi arguments CONSTRUCTOR

    public Graduate(String Bachelor_major, String GRE_score) {
        this.Bachelor_major = Bachelor_major;
        this.GRE_score = GRE_score;
    }

    public Graduate(String Bachelor_major, String GRE_score, String namely_roll_number, String name, String major, String college, String GPA) {
        super(namely_roll_number, name, major, college, GPA);
        this.Bachelor_major = Bachelor_major;
        this.GRE_score = GRE_score;
    }
    
    
      
	// Getter and Setter Methods

	public String getUnderGradDeg(){
		return this.Bachelor_major;
	}

	public void setUnderGradDeg(String a){
		this.Bachelor_major = a;
	}

	public String getUnderGradIns(){
		return this.GRE_score;
	}

	public void setUnderGradIns(String b){
		this.GRE_score = b;
	}
        
        //print the nice summary when student objects is printed

    @Override
    public String toString() {
        return super.toString() + "Graduate{" + "Bachelor_major=" + Bachelor_major + ", GRE_score=" + GRE_score + '}';
    }
        
}

// End of Graduate class