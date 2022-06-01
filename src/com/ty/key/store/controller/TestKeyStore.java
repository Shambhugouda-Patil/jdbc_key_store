package com.ty.key.store.controller;

	import java.util.ArrayList;
	import java.util.List;

	import com.ty.key.store.dao.Key_StoreDao;
	import com.ty.key.store.dto.Key_Store;

	public class TestKeyStore {
		public static void main(String[] args) {
			List<Key_Store> list = new ArrayList();
			Key_Store k = new Key_Store();
//			k.setUid(1);
//			k.setComment("do not forgetten");
//			k.setDescription("facebook");
//			k.setKey("prashi@gmail.com");
//			k.setValue("prashi9743");
			
			Key_StoreDao dao = new Key_StoreDao();
			
//			int res = dao.saveKey_Store(k);
//			if(res > 0) {
//				System.out.println("Data is inserted successfully");
//			}
//			else
//				System.out.println("No data is Exist");
			
			list=dao.getKey_StoreById(k, 1);
			System.out.println(list);
		}
	}



