package Shubhadip.AxisBank;

//Base Class// main class

class EngineeringDepartment {
 String departmentName;
 String headOfDepartment;

 EngineeringDepartment() {
    
 }

 void displayDepartmentInfo() {
     System.out.println("Department Name: " + departmentName);
     System.out.println("Head of Department: " + headOfDepartment);
 }
}

//Child Class for Computer Science DPT

class ComputerScienceDepartment extends EngineeringDepartment {
 ComputerScienceDepartment(String hod) {
     departmentName = "Computer Science"; 
     headOfDepartment = hod;              
 }
}

//Child Class for ECE


class ECEDepartment extends EngineeringDepartment {
 ECEDepartment(String hod) {
     departmentName = "Electronics and Communication Engineering"; 
     headOfDepartment = hod;                                      
 }
}


//Main Class
public class MultilevelInheritanceExample {
 public static void main(String[] args) {
     ComputerScienceDepartment csDepartment = new ComputerScienceDepartment("Dr. Anupam Mukharhjee");     // instance for CS
     ECEDepartment eceDepartment = new ECEDepartment("Dr.Debaditya Kundu");                          //instance for ECE

     System.out.println("Computer Science Department Info:");
     csDepartment.displayDepartmentInfo();

     System.out.println(); 

     System.out.println("ECE Department Info:");
     eceDepartment.displayDepartmentInfo();
 }
}
