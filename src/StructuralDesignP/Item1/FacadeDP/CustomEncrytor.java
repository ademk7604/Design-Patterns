package StructuralDesignP.Item1.FacadeDP;

import StructuralDesignP.Item1.FacadeDP.EncryptorFacade.EncType;

public class CustomEncrytor {
	public static void main(String[] args) {
		String text = "Content";
		
		// schlechte Weg
		AESEncryptor aesEncryptor = new AESEncryptor();
		aesEncryptor.encrypt(text);
		
		MD5Encryptor md5Encryptor = new MD5Encryptor();
		md5Encryptor.encrypt(text, text);
		
		SHAEncryptor shaEncryptor = new SHAEncryptor();
		shaEncryptor.encrypt(text, text, true);
		
		
		EncryptorFacade encryptorFacade = new EncryptorFacade();
		encryptorFacade.encrypt(text, EncType.MD5);
		
		
		
	}

}
