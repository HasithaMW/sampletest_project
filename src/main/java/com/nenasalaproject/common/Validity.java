/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.nenasalaproject.common;

/**
 *
 * @author Hasitha
 */
public class Validity {
    
    public static boolean personName(String name){
        return name.matches(RegexPool.PERSONNAME);  
    }
    
    public static  boolean nicNo(String no){
        return no.matches(RegexPool.NIC);
    }
    
    public static  boolean mobileNo(String no){
        return no.matches(RegexPool.MOBILEPHONENO);
    }
    
    public static  boolean landNo(String no){
        return no.matches(RegexPool.LANDPHONENO);
    }
    
    public static  boolean email(String no){
        return no.matches(RegexPool.EMAILADDRESS);
    }
    
    public static  boolean address(String no){
        return no.matches(RegexPool.ADDRESS);
    }
    
//    public static boolean  employeeId(String id){
//        return id.matches("elsb\\d{6}");
//    }
//    public static boolean  purchaseOrderNo(String id){
//        return id.matches("po\\d{6}");
//    }
    
    public static boolean  password(String password){
        return password.length()>3;
    }
    
    public static boolean decimalNumber(String number){
        return number.matches(RegexPool.DECIMALNO);
    }
    
    public static boolean price(String number){
        return number.matches(RegexPool.PRICE);
    }
    
}
