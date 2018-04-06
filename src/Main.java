public class Main {

    public static void main(String[] args) {
        Floyd floyd = new Floyd();
        floyd.search("Example0123456789abcdef".getBytes(), 7);

        byte[] out1 = floyd.getFirstCollision();
        byte[] out2 = floyd.getSecondCollision();

        //Solution inputs
        System.out.println("Solution inputs");
        System.out.println("0x"+MD5.binaryToHexString(out1));
        System.out.println("0x"+MD5.binaryToHexString(out2));

        //Solution collisions
        System.out.println("Outputs (collisions)");
        System.out.println("0x"+MD5.binaryToHexString(MD5.calc(MD5.calc(out1))));
        System.out.println("0x"+MD5.binaryToHexString(MD5.calc(MD5.calc(out2))));
    }
}
