package com.counter.detail.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.util.UriComponentsBuilder;

import com.counter.detail.controller.dto.CounterDetailDto;
import com.counter.detail.exception.BusinessException;
import com.counter.detail.service.CounterDetailService;

/**
* This class is a controller to consult a counter detail. 
*
* @author Wanessa Nascimento
*/

@RestController
@RequestMapping("/counter")
public class CounterDetailController {
	
	@Autowired
	private CounterDetailService service;
	
    /**
     * Adding a new user to receive a password.
     *
     * @param Long - counter id 
     * @return A CounterDetailDto with the counter detail information
     * @throws BusinessException 
     */
    @GetMapping
    public ResponseEntity<CounterDetailDto> getCounterDetail(@RequestParam @Valid Long id, 
    		UriComponentsBuilder uriBuilder) throws BusinessException {
    	CounterDetailDto dto = service.getCounterDetail(id);
    	return ResponseEntity.ok().body(dto);
    }
}
