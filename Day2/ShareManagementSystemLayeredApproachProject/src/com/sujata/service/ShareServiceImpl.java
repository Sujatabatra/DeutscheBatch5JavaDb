package com.sujata.service;

import java.util.ArrayList;

import com.sujata.entity.Share;
import com.sujata.persistence.ShareDao;
import com.sujata.persistence.ShareDaoImpl;

public class ShareServiceImpl implements ShareService {

	//service layer is interacting with persistence layer
	private ShareDao shareDao=new ShareDaoImpl();
	
	@Override
	public ArrayList<Share> getAllShares() {
		
		return shareDao.getAllRecords();
	}

	@Override
	public boolean insertNewShare(Share share) {
		
		return shareDao.saveRecord(share)>0;
	}

}
