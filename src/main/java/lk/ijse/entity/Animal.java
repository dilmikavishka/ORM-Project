package lk.ijse.entity;

public class Animal {
    private int id;
    private String name;
    private String gender;
    private String color;

    public Animal() {}

    public Animal(int id, String name, String gender, String color) {
        this.id = id;
        this.name = name;
        this.gender = gender;
        this.color = color;
    }

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

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "Animal{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", gender='" + gender + '\'' +
                ", color='" + color + '\'' +
                '}';
    }
}
