package com.rene;

public class Main {

    public static void main(String[] args) {
        Body body = new Body("Kia","red","plastic", 3);
        EngineDetail engineDetail = new EngineDetail(100, 2);
        Engine engine = new Engine("V8", "Honda", engineDetail);

        Car car = new Car(body,engine);
      //  car.getEngine().engineDetail2(4,1200,90);     // only working if getter in Car are Public
      //  car.getBody().unlockcar(" unlocked");         // only working if getter in Car are Public

        engine.engineDetail2(4,1200,90);
        car.start();
        System.out.println(engineDetail.getWeight()+ " " + engineDetail.getWeightPowerRatio());
        System.out.println(engine.getPower().getWeight());
        System.out.println(body.getModel()+ " " +body.getColor());
        

    }
}
