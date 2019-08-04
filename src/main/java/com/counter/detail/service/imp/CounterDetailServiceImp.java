package com.counter.detail.service.imp;

import java.util.Optional;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.counter.detail.controller.dto.CounterDetailDto;
import com.counter.detail.exception.BusinessException;
import com.counter.detail.model.CounterDetail;
import com.counter.detail.repository.CounterDetailRepository;
import com.counter.detail.service.CounterDetailService;

/**
* 
* @author Wanessa Nascimento
*
*/
@Service
public class CounterDetailServiceImp implements CounterDetailService {
	
	private static final Logger LOGGER = LoggerFactory.getLogger(CounterDetailServiceImp.class);

	@Autowired
	private CounterDetailRepository counterDetailRepository;

	@Override
	public CounterDetailDto getCounterDetail(Long id) throws BusinessException {
		LOGGER.info("Call service to get Counter Detail");
		Optional<CounterDetail> counterDetail = counterDetailRepository.findById(id);
		if (counterDetail.isPresent()) {
			return new CounterDetailDto(counterDetail.get());
		}
		throw new BusinessException("Counter does not exists");
	}
}
