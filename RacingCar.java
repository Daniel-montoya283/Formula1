public class RacingCar {

    //Hemos creado una clase "RacingCar" para hacer el programa más dinámico
    // los miembros de los pits podrán modificar estos autos e interactuar con ellos
    //Tanto al equipo "A" como al "B" le corresponde un coche

    private String Team;
    
    public RacingCar(String team){
        this.Team = team;
        this.FrontWingTightness = 100;
    }

    //atributos del auto que los miembros modifican
    private boolean FrontLeftTyre = true;
    private boolean FrontRightTyre = true;
    private boolean BackLeftTyre = true;
    private boolean BackRightTyre = true;

    private boolean FrontLeftBolts = true;
    private boolean FrontRightBolts = true;
    private boolean RearLeftBolts = true;
    private boolean RearRightBolts = true;

    private boolean FrontJack = true;
    private boolean RearJack = true;
    private boolean LeftSideJack = true;
    private boolean RightSideJack = true;

    private int FrontWingTightness;
    private boolean FrontWing = true;

    public String getTeam(){
        return this.Team;
    }

    public int getFrontWingTightness(){
        return this.FrontWingTightness;
    }

    public void frontLeftBoltsStatus(boolean status){
        this.FrontLeftBolts = status;
    }

    public void frontRightBoltsStatus(boolean status){
        this.FrontRightBolts = status;
    }

    public void rearLeftBoltsStatus(boolean status){
        this.RearLeftBolts = status;
    }

    public void rearRightBoltsStatus(boolean status){
        this.RearRightBolts = status;
    }

    public void frontJackStatus(boolean status){
        this.FrontJack = status;

    }

    public void rearJackStatus(boolean status){
        this.RearJack = status;
    }

    public void leftSideJackStatus(boolean status){
        this.LeftSideJack = status;
    }

    public void rightSideJackStatus(boolean status){
        this.RightSideJack = status;
    }

    public void adjustFrontWing(int num){
        this.FrontWingTightness = num;
    }

}
