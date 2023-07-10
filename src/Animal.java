public class Animal {
    protected String name;
    
    // Constructor
    public Animal(String name) {
        this.name = name;
    }
    
    // Getter methods
    public String getName() {
        return name;
    }
    
    // Setter methods
    public void setName(String name) {
        this.name = name;
    }
    
    // Phương thức ăn
    public void eat() {
        System.out.println("Animal is eating");
    }
    
    // Phương thức toString
    @Override
    public String toString() {
        return "Animal [name=" + name + "]";
    }
}