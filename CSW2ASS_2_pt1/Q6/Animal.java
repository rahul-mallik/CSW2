package CSW2ASS_2_pt1.Q6;

public class Animal {
    String name,color,type;

    Animal(String name, String color, String type) {
        this.name = name;
        this.color = color;
        this.type = type;
    }

    @Override
    public int hashCode() {
        return name.hashCode()+color.hashCode()+type.hashCode()/2;
    }

    public static void main(String[] args) {
        Animal a1 =  new Animal("Dog","White","pet");
        Animal a2 = new Animal("Tiger","Yellow-Orange","Wild");

        System.out.println("Hash Code of animal 1: "+a1.hashCode());
        System.out.println("Hash Code of animal 2: "+a2.hashCode());
    }
}
