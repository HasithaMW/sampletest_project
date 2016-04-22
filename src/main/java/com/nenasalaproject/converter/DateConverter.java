package com.nenasalaproject.converter;

import java.util.Date;
import java.text.ParseException;
import java.text.SimpleDateFormat;

import org.springframework.core.convert.converter.Converter;

import com.nenasalaproject.common.CommonValidity;

public class DateConverter implements Converter<String, Date> {

	public Date convert(String date) {
		// TODO Auto-generated method stub
		try {
			if(CommonValidity.validateDate(date)){
				return new SimpleDateFormat("yyyy-MM-dd").parse(date);		// Convert parsing string to date.
			}
		} catch (ParseException e) {
			e.printStackTrace();
		}
		return null;
	}

}
