package math282a1q6;

public class App {


    public static void main(String[] args) {
//        IFunction func1 = new Function1();
//        func1.printTable(-3.0,3.0,1.0);
//        func1.modifiedprintTable(-3.0,3.0,1.0);
//
//        IFunction func2 = new Function2();
//        func2.printTable(-5.0,5.0,0.5);
//        System.out.println(func2.findZero(2.5, 2.0 , 1E-7));
        
//        IFunction func3 = new Function3();
//        func3.printTable(-1.3,-1.0,0.005);
//        System.out.println(func3.findZero(-1.0, -2.0 , 1E-7));
//        
        IFunction func4 = new Function4();
        func4.printTable(-50,50,1);
        System.out.println(func4.findZero(-2.0, 2.0 , 1E-7));
    }
}
