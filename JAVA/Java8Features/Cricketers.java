package Java8Features;

public class Cricketers{
    String name;
    Integer runs ;
    Double strikeRate;

    public Cricketers(String name, Integer runs, Double strikeRate) {
        this.name = name;
        this.runs = runs;
        this.strikeRate = strikeRate;
    }

    @Override
    public String toString(){
        return "Name: " + name + "Runs: " + runs + "Strike Rate: " + strikeRate;
    }
}
