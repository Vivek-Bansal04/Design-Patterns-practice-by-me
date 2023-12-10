package prototype;


public class Bird implements Cloneable<Bird>{
    private String name;
    private String color;
    private int weight;

    //1st
//    @Override
//    public Bird clone() {
//        Bird b = new Bird();
//        b.color = this.color;
//        b.name = this.name;
//        b.weight = this.weight;
//        return b;
//    }

    public Bird(){

    }

    public Bird(Bird old){
        this.name = old.name;
        this.weight = old.weight;
        this.color = old.color;
    }

    @Override
    public Bird clone() {
        return new Bird(this);
    }



    public void setName(String name) {
        this.name = name;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }
}
