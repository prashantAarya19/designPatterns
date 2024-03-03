package designPatterns.behavioral.observer;

public interface Observer {
    void update(Subject subject);

    void remove();
}
