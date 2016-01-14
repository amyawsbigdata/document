package com.my.ws.metadata.bo;

import com.my.ws.metadata.model.Metadata;

public interface MetadataBo {
	
	void save(Metadata metadata);
	void update(Metadata metadata);
	void delete(Metadata metadata);
	Metadata findByMetadataId(int id);
}