package cn.wutest.service.impl;

import java.util.List;

import cn.wutest.dao.BaseDictDao;
import cn.wutest.domain.BaseDict;
import cn.wutest.service.BaseDictService;



public class BaseDictServiceImpl implements BaseDictService {
	
	private BaseDictDao bdd;
	
	@Override
	public List<BaseDict> getListByTypeCode(String dict_type_code) {
		return bdd.getListByTypeCode(dict_type_code);
	}

	public void setBdd(BaseDictDao bdd) {
		this.bdd = bdd;
	}

	
}
