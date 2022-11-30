package school.mjc.stage0.loops.finalTask;

public class MultiplicationTable {
    public void printTable(int numberTableToPrint){

        int counter = 1;
        while (counter <= 10) {
            System.out.println(counter + " x " + numberTableToPrint + " = " + numberTableToPrint * counter);
            counter++;
        }

    }
}
