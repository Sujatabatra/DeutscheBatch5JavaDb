package com.sujata.persistence;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.sujata.entity.Share;

@Repository
public interface ShareDao extends JpaRepository<Share, Integer> {

}
