import java.util.ArrayList;

public class F1Team {

    //atributos clase F1TEAM
    private String name;
    private String location;
    private String teamCaptain;
    private ArrayList<String> sponsors = new ArrayList<>();
    private int foundationYear;
    private int podiums;
    private int victories;


    private PitCrewTeam pitCrewTeam;
    private TeamA teamA;
    private TeamB teamB;
    private ArrayList<RacingCar> teamRacingCars;
    private ArrayList<String> drivers;
    

    //Constructor de la clase F1TEAM
    public F1Team(String name, String location, int foundationYear, ArrayList<RacingCar> teamCars, PitCrewTeam pitCrewTeam){
        this.name = name;
        this.location = location;
        this.foundationYear = foundationYear;
        this.pitCrewTeam = pitCrewTeam;
        this.teamA = new TeamA(teamCars.get(0));
        this.teamB = new TeamB(teamCars.get(1));
    }

    //Getter y Setter para 'TeamA'
    public TeamA getTeamA(){
        return this.teamA;
    }

    public void setTeamA(TeamA newTeamA){
        this.teamA = newTeamA;
    }

    //Getter y Setter para 'TeamB'
    public TeamB getTeamB(){
        return this.teamB;
    }

    public void setTeamB(TeamB newTeamB){
        this.teamB = newTeamB;
    }

    // Getter y Setter para 'name'
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    // Getter y Setter para 'location'
    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    // Getter y Setter para 'teamCaptain'
    public String getTeamCaptain() {
        return teamCaptain;
    }

    public void setTeamCaptain(String teamCaptain) {
        this.teamCaptain = teamCaptain;
    }

    // Getter y Setter para 'sponsors'
    public ArrayList<String> getSponsors() {
        return sponsors;
    }

    public void setSponsors(ArrayList<String> sponsors) {
        this.sponsors = sponsors;
    }

    // Getter y Setter para 'foundationYear'
    public int getFoundationYear() {
        return foundationYear;
    }

    public void setFoundationYear(int foundationYear) {
        this.foundationYear = foundationYear;
    }

    // Getter y Setter para 'teamRacingCars'
    public ArrayList<RacingCar> getTeamRacingCars() {
        return teamRacingCars;
    }

    public void setTeamRacingCars(ArrayList<RacingCar> teamRacingCars) {
        this.teamRacingCars = teamRacingCars;
    }

    // Getter y Setter para 'drivers'
    public ArrayList<String> getDrivers() {
        return drivers;
    }

    public void setDrivers(ArrayList<String> drivers) {
        this.drivers = drivers;
    }

    // Getter y Setter para 'pitCrewTeam'
    public PitCrewTeam getPitCrewTeam() {
        return pitCrewTeam;
    }

    public void setPitCrewTeam(PitCrewTeam pitCrewTeam) {
        this.pitCrewTeam = pitCrewTeam;
    }

    // Getter y Setter para 'podiums'
    public int getPodiums() {
        return podiums;
    }

    public void setPodiums(int podiums) {
        this.podiums = podiums;
    }

    // Getter y Setter para 'victories'
    public int getVictories() {
        return this.victories;
    }

    public void setVictories(int victories) {
        this.victories = victories;
    }
}