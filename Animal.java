public class Animal {
        //Put instance variables here

        private String name;
        private int numLegs;
        private int topSpeed;
        private boolean isEndangered;

        //Put constructor here
    public Animal(String name, int numLegs, int topSpeed, boolean isEndangered) {
        this.name = name;
        this.numLegs = numLegs;
        this.topSpeed = topSpeed;
        this.isEndangered = isEndangered;
    }

    public Animal() {

    }

        //Put getters and setters here
    public String getName() {
        return this.name;
    }
    public void setName(String name) {
        this.name = name;
    }


    public int getNumLegs(){
        return this.numLegs;
    }
    public void setNumLegs(int numLegs) {
        this.numLegs = numLegs;
    }


    public int getTopSpeed() {
        return this.topSpeed;
    }
    public void setTopSpeed(int topSpeed) {
        this.topSpeed = topSpeed;
    }


    public boolean getEndangered() {
        return this.isEndangered;
    }
    public void setEndangered(boolean isEndangered) {
        this.isEndangered = isEndangered;
    }


    public static void main(String[] args) {
            System.out.println("Hello, world");
            //Instantiate new Animal
            Animal animal1 = new Animal("rabbit", 4, 45, false) ;
            Animal animal2 = new Animal("snow leopard", 4, 40, true);
            Animal animal3 = new Animal("human being", 2, 28, false);

            String name;
            int topSpeed;

            //get name and speed values using getters
            name = animal1.getName();
            topSpeed = animal3.getTopSpeed();

            //Print some output
            System.out.println(animal1.topSpeed);

            //Set new name, speed, and endangered properties values using setters
            animal2.setName("cow");
            animal2.setTopSpeed(25);
            animal2.setEndangered(false);

            //get new values using getters
            name = animal2.getName();
            topSpeed = animal2.getTopSpeed();

            //Print some output
            System.out.println("The " + animal1.getName() + " has a top speed of " + animal1.getTopSpeed() + " mph.");
            System.out.println("The " + animal2.getName() + " has a top speed of " + animal2.getTopSpeed() + " mph.");
            System.out.println("The " + animal3.getName() + " has a top speed of " + animal3.getTopSpeed() + " mph.");
        }
}
