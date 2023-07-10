public class Cat extends Animal {
    private String nature;
    
    // Constructor
    public Cat(String name, String nature) {
        super(name);
        this.nature = nature;
    }
    
    // Getter methods
    public String getNature() {
        return nature;
    }
    
    // Setter methods
    public void setNature(String nature) {
        this.nature = nature;
    }
    
    // Phương thức kêu
    public void speak() {
        System.out.println("Meow");
    }
    
    // Override phương thức ăn
    @Override
    public void eat() {
        System.out.println("Cat is eating");
    }
    
    // Override phương thức toString
    @Override
    public String toString() {
        return "Cat [name=" + name + ", nature=" + nature + "]";
    }
}