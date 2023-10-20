package Prototype;

public class Burger implements PrototypeDemo {
    private String name;
    private String desc;

    @Override
    public String getName() {
        return name;
    }
    @Override
    public void setName(String n) {
        name = n;
    }

    @Override
    public String getDesc() {
        return this.desc;
    }

    public void setDesc(String d) {
        this.desc = d;
    }

    
    @Override
    public Burger clone() {
        try {
            return (Burger) super.clone();
        } catch (CloneNotSupportedException e) {
            return null;
        }
    }
    @Override
    public void name() {
        
        System.out.println("Burger");
    }
    @Override
    public void desc() {
        System.out.println("yummy Burger");
    }

    
}
