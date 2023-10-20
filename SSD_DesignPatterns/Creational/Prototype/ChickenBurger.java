package Prototype;

public class ChickenBurger extends Burger {
    private String name;
    private String desc;
    
    public ChickenBurger() {
        setName("Chicken Burger");
        setDesc("Savory chicken patty in a bun");
    }
    
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
    public void name() {
        
        System.out.println("Chicken Burger");
    }
    @Override
    public void desc() {
        System.out.println("Burger Contains Chicken");
    }

    
}
