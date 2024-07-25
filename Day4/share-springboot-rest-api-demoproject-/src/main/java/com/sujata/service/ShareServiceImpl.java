package com.sujata.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sujata.entity.Share;
import com.sujata.persistence.ShareDao;

@Service
public class ShareServiceImpl implements ShareService {

	@Autowired
	private ShareDao shareDao;
	
	@Override
	public List<Share> getAllShares() {
		
		return shareDao.findAll();
	}

	@Override
	public Share searchShareById(int shareId) {
		
		return shareDao.findById(shareId).get();
		
	}

}
