package EncryptDecryptMessage;

public class Main {


        public static void main(String[] args) {
            String message = "Hello, World!";
            System.out.println("Original Message: " + message);

            // Encrypt the message to ASCII values
            String encryptedMessage = encryptToASCII(message);
            System.out.println("Encrypted Message (ASCII): " + encryptedMessage);

            // Decrypt the ASCII values back to the original message
            String decryptedMessage = decryptFromASCII(encryptedMessage);
            System.out.println("Decrypted Message: " + decryptedMessage);
        }

        public static String encryptToASCII(String message) {
            StringBuilder encrypted = new StringBuilder();
            for (char character : message.toCharArray()) {
                int asciiValue = (int) character;
                encrypted.append(asciiValue).append(" ");
            }
            return encrypted.toString();
        }

        public static String decryptFromASCII(String asciiMessage) {
            StringBuilder decrypted = new StringBuilder();
            String[] asciiValues = asciiMessage.split(" ");
            for (String asciiValue : asciiValues) {
                int intValue = Integer.parseInt(asciiValue);
                char character = (char) intValue;
                decrypted.append(character);
            }
            return decrypted.toString();
        }
    }

