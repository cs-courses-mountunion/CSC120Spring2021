

public class NobelWinner {

    private String name;
    private String category;
    private Integer yearWon;

    public NobelWinner(String n, String c, Integer yW) {
        name = n;
        category = c;
        yearWon = yW;
    } // end of constructor

    public String getName() {
        return name;
    } // end of getName()

    public String getCategory() {
        return category;
    } // end of getCategory()

    public Integer getYearWon() {
        return yearWon;
    } // end of getYearWon()

    public void setName (String n) {
        name = n;
    } // end of setName()

    public void setCategory (String c) {
        category = c;
    } // end of setCategory()

    public void setYearWon (Integer yW) {
        yearWon = yW;
    } // end of setYearWon

    public String toString() {
        String answer;

        answer = "The " + yearWon + " Nobel Prize in " + category 
                    + " was won by " + name;
					
        return answer;
    } // end of toString()

} // end of class NobelWinner
