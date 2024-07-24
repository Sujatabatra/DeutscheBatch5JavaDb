package com.sujata.service;

import java.util.ArrayList;

import com.sujata.entity.Share;

public interface ShareService {

	public ArrayList<Share> getAllShares();
	
	public boolean insertNewShare(Share share);
}
