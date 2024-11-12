package T07;

import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Cake pfcake= new PFCake();
        Cake mscake= new MSCake();
        Cake hsrcake= new HSRCake();
        CakeShop cakeShop=new CakeShop();

        String[] types={"慕斯","泡芙","红丝绒"};//数组保存字符串
        int [] sizes ={6,8,10};
        Random random = new Random();
        random.nextInt(3);
        for (String type:types){//for增强
           Cake cake = cakeShop.makeCake(type);
           int num = random.nextInt(3);
           cake.getCake(type,sizes[num]);
        }
    }
}
