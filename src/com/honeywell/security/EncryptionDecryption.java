package com.honeywell.security;

public class EncryptionDecryption {

	public static void main(String[] args) throws Exception {
        // TODO Auto-generated method stub
 
		String dStr = "tzu7A+Fi+lPntf+DonVKcmMmVUUgPzjr1P8avwIakFaT4EMW9r1zw7O3LXJWOZG1ADTOLNYjYnVfz/ElaS5ie8bjkRwR+I/1+RV+EnLrJJXmsux1w2n90M3JY3ihc8+YujIXueUeuQ3R/SbxCvzrn+0l2NatyfNSOKF7BAf2MBg=";
        AESDemo d = new AESDemo();
             
       // System.out.println("Encrypted string:" + d.encrypt("Hello"));           
        //String encryptedText = d.encrypt("Hello");
        System.out.println("Decrypted string:" + d.Decrypt(dStr));         
 
    }
}