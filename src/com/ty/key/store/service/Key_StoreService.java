package com.ty.key.store.service;

	import com.ty.key.store.dao.Key_StoreDao;
	import com.ty.key.store.dto.Key_Store;


	public class Key_StoreService {
		
		Key_StoreDao dao = new Key_StoreDao();
		
		public int saveAddress(Key_Store key_Store) {
			return dao.saveKey_Store(key_Store);
		}
		
		
	}



