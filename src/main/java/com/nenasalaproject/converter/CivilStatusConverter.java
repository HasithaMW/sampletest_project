package com.nenasalaproject.converter;

import org.springframework.core.convert.converter.Converter;

import com.nenasalaproject.entity.CivilStatus;

public class CivilStatusConverter implements Converter<String, CivilStatus> {

	public CivilStatus convert(String source) {
		// TODO Auto-generated method stub
		System.out.println(source);
		return !source.isEmpty()? new CivilStatus(Integer.valueOf(source),null):null;
	}

}
