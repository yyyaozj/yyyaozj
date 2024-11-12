package T07;

public class CakeShop {
    public Cake makeCake(String type) {
        Cake cake;
        if (type.equals("慕斯")) {
            cake = new MSCake();

        } else if (type.equals("泡芙")) {
            cake = new PFCake();
        } else {
            cake = new HSRCake();
        }
        return cake;
    }


}