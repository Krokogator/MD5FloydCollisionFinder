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

    public static byte[] trim(byte[] input, int trimsize){
        byte[] trimmed = new byte[trimsize];
        for(int i=0;i<trimsize;i++){
            trimmed[i] = input[i];
        }

        return trimmed;
    }

    public static boolean compare(byte[] array1, byte[] array2){
        if(array1.length!=array2.length){ return false; }
        for(int i=0; i<array1.length; i++){
            if(array1[i]!=array2[i]){ return false; }
        }

        return true;
    }

    public static String binaryToHexString(byte[] input){
        return DatatypeConverter.printHexBinary(input);
    }


}
