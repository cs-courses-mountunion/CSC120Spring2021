

public class SecretaryGeneral {

    private String name;
    private String homeCountry;
    private Integer yearOfDeath;

    public SecretaryGeneral(String n, String c, Integer yoD) {
        name = n;
        homeCountry = c;
        yearOfDeath = yoD;
    } // end of constructor

    public String getName() {
        return name;
    } // end of getName()

    public String getHomeCountry() {
        return homeCountry;
    } // end of getHomeCountry()

    public Integer getYearOfDeath() {
        return yearOfDeath;
    } // end of getYearOfDeath()

    public void setName (String n) {
        name = n;
    } // end of setName()

    public void setHomeCountry (String c) {
        homeCountry = c;
    } // end of setHomeCountry()

    public void setYearOfDeath (Integer yoD) {
        yearOfDeath = yoD;
    } // end of setYearOfDeath

    public String toString() {
        String answer;

        answer = "UN Secretary-General " + name + ", from " + homeCountry;
        if ( yearOfDeath == 0 ) {
            answer += ", is still living";
        }
        else {
            answer += ", died in " + yearOfDeath;
        }
					
        return answer;
    } // end of toString()

} // end of class SecretaryGeneral
