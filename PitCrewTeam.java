import java.util.ArrayList;

public class PitCrewTeam {
    //todos los 20 integrantes 
    //ArrayList<> o atributos de los miembros
    private ArrayList<TeamMember> PitCrewTeamMembers = new ArrayList<>();
    private TeamA teamA;
    private TeamB teamB;

    
    public PitCrewTeam(Boolean bool){
        //creación de los miembros de los pits

        //TyreGunners
        this.PitCrewTeamMembers.add(new TyreGunner("Carlos"));
        this.PitCrewTeamMembers.add(new TyreGunner("Jose"));
        this.PitCrewTeamMembers.add(new TyreGunner("Juan"));
        this.PitCrewTeamMembers.add(new TyreGunner("Alan"));

        //TyreOffs
        this.PitCrewTeamMembers.add(new TyreOff("Sebas") );
        this.PitCrewTeamMembers.add(new TyreOff("Dylan"));
        this.PitCrewTeamMembers.add(new TyreOff("Daniel"));
        this.PitCrewTeamMembers.add(new TyreOff("Nelson"));

        //TyreOns
        this.PitCrewTeamMembers.add(new TyreOn("Lucas"));
        this.PitCrewTeamMembers.add(new TyreOn("Adam"));
        this.PitCrewTeamMembers.add(new TyreOn("Paul"));
        this.PitCrewTeamMembers.add(new TyreOn("Pablo"));

        //FrontJacks
        this.PitCrewTeamMembers.add(new FrontJack("Saul"));
        this.PitCrewTeamMembers.add(new FrontJack("Sam"));

        //RearJacks
        this.PitCrewTeamMembers.add(new RearJack("Philip"));
        this.PitCrewTeamMembers.add(new RearJack("Jhon"));

        System.out.println("se han creado los miembros");
    }

    public PitCrewTeam(){}
}
