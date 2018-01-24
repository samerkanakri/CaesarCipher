
import java.util.Scanner;

public class Test {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        while(true){
            System.out.print("text to encrypt: ");
            String plain_text = scan.next();
            System.out.print("encryption key(must be between 0 and 25): ");
            int encryption_key = scan.nextInt();
            System.out.println(Utility.encrypt(plain_text,encryption_key));

            System.out.print("text to decrypt: ");
            String cipher_text = scan.next();
            System.out.print("encryption key(must be the same key used to encrypt the text): ");
            int decryption_key = scan.nextInt();
            System.out.println(Utility.decrypt(cipher_text,decryption_key));
        }

    }
}