package File;

public class TextFile extends File {

    private String currentString = "TextFile";

    @Override
    public String getCurrentString(){
        return this.currentString;
    }

}
