package com.sujata.resource;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.sujata.entity.Share;
import com.sujata.service.ShareService;

@RestController
public class ShareResource {

	@Autowired
	private ShareService shareService;

	@GetMapping(path = "/shares/v1/all",produces = MediaType.APPLICATION_JSON_VALUE)
	public List<Share> getAllShares(){
		return shareService.getAllShares();
	}
	
	@GetMapping(path="/shares/v1/{sId}",produces = MediaType.APPLICATION_JSON_VALUE)
	public Share getShareById(@PathVariable("sId") int id) {
		return shareService.searchShareById(id);
	}
}
