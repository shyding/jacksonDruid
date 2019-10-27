package cn.kiiwii.framework.service.impl;

import java.math.BigDecimal;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;

public class TestVo {

	@JsonProperty(defaultValue="0")
	BigDecimal ab;
	
	String cd;
	
	List<String> list;
	
	
	
	public List<String> getList() {
		return list;
	}

	public void setList(List<String> list) {
		this.list = list;
	}

	public String getCd() {
		return cd;
	}

	public void setCd(String cd) {
		this.cd = cd;
	}

	public BigDecimal getAb() {
		return ab;
	}

	public void setAb(BigDecimal ab) {
		this.ab = ab;
	}
	
	
}
