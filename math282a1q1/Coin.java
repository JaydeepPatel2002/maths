package math282a1q1;
import java.math.BigDecimal;

/*
 *  Date created:  Fall 2022
 *  Course name:  MATH 282
 *  Instructors:  Michael Grzesina
 *  File name:  CoinCounter.java
 */

/**
 *  Purpose:  Enumerated type representing Canadian coins
 *
 * @author Michael Grzesina
 * @author Andrea Grzesina
 * @version August 30, 2017
 */
public enum Coin
{
	PENNY("Penny", new BigDecimal("0.01")),
    NICKEL("Nickel", new BigDecimal("0.05")),
    DIME("Dime", new BigDecimal("0.10")),
    QUARTER("Quarter", new BigDecimal("0.25")),
    LOONIE("Loonie", new BigDecimal("1.00")),
    TOONIE("Toonie", new BigDecimal("2.00")); 
	 

    
    /**
     * Constructor for the Coin class.
     * 
     * @param coinName  Name of coin
     * @param bigDecimal     Value of coin as Canadian currency
     */
    Coin(String coinName, BigDecimal bigDecimal) 
    { 
        this.coinName = coinName;
        this.value = bigDecimal; 
    } 

    
    /**
     * Name of coin
     */
    private final String coinName;
    
    /**
     * Value of coin as Canadian currency
     */
    private final BigDecimal value; 

    
    /**
     * Method coinName: Provides name of coin
     * 
     * @return  name of coin
     */
    public String coinName()
    {
        return coinName;
    }
    
    
    /**
     * Method value: Provides value of coin as Canadian currency
     * 
     * @return  value of coin
     */
    public BigDecimal value() 
    { 
        return value; 
    }
}