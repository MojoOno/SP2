public class Trophy {

    private int year;
    private String name;
    private String tournament;

    public Trophy(int year, String name, String tournament) {
        this.year = year;
        this.name = name;
        this.tournament = tournament;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTournament() {
        return tournament;
    }

    public void setTournament(String tournament) {
        this.tournament = tournament;
    }

    @Override
    public String toString() {
        return "Title: " + name + ", " +"Tournament: " + tournament + ", " + year;
    }
}
