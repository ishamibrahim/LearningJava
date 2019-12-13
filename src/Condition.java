 class Season {
    public final static String WINTER = "WINTER";
    public final static String SUMMER = "SUMMER";
    public final static String MONSOON = "MONSOON";
    public final static String AUTUMN = "AUTUMN";

    private String seasonName;

    public Season(String name) {
        this.seasonName = name;
    }

    public String getSeason(){
        return seasonName;
    }

    public String nextSeason() {
        if (this.seasonName.equals(WINTER)) {
            this.seasonName = SUMMER;
        } else if (this.seasonName.equals(SUMMER)) {
            this.seasonName = MONSOON;
        } else if (this.seasonName.equals(MONSOON)) {
            this.seasonName = AUTUMN;
        } else if (this.seasonName.equals(AUTUMN)) {
            this.seasonName = WINTER;
        } else {
            return "INVALID";
        }
        return this.seasonName;
    }
}

public class Condition {
    public static void main(String[] args) {
        System.out.println("Testing conditions");
        Season currentSeason = new Season(Season.AUTUMN);
        System.out.println("The current season name is : " + currentSeason.getSeason());
        currentSeason.nextSeason();
        System.out.println("The next season name is : " + currentSeason.getSeason());
    }

}