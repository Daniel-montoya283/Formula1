import java.util.ArrayList;

public class Main{
    public static void main(String [] args){

        F1Team f1team = new F1Team("Reds", "England", 1977);

        PitCrewTeam pitCrewTeam = new PitCrewTeam();

        f1team.setPitCrewTeam(pitCrewTeam);

        ArrayList<RacingCar> cars = new ArrayList<>();
        cars.add(new RacingCar());
        cars.add(new RacingCar());


        f1team.setTeamRacingCars(cars);


    }
}