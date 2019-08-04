package com.counter.detail.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.counter.detail.model.CounterDetail;

/**
* 
* @author Wanessa Nascimento
*
*/
public interface CounterDetailRepository extends JpaRepository<CounterDetail, Long> {
	
}
