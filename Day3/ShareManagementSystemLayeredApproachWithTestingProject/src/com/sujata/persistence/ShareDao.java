package com.sujata.persistence;

import java.util.ArrayList;

import com.sujata.entity.Share;

public interface ShareDao {

	public ArrayList<Share> getAllRecords();
	public int saveRecord(Share share);
	public Share searchShareByName(String name);
}
