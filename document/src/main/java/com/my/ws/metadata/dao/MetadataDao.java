package com.my.metadata.dao;

import com.my.metadata.model.Metadata;

public interface MetadataDao {
	
	void save(Metadata metadata);
	void update(Metadata metadata);
	void delete(Metadata metadata);
	Metadata findByMetadataId(int id);

}