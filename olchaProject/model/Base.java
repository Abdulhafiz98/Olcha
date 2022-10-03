package uz.pdp.olchaProject.model;

public abstract class Base {
    private static int GeneratorID=10;
    private int id;
    private String name;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Base(){
        GeneratorID++;
        this.id=GeneratorID;
    }

    @Override
    public String toString() {
        return "Base{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}
