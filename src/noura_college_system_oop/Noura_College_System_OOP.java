package noura_college_system_oop;

import java.util.ArrayList;



public class Noura_College_System_OOP {

    public static void main(String[] args) {
        
        
        // Declare and initialize objects
        Student std1 = new Student("1234567","Noura", "Computer Science", "Nagran University", "3.9");
        Course course1=new Course("M215","Java", "Object Oriented Programming", "Nagran University", "8");
        Undergraduate undergraduate = new Undergraduate("test1", "110","1454554", "Noura", "ComputerScience", "Nagran University", "3.8");
        Graduate graduate = new Graduate("3214569", "Sara", "Accountant", "Nagran University", "3.2", "Test2", "30");
       
		System.out.println(std1.getNamely_roll_number());
        System.out.println(std1.getName());
		System.out.println(std1.getCollege());
		System.out.println(std1.getMajor());
		System.out.println(std1.getGPA());

        // print string representation of objects
        System.out.println(std1);
        System.out.println(course1);
        System.out.println(undergraduate);
        System.out.println(graduate);
        

         Student mainObj = new Student();
	 ArrayList studentAll= new ArrayList();

	Undergraduate u1 = new Undergraduate();
	Graduate g1 = new Graduate();

		g1.setName("Noura");
		g1.setNamely_roll_number("254896");
		g1.setMajor("ComputerScience");
		g1.setGPA("3.0");
		g1.setUnderGradDeg("B.A. Account");
		g1.setUnderGradIns("KSA");

		u1.setName("Sara");
		u1.setNamely_roll_number("123");
		u1.setMajor("English");
		u1.setGPA("4.0");
		u1.setHigh_school("Nagran University");

		studentAll.add(u1);
		studentAll.add(g1);
                System.out.println(mainObj);
                System.out.println(u1);
                System.out.println(g1);

		//for print

//		for(Student a : studentAll){
//		//—Polymorphism———-
//			a.toString();
//		}



    }
    
}
