package com.rene;

/**
 * Created by RCornella on 14-7-2017.
 */
public class Car {
    private Body body;
    private Engine engine;

    public Car(Body body, Engine engine) {
        this.body = body;
        this.engine = engine;
    }

    public void start(){
        body.unlockcar();
        changeEngine();
    }

    private void changeEngine(){
        engine.engineDetail2(6,800,120);
    }

/*   Getters are only needed if called from other classes and than they need to be public
    public Body getBody() {
        return body;
    }

    public Engine getEngine() {
        return engine;
    }
    */
}
