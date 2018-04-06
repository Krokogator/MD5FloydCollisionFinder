/**
 * Created by Michał(Krokogator) on 06.04.2018.
 */
public class Animal {
    private byte[] current;
    private byte[] previous;

    public Animal(byte[] start){
        current = start;
    }

    public void jumpOne(){
        previous = current;
        current = MD5.calc(MD5.calc(current));
    }

    public void jumpTwo(){
        jumpOne();
        jumpOne();
    }
    public byte[] getCurrent() {
        return current;
    }

    public byte[] getPrevious() {
        return previous;
    }
}
