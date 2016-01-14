package com.my.metadata.dao.impl;

import java.util.List;

import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import com.my.metadata.dao.metadataDao;
import com.my.metadata.model.metadata;

public class metadataDaoImpl extends HibernateDaoSupport implements metadataDao{
	
	public void save(metadata metadata){
		getHibernateTemplate().save(metadata);
	}
	
	public void update(metadata metadata){
		getHibernateTemplate().update(metadata);
	}
	
	public void delete(metadata metadata){
		getHibernateTemplate().delete(metadata);
	}
	
	public metadata findBymetadataCode(String metadataCode){
		List list = getHibernateTemplate().find(
                      "from metadata where metadataCode=?",metadataCode
                );
		return (metadata)list.get(0);
	}

}