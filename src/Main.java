import javax.xml.bind.DatatypeConverter;

public class Main {

    public static void main(String[] args) {
        byte[] out1 = MD5.trim(MD5.calc(MD5.calc("renmich1123376350383621786626")));
        byte[] out2 = MD5.trim(MD5.calc(MD5.calc("renmich3700873222361195459231")));

        boolean same = true;
        for(int i=0;i<7;i++){
            if(out1[i]!=out2[i]){
                same = false;
                break;
            }
        }
        if(same) { System.out.println("Indentyczne"); }
        else{ System.out.println("Różne"); }

        String hex1 = DatatypeConverter.printHexBinary(out1);
        String hex2 = DatatypeConverter.printHexBinary(out2);

        System.out.println(hex1);
        System.out.println(hex2);
    }
}
