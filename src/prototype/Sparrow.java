package prototype;

public class Sparrow extends Bird{
    private String legSize;

    public Sparrow(){

    }

    @Override
    public Sparrow clone() {
        return new Sparrow(this);
    }

    public Sparrow(Sparrow old){
        super(old);
        this.legSize = old.legSize;
    }

    public void setLegSize(String legSize) {
        this.legSize = legSize;
    }
}
