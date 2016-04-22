package com.nenasalaproject.common;

public class RegexPool {
	
	public static final String NIC = "\\d{9}[vVxX]";
	public static final String PERSONNAME = "([A-Za-z]+\\s?)+[A-Za-z]";
	public static final String ADDRESS ="[\\w,./'&@()\\s]+";
	public static final String MOBILEPHONENO = "07[125-8]\\d{7}";
	public static final String LANDPHONENO = "0[1-689][1-8][2-579]\\d{6}";
	public static final String EMAILADDRESS = "(([^\"(),:;<>@\\.\\\\\\[\\]\\s]+|\"[^\"(),:;<>@\\.\\\\\\[\\]\\s]+\")+\\.)*\\w+@(\\w+\\.)+\\w{2,13}";
	public static final String DECIMALNO = "\\d+(\\.\\d{2})?";
	public static final String PRICE =  "\\d+(\\.\\d{2})?";
	
}
