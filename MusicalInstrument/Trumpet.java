package MusicalInstrument;

public class Trumpet extends MusicalInstrument{

    private String currentString = "Trumpet";

    @Override
    public String getCurrentString(){
        return this.currentString;
    }
}
