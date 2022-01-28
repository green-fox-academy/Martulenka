package Streams.Exercise10;

public class Fox {
    private String name;
    private String color;
    private int age;

    public Fox(String name, String color, int age){
        this.name = name;
        this.color = color;
        this.age = age;
    }

    public String getName(){
        return name;
    }

    public String getColor(){
        return color;
    }

    public int getAge(){
        return age;
    }

    public void setName(String newName){
        name = newName;
    }

    public void setColor(String newColor){
        color = newColor;
    }

    public void setAge(int newAge){
        age = newAge;
    }
}
