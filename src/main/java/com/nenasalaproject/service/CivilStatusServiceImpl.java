package com.nenasalaproject.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.nenasalaproject.dao.CivilStatusDao;
import com.nenasalaproject.entity.CivilStatus;

@Service
public class CivilStatusServiceImpl implements CivilStatusService {
	
	@Autowired
	@Qualifier("civilStatusDao")
	private CivilStatusDao civilStatusDao;

	public List<CivilStatus> getAll() {
		// TODO Auto-generated method stub
		return civilStatusDao.getAll();
	}

}
