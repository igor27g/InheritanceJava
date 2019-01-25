public class England {
    private int nation;
    private String stadium;
    private String coach;

    public England (int nation, String stadium, String coach) {
        this.nation = nation;
        this.stadium = stadium;
        this.coach = coach;
    }


    public void sing() {
        System.out.println("England.sing() called");

    }

    public int getNation() {
        return nation;
    }

    public String getStadium() {
        return stadium;
    }

    public String getCoach() {
        return coach;
    }
}
