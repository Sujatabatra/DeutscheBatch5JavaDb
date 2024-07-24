package com.sujata.test;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.when;

import java.util.ArrayList;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;

import com.sujata.entity.Share;
import com.sujata.persistence.ShareDao;
import com.sujata.service.ShareService;
import com.sujata.service.ShareServiceImpl;


class TestShareService {

	
	private ShareServiceImpl shareService;
	
	
	private ShareDao shareDao;
	
	@BeforeEach
	void setUp() throws Exception {

		shareDao=Mockito.mock(ShareDao.class);
		
		shareService=new ShareServiceImpl();
		
		shareService.setShareDao(shareDao);
		
	}
	
	@Test
	void test() {
		//whenevevr mock object method is called , specifing what should be considered as return type
		when(shareDao.searchShareByName("Dabur")).thenReturn(new Share(1,"Dabur",450.90));
		
		Share share= shareService.searchShareByName("Dabur");
		assertEquals(1, share.getShareId());
	}
}
