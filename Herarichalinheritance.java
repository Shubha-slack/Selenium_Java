package Shubhadip.AxisBank;

public class Herarichalinheritance {
    
	
	public static void main(String[] args) {
        ComputerScienceDepartment csDepartment = new ComputerScienceDepartment();
        csDepartment.collegeInfo();    // Calls method from College class
        csDepartment.departmentInfo(); // Calls method from EngineeringDepartment class
        csDepartment.csInfo();         // Calls method from ComputerScienceDepartment class
    }
}

// Parent Class
class College {
    void collegeInfo() {
        System.out.println("This is ABC Engineering College.");
    }
}

// Intermediate Child Class
class EngineeringDepartment extends College {
    void departmentInfo() {
        System.out.println("This is an Engineering Department.");
    }
}

// Final Child Class
class ComputerScienceDepartment extends EngineeringDepartment {
    void csInfo() {
        System.out.println("This is the Computer Science Department.");
    }
}
