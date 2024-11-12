package TryCatch;

public class T02 {
    public static void cacl() throws Exception{
        System.out.println(5/1);
    }

    public static void main(String[] args) {
        try{
            cacl();
        }catch (Exception e){
            System.out.println("除数不能为零");
        }finally {
            System.out.println("Ending");
        }
    }

















}
