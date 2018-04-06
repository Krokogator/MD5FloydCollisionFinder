import javax.xml.bind.DatatypeConverter;

public class Main {

    public static void main(String[] args) {
        Floyd floyd = new Floyd();
        floyd.search("Eszelegeszelekykky".getBytes(), 3);

        byte[] out1 = floyd.getFirstCollision();
        byte[] out2 = floyd.getSecondCollision();

        //Solution inputs
        System.out.println("Solution inputs");
        System.out.println(MD5.binaryToHexString(out1));
        System.out.println(MD5.binaryToHexString(out2));

        //Solution collisions
        System.out.println("Outputs (collisions)");
        System.out.println(MD5.binaryToHexString(MD5.calc(MD5.calc(out1))));
        System.out.println(MD5.binaryToHexString(MD5.calc(MD5.calc(out2))));
    }
}
