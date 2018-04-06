/**
 * Created by Michał(Krokogator) on 06.04.2018.
 */
public class Animal {
    private byte[] current;
    private byte[] previous;
    private int trimSize;

    public Animal(byte[] start, int trimSize){
        current = start;
        this.trimSize = trimSize;
    }

    public void jumpOne(){
        previous = current;
        current = MD5.calc(MD5.calc(MD5.trim(current,trimSize)));
    }

    public void jumpTwo(){
        jumpOne();
        jumpOne();
    }
    public byte[] getCurrent() {
        return MD5.trim(current,trimSize);
    }

    public byte[] getPrevious() {
        return MD5.trim(previous,trimSize);
    }
}
