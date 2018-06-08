package com.javapapers.java;

import java.nio.charset.Charset;
import java.security.Key;

import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

import org.apache.commons.codec.binary.Base64;
import org.apache.commons.codec.binary.Hex;

public class EncryptionTest {

    private static final Charset ASCII = Charset.forName("US-ASCII");

    public static void main(String[] args) throws Exception {
    	String toBeEnc = "BIeBeGQmBE3V/y0sG8+p47ytTqrKlhhP2QfNdcDhJV77oVt6i7qo9EcfqhpPEZTplQoALC4xOZzJc6LZA7El+0mWOb3Qk1gVHYxgikOyiQryw1SAtNQVaA7+uXIU5CbqYYSsYkU5Sl3KoY31rozqeg==";
       byte[] base64Cipher = Base64.decodeBase64(toBeEnc);
    //	byte[] encryptedMessageInBytes =toBeEnc.getBytes(");  
  
        byte [] iv = "wiertest4Bvq75DG".getBytes();
        //byte [] keyBytes = "pOWaTbO92LfXbh69JkYzfT7P465TNc0h".getBytes("UTF-8");
      
        
//        //SecretKey aesKey = new SecretKeySpec(keyBytes, "AES");
//
//        Cipher cipher = Cipher.getInstance("AES/CBC/PKCS5Padding"); 
//        SecretKeySpec secretKeySpecification = new SecretKeySpec(keyBytes, "AES");  
//        cipher.init(Cipher.DECRYPT_MODE, secretKeySpecification, new IvParameterSpec(iv)); 
//        byte[] decryptedTextBytes = cipher.doFinal(encryptedMessageInBytes);  
//        String origMessage = new String(decryptedTextBytes); 

        //System.out.println(origMessage);
        
        byte[] keyBytes = "pOWaTbO92LfXbh69JkYzfT7P465TNc0h".getBytes();
        Key key = new SecretKeySpec(keyBytes, "AES");
        Cipher c = Cipher.getInstance("AES");
        IvParameterSpec ivector= new IvParameterSpec(iv);
        c.init(Cipher.DECRYPT_MODE, key,ivector);
        byte[] decValue = c.doFinal(base64Cipher);
        String decryptedValue = new String(decValue);
      System.out.println(decryptedValue);
    }

}