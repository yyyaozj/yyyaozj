package AbstractText2;

public class Main {
    public static void main(String[] args) {
        Grandpa grandpa=new Grandpa();
        String[] types = {"dog","cat","panda"};
        for (String type:types){
            Pet pet = grandpa.cuiPet(type);
            pet.getShape();
        }
    }
}
