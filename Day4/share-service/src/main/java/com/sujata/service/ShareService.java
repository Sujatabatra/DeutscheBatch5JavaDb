package com.sujata.service;

import java.util.List;

import com.sujata.entity.Share;

public interface ShareService {

	List<Share> getAllShares();
	Share searchShareById(int shareId);
}
