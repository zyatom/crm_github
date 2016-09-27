package com.zhuyan.crm.utils;

import java.math.BigInteger;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

public class MyStringUtils {
	public static String getMD5Value(String value){
		try {
			MessageDigest messageDigest=MessageDigest.getInstance("MD5");
			byte[] digest = messageDigest.digest(value.getBytes());
			BigInteger bigInteger=new BigInteger(1, digest);
			return bigInteger.toString(16);
		} catch (NoSuchAlgorithmException e) {
			return value;
		}
		
	
		
	}
}
