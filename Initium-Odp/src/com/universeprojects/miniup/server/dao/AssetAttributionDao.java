package com.universeprojects.miniup.server.dao;

import java.util.logging.Logger;

import com.universeprojects.cacheddatastore.CachedDatastoreService;
import com.universeprojects.miniup.server.domain.AssetAttribution;

import javassist.bytecode.stackmap.TypeData.ClassName;

public class AssetAttributionDao extends OdpDao<AssetAttribution> {
	private static final Logger log = Logger.getLogger(ClassName.class.getName());

	public AssetAttributionDao(CachedDatastoreService datastore) {
		super(datastore, AssetAttribution.KIND, AssetAttribution.class);
	}

	@Override
	protected Logger getLogger() {
		return log;
	}

}
