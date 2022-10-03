package prac12to15;

public class Shirt {
    private String article, fullName, color, size;

    public Shirt(String stringToParse){
        String[] s = stringToParse.split(",");
        article = s[0];
        fullName = s[1];
        color = s[2];
        size = s[3];
    }

    @Override
    public String toString() {
        return "Shirt:\n" +
                "\tarticle='" + article + '\'' +
                "\n\tfullName='" + fullName + '\'' +
                "\n\tcolor='" + color + '\'' +
                "\n\tsize='" + size + '\'';
    }
}
