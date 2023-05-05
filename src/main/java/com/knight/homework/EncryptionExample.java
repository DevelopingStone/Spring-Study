package com.knight.homework;
/*
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import java.util.Base64;

public class EncryptionExample {
  private static final String KEY = "mysecretkey12345";
  private static final String ALGORITHM = "AES";

  public static void main(String[] args) throws Exception {
    String originalText = "Hello, World!";
    String encryptedText = encrypt(originalText, KEY);
    String decryptedText = decrypt(encryptedText, KEY);

    System.out.println("Original Text : " + originalText);
    System.out.println("Encrypted Text : " + encryptedText);
    System.out.println("Decrypted Text : " + decryptedText);
  }

  public static String encrypt(String plainText, String key) throws Exception {
    SecretKeySpec secretKey = new SecretKeySpec(key.getBytes(), ALGORITHM);
    Cipher cipher = Cipher.getInstance(ALGORITHM);
    cipher.init(Cipher.ENCRYPT_MODE, secretKey);
    byte[] encryptedBytes = cipher.doFinal(plainText.getBytes());
    return Base64.getEncoder().encodeToString(encryptedBytes);
  }

  public static String decrypt(String encryptedText, String key) throws Exception {
    SecretKeySpec secretKey = new SecretKeySpec(key.getBytes(), ALGORITHM);
    Cipher cipher = Cipher.getInstance(ALGORITHM);
    cipher.init(Cipher.DECRYPT_MODE, secretKey);
    byte[] decryptedBytes = cipher.doFinal(Base64.getDecoder().decode(encryptedText));
    return new String(decryptedBytes);
  }
}

*/

public class EncryptionExample {
    public static String caesarCipher(String str, int key) {
      String result = "";
      for (int i = 0; i < str.length(); i++) {
        char c = str.charAt(i);
        if (Character.isLetter(c)) {
          int asciiCode = (int)c + key;
          if (Character.isUpperCase(c)) {
            if (asciiCode > 90) asciiCode = 64 + (asciiCode - 90);
            else if (asciiCode < 65) asciiCode = 91 - (65 - asciiCode);
          } else {
            if (asciiCode > 122) asciiCode = 96 + (asciiCode - 122);
            else if (asciiCode < 97) asciiCode = 123 - (97 - asciiCode);
          }
          result += (char)asciiCode;
        } else {
          result += c;
        }
      }
      return result;
    }














    public static void main(String[] args) {
      String input = "ZeroBase";
      int key = 10;
      String encrypted = caesarCipher(input, key);
      System.out.println("암호화된 문자열: " + encrypted);
      String decrypted = caesarCipher(encrypted, -key);
      System.out.println("복호화된 문자열: " + decrypted);
    }
  }




