package com.leesandbox.frt.seed.util;

public class SeedTest {

	public static void main(String[] args) throws Exception {
		// 암복호화에 사용할 키 생성
		int[] seedKey = SEEDUtil.getSeedRoundKey("12345678901234512345");
		
		String nomalStr = "1234567890";
		System.out.println("orgStr : " + nomalStr);
		
		String encStr = SEEDUtil.getSeedEncrypt(nomalStr, seedKey);
		System.out.println("encStr : " + encStr);
		
		String decStr = SEEDUtil.getSeedDecrypt(encStr, seedKey);
		System.out.println("decStr : " + decStr);
	}
}
