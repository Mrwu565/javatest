package cn.wutest.service;

import org.hibernate.criterion.DetachedCriteria;

import cn.wutest.domain.LinkMan;
import cn.wutest.utils.PageBean;

public interface LinkManService {
	//保存联系人
	void save(LinkMan linkMan);
	//联系人列表
	public PageBean getPageBean(DetachedCriteria dc, Integer currentPage, Integer pageSize);
	//根据id获得LinkMan对象
	LinkMan getById(Long lkm_id);

}
