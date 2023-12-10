package prototype;

public class Crow extends Bird{
    private String sound = "Kaw";

//    //1st
//    @Override
//    public Crow clone() {
//        // so problem here is I can't copy bird values from here so I need to create a
//        // copy constructor in both parent and this class
//        Crow crow = new Crow();
//        crow.sound = this.sound;
//        return crow;
//    }

    public Crow(){

    }

    public Crow (Crow old){
        super(old);
        this.sound = old.sound;
    }

    @Override
    public Crow clone() {
        return new Crow(this);
    }

    public void setSound(String sound) {
        this.sound = sound;
    }
}
