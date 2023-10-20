package Prototype;

public class VegBurger extends Burger {
    private String name;
    private String desc;

    public VegBurger() {
        setName("Veg Burger");
        setDesc("Delicious veggie patty in a bun");
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
        
        System.out.println("Veggie Burger");
    }
    @Override
    public void desc() {
        System.out.println("Burger Contains Vegetables");
    }

    
}
