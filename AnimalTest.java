import static org.junit.Assert.*;

public class AnimalTest {

    @org.junit.Test
    public void getName() {
        Animal animal4 = new Animal("pheasant", 2, 60, false);
        String expected = "pheasant";
        String actual = animal4.getName();
        assertEquals(expected, actual);

    }

    @org.junit.Test
    public void setName() {
        Animal animal4 = new Animal("pheasant", 2, 60, false);
        animal4.setName("peacock");
        String expected = "peacock";
        String actual = animal4.getName();
        assertEquals(expected, actual);
    }

    @org.junit.Test
    public void getNumLegs() {
        Animal animal5 = new Animal("dachshund", 4, 20, false);
        int expected = 4;
        int actual = animal5.getNumLegs();
        assertEquals(expected, actual);
    }

    @org.junit.Test
    public void setNumLegs() {
        Animal animal5 = new Animal("dachshund", 4, 20, false);
        animal5.setNumLegs(6);
        int expected = 2; //purposefully incorrect, wanted to see how test runs
        int actual = animal5.getNumLegs();
        assertEquals(expected, actual);
    }

    @org.junit.Test
    public void getTopSpeed() {
        Animal animal6 = new Animal("cheetah", 4, 70, true);
        int expected = 60;
        int actual = animal6.getTopSpeed();
        assertEquals(expected, actual);
    }

    @org.junit.Test
    public void setTopSpeed() {
        Animal animal6 = new Animal("cheetah", 4, 70, true);
        animal6.setTopSpeed(102);
        int expected = 102;
        int actual = animal6.getTopSpeed();
        assertEquals(expected, actual);
    }

    @org.junit.Test
    public void getEndangered() {
        Animal animal7 = new Animal("sea turtle", 4, 2, true);
        boolean expected = true;
        boolean actual = animal7.getEndangered();
        assertEquals(expected, actual);
    }

    @org.junit.Test
    public void setEndangered() {
        Animal animal7 = new Animal("sea turtle", 4, 2, true);
        animal7.setEndangered(false);
        boolean expected = true; //purposeful
       boolean actual = animal7.getEndangered();
        assertEquals(expected, actual);
    }
}