package com.sujata.service;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.sujata.entity.Share;
import com.sujata.persistence.ShareDao;
import com.sujata.persistence.ShareDaoImpl;



public class ShareServiceImpl implements ShareService {

	//Fixing the dependency
//	private ShareDao shareDao=new ShareDaoImpl();
	
	
	private ShareDao shareDao;
	
	public void setShareDao(ShareDao shareDao) {
		this.shareDao = shareDao;
	}

	@Override
	public ArrayList<Share> getAllShares() {
		
		return shareDao.getAllRecords();
	}

	@Override
	public boolean insertNewShare(Share share) {
		
		return shareDao.saveRecord(share)>0;
	}

}
