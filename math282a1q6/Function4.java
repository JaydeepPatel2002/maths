package math282a1q6;

public class Function4 extends ACFunction{

	public static void main(String[] args) 
	{
		
	}

	@Override
	public double calculate(double x) {
		// TODO Auto-generated method stub
		double exp = Math.exp(x);
		
		double result = 1000000*exp + (435000/x)*(exp - 1) - 1564000 ;
		
		return result ;
	}

}
