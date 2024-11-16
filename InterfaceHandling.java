package Shubhadip.AxisBank;

public class InterfaceHandling { // Main class
    public static void main(String[] args) {
        ShibaInu D = new ShibaInu(); // Creating an instance of ShibaInu
        D.method1(); 
        D.method2(); 
        D.method3(); 
    }
}

interface I1 { 
    void method1(); 
    void method2(); 
}
interface I2{
	 void method4();
	 void method5();
}


class ShibaInu implements I1 ,I2 { 
    public void method1() { 
        System.out.println("Dogs are very loyal, abstract method1");
    }

    public void method2() {
        System.out.println("They love to be with their family, abstract method 2");
    }

    public void method3() { 
        System.out.println("Dogs bite everyone, non-abstract method 3");
    }
    public void method4() {
    	System.out.println("");
    }
}
 