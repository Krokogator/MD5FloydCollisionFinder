import javax.xml.bind.DatatypeConverter;
import java.io.UnsupportedEncodingException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

public class MD5 {
    public static byte[] calc(byte[] input){
        MessageDigest md = null;
        try {
            md = MessageDigest.getInstance("MD5");
        } catch (NoSuchAlgorithmException e) {
            e.printStackTrace();
        }

        byte[] thedigest = md.digest(input);

        return thedigest;
    }

    public static byte[] calc(String input){
        byte[] bytesOfMessage = new byte[0];
        try {
            bytesOfMessage = input.getBytes("UTF-8");
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        }
        return calc(bytesOfMessage);
    }

    public static byte[] trim(byte[] input){
        byte[] trimmed = new byte[7];
        for(int i=0;i<trimmed.length;i++){
            trimmed[i] = input[i];
        }

        return trimmed;
    }


}
