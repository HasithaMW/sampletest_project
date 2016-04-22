package com.nenasalaproject.converter;

import org.springframework.core.convert.converter.Converter;

import com.nenasalaproject.entity.Gender;

public class GenderConverter implements Converter<String, Gender> {

	public Gender convert(String source) {
		// TODO Auto-generated method stub
		Gender gender;
		System.out.println(source);
		if(source.isEmpty()){
			
			gender =null;
			System.out.println("1111111111111111111111111111111111111111111111111111111111");
		}else{
			gender = new Gender(Integer.valueOf(source), null);
			System.out.println("22222222222222222222222222222222222222222222222222222222222");
		}
		return gender;
	}

}
