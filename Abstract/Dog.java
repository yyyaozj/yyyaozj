package Abstract;

public class Dog extends Pet{
    public Dog(String name,int age) {
        super(name,age);

    }
    @Override
    public void work() {
        System.out.println("wangwangwang");
    }
}
