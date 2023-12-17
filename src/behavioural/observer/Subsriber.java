package behavioural.observer;

public interface Subsriber<T> {
    public void listen(T order);
}
