public class TeamA extends PitCrewTeam implements TeamDriverA {
    
    private RacingCar racingCarA;
    
    public TeamA(F1Team F1team){

        //el coche numero 1 le pertenece al equipo A
        this.racingCarA = F1team.getTeamRacingCars().get(0);
    }

    public void test(){}
}
