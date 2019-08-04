package com.counter.detail.controller.dto;

import com.counter.detail.model.CounterDetail;

public class CounterDetailDto {
	
	private Long id;
	
	private String villageName;
	
	public CounterDetailDto() {
	}

	public CounterDetailDto(CounterDetail counterDetail) {
		this.id = counterDetail.getId();
		this.villageName = counterDetail.getVillageName();
	}

	public Long getId() {
		return id;
	}

	public String getVillageName() {
		return villageName;
	}
}
