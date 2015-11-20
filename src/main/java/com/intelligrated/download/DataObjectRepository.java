package com.intelligrated.download;

import org.springframework.data.repository.CrudRepository;

import com.intelligrated.download.entity.DataObject;

public interface DataObjectRepository extends CrudRepository<DataObject, Long> {
	// get a lot of stuff for free
	// put custom queries here
}
