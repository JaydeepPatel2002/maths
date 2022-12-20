package math282a1q6;
public abstract class ACFunction implements IFunction{
    public abstract double calculate(double x);

    public double findZero(/*Function->this*/double xPos , double xNeg , double precision)
    {
    	
    	
    	
    	
    	
        double guess = 0.0;
        boolean keepGoing = true;
        while(keepGoing)
        {
            guess = (xPos+xNeg)/2.0;
            double y = this.calculate(guess);
            if(y==0.0)
            {
                keepGoing=false;
            }
            else if(y>0.0)
            {
                xPos=guess;
            }
            else {
                xNeg=guess;
            }
            
            if(Math.abs(xPos-xNeg)<=precision) keepGoing =false;
        }
        return guess;
    }

    @Override
    public void printTable(double dStart, double dEnd, double dStep) throws IllegalArgumentException {
        if(dStart>dEnd) throw new IllegalArgumentException("Start must < End");
        if(dStep<=0) throw new IllegalArgumentException("Step must >0");
        System.out.println("x\tf(x)");
        System.out.println("===\t======");
        
        //error checking code here
        
        
        
        for(double x = dStart;x<=dEnd;x+=dStep)
                	
            System.out.println(x+"\t"+this.calculate(x));
        
    
    }
    
    
    //error checking code here    ===============================================================================================================
    //error checking code here    ===============================================================================================================
    //error checking code here    ===============================================================================================================
    //error checking code here    ===============================================================================================================
    @Override
    public void modifiedprintTable(double dStart, double dEnd, double dStep) throws IllegalArgumentException {
        if(dStart>dEnd) throw new IllegalArgumentException("Start must < End");
        if(dStep<=0) throw new IllegalArgumentException("Step must >0");
        System.out.println("x\tf(x)");
        System.out.println("===\t======");
        
        //error checking code here
        double prev = dStart;
        
        
        
        for(double x = dStart;x<=dEnd;x+=dStep)
        {
        	double prevResult = this.calculate(prev);
        	double currentResult = this.calculate(x);
			if (prevResult*currentResult < 0)
			{
	            System.out.println(prev+"\t"+prevResult);

	            System.out.println(x+"\t"+currentResult);

			}
			
			prev = x;
        	
        }
        	   
    }
}
