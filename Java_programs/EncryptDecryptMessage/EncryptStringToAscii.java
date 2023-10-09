package EncryptDecryptMessage;

public class EncryptStringToAscii {
    public static void main(String[] args) {
        String encryptStringMessage = "Hello I Am Tejswini Wannewar ";
        System.out.println("Message We Are Encrypting : -> " + encryptStringMessage);
    }

    public static String encryptToASCII(String message) {
        StringBuilder encrypted = new StringBuilder();
        for (char character : message.toCharArray()) {
            int asciiValue = (int) character;
            encrypted.append(asciiValue).append(" ");
        }
        return encrypted.toString();
    }
}