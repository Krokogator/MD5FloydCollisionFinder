public class Floyd {
    private Animal żółw;
    private Animal khulik;

    public void search(byte[] start, int collisionByteLength){
        żółw = new Animal(start, collisionByteLength);
        khulik = new Animal(start, collisionByteLength);

        żółw.jumpOne();
        khulik.jumpTwo();


        while(!MD5.compare(MD5.trim(żółw.getCurrent(),collisionByteLength), MD5.trim(khulik.getCurrent(), collisionByteLength))){
            żółw.jumpOne();
            khulik.jumpTwo();
        }
        System.out.println("Found cycle!");
        żółw = new Animal(start, collisionByteLength);
        while(!MD5.compare(MD5.trim(żółw.getCurrent(),collisionByteLength), MD5.trim(khulik.getCurrent(), collisionByteLength))){
            żółw.jumpOne();
            khulik.jumpOne();
        }
        System.out.println("Found collisions!");
    }


    public byte[] getFirstCollision(){ return żółw.getPrevious(); }
    public byte[] getSecondCollision(){ return khulik.getPrevious(); }
}
