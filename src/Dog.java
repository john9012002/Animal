public class Dog extends Animal {
    private String nature;
    
    // Constructor
    public Dog(String name, String nature) {
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
        System.out.println("Woof");
    }
    
    // Override phương thức ăn
    @Override
    public void eat() {
        System.out.println("Dog is eating");
    }
    
    // Override phương thức toString
    @Override
    public String toString() {
        return "Dog [name=" + name + ", nature=" + nature + "]";
    }
}