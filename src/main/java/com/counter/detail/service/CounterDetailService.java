package com.counter.detail.service;

import org.springframework.stereotype.Service;

import com.counter.detail.controller.dto.CounterDetailDto;
import com.counter.detail.exception.BusinessException;

/**
* 
* @author Wanessa Nascimento
*
*/
@Service
public interface CounterDetailService {
	
	CounterDetailDto getCounterDetail(Long id) throws BusinessException;

}
