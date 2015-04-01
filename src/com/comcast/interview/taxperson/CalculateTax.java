package com.comcast.interview.taxperson;

/**
 * Created by Gowthami on 4/1/15.
 */
public class CalculateTax {


    //Assumption is price is always in pennies and question says single item. So not using list here
    public  Long calculate(int price, boolean isLuxury) throws ZeroLessThanZeroException{
        if(price <= 0){
            throw new ZeroLessThanZeroException("Price Cannot be '0' or less than '0'. The value user entered is : " + price);
        }
        long finalPrice;
            if(!isLuxury){
                finalPrice = (long) Math.abs(price*1.01);
            } else{
                finalPrice = (long) Math.abs(price*1.09);
            }

        return finalPrice;
    }



}
