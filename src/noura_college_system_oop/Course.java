package noura_college_system_oop;


public class Course{
    
     // Attributes - Data filed  
        private String course_number;
        private String title;
	private String major;
         private String college;
	private String Cerdit_hours;

     // Default CONSTRUCTOR

    public Course(){
    }
    
      // Overlaoding multi arguments CONSTRUCTOR
    public Course(String course_number, String title, String major, String college, String Cerdit_hours) {
        this.course_number=course_number;
        this.title = title;
        this.major = major;
        this.college = college;
        this.Cerdit_hours = Cerdit_hours;
    }

   
    
// Getter and Setter Methods

    public String getCourse_number() {
        return course_number;
    }

    public void setCourse_number(String course_number) {
        this.course_number = course_number;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
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

    public String getCerdit_hours() {
        return Cerdit_hours;
    }

    public void setCerdit_hours(String Cerdit_hours) {
        this.Cerdit_hours = Cerdit_hours;
    }
    
    //print the nice summary when student objects is printed

    @Override
    public String toString() {
        return "Course{" + "course_number=" + course_number + ", title=" + title + ", major=" + major + ", college=" + college + ", Cerdit_hours=" + Cerdit_hours + '}';
    }
      
}

// End of Course class
