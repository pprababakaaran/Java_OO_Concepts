package com.honeywell.security;

import java.security.Key;
import java.security.spec.KeySpec;
import java.util.Base64;

import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.PBEKeySpec;
import javax.crypto.spec.SecretKeySpec;
 
public class AESDemo {
 
	public String Encrypt(String raw) throws Exception {
	      Cipher c = getCipher(Cipher.ENCRYPT_MODE);

	      byte[] encryptedVal = c.doFinal(raw.getBytes("UTF-8"));
	      return  Base64.getEncoder().encodeToString(encryptedVal);
	  }

	  private static Cipher getCipher(int mode) throws Exception {
	      Cipher c = Cipher.getInstance("AES/CBC/PKCS5Padding");

	      //a random Init. Vector. just for testing
	      byte[] iv = "pOWaTbO92LfXbh69".getBytes("UTF-8");

	      c.init(mode, generateKey(), new IvParameterSpec(iv));
	      return c;
	  }

	  public String Decrypt(String encrypted) throws Exception {

	      byte[] decodedValue = Base64.getDecoder().decode(encrypted.getBytes());
	      Cipher c = getCipher(Cipher.DECRYPT_MODE);
	      byte[] decValue = c.doFinal(decodedValue);

	      return new String(decValue);
	  }

	  private static Key generateKey() throws Exception {
	      SecretKeyFactory factory = SecretKeyFactory.getInstance("PBKDF2WithHmacSHA1");
	      char[] password = "wiertest".toCharArray();
	      byte[] salt = "4Bvq75DG".getBytes("UTF-8");

	      KeySpec spec = new PBEKeySpec(password, salt, 65536, 128);
	      SecretKey tmp = factory.generateSecret(spec);
	      byte[] encoded = tmp.getEncoded();
	      return new SecretKeySpec(encoded, "AES");

	  }
}