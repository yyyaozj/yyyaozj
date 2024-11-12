package AbstractText2;

public class Grandpa {

    public Pet cuiPet(String type){//返回 Pet自定义类型
        Pet pet;
        if (type.equals("dog")){
            pet = new Dog();
        } else if (type.equals("cat")) {
            pet = new Cat();
        }else {
            pet = new Panda();
        }
        return pet;
    }
}
