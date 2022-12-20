package math282a1q2;

public class SmallestFloat 
{

public static void main(String[] args) 
{
		
		
		float smallestFloat = 1.0f;
		
		while(1.0f + smallestFloat > 1)
		{
			smallestFloat = smallestFloat/2;
			
			
		}
		
		System.out.println(smallestFloat);
	}


}
