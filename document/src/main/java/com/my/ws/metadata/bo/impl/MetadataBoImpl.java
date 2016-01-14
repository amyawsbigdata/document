package com.my.metadata.bo.impl;

import com.my.metadata.bo.MetadataBo;
import com.my.metadata.dao.MetadataDao;
import com.my.metadata.model.Metadata;

public class metadataBoImpl implements metadataBo{
	
	MetadataDao metadataDao;
	
	public void setMetadataDao(metadataDao metadataDao) {
		this.metadataDao = metadataDao;
	}

	public void save(Metadata metadata){
		metadataDao.save(metadata);
	}
	
	public void update(Metadata metadata){
		metadataDao.update(metadata);
	}
	
	public void delete(Metadata metadata){
		metadataDao.delete(metadata);
	}
	
	public Metadata findByMetadataId(int id){
		return metadataDao.findBymetadataId(id);
	}
}