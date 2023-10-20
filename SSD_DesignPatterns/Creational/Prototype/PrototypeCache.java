package Prototype;

public class PrototypeCache implements PrototypeDemo {
    private String name;
    private String desc;

    @Override
    public PrototypeCache clone() {
        
        PrototypeCache newCache = new PrototypeCache();
        newCache.setName(this.name);
        newCache.setDesc(this.desc);
        return newCache;
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void setDesc(String desc) {
        this.desc = desc;
    }

    @Override
    public String getDesc() {
        return desc;
    }

    @Override
    public void name() {
        
    }

    @Override
    public void desc() {
        
    }
}