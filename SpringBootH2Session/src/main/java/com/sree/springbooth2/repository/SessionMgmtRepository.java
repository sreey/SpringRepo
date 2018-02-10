package com.sree.springbooth2.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.sree.springbooth2.domain.SessionMgmt;

@Repository
public interface SessionMgmtRepository extends JpaRepository<SessionMgmt, String> {

}
