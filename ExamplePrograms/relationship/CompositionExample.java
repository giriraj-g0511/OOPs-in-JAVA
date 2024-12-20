package relationship;

/*
 * 
 * Example provided by chatGPT
 * 
 * */


//Engine class
class Engine {
 private String type;

 Engine(String type) {
     this.type = type;
 }

 void start() {
     System.out.println(type + " engine is starting...");
 }

 void stop() {
     System.out.println(type + " engine is stopping...");
 }
}

//Car class
class Car {
 private Engine engine; // Composition relationship

 Car(String engineType) {
     this.engine = new Engine(engineType); // Composed Engine object
 }

 void startCar() {
     System.out.println("Car is starting...");
     engine.start(); // Delegating behavior to Engine
 }

 void stopCar() {
     System.out.println("Car is stopping...");
     engine.stop(); // Delegating behavior to Engine
 }
}

//Test class
public class CompositionExample {
 public static void main(String[] args) {
     Car car = new Car("V8");
     car.startCar(); // Outputs: Car is starting... V8 engine is starting...
     car.stopCar();  // Outputs: Car is stopping... V8 engine is stopping...
 }
}
