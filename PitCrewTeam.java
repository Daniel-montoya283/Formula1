import java.util.ArrayList;

public class PitCrewTeam {
    //todos los 20 integrantes 

    //ArrayList<> / atributos de los miembros estático, así le pertenece a todas las instancias de la clase y a las clases hijas
    protected static ArrayList<TeamMember> PitCrewTeamMembers = new ArrayList<>();

    public PitCrewTeam(boolean bool){
        //creación de los miembros de los pits

        //TyreGunners
        PitCrewTeamMembers.add(new TyreGunner("Carlos"));
        PitCrewTeamMembers.add(new TyreGunner("Jose"));
        PitCrewTeamMembers.add(new TyreGunner("Juan"));
        PitCrewTeamMembers.add(new TyreGunner("Alan"));

        //TyreOffs
        PitCrewTeamMembers.add(new TyreOff("Sebas") );
        PitCrewTeamMembers.add(new TyreOff("Dylan"));
        PitCrewTeamMembers.add(new TyreOff("Daniel"));
        PitCrewTeamMembers.add(new TyreOff("Nelson"));

        //TyreOns
        PitCrewTeamMembers.add(new TyreOn("Lucas",true, "A"));
        PitCrewTeamMembers.add(new TyreOn("Adam", true, "A"));
        PitCrewTeamMembers.add(new TyreOn("Paul", true, "B"));
        PitCrewTeamMembers.add(new TyreOn("Pablo", true, "B"));

        //FrontJacks
        PitCrewTeamMembers.add(new FrontJack("Saul", true, "A"));
        PitCrewTeamMembers.add(new FrontJack("Sam", true, "B"));

        //RearJacks
        PitCrewTeamMembers.add(new RearJack("Philip", true, "A"));
        PitCrewTeamMembers.add(new RearJack("Jhon", true, "B"));

        //SideJacks
        PitCrewTeamMembers.add(new SideJack("Diego"));
        PitCrewTeamMembers.add(new SideJack("Mateo"));

        //FrontWings
        PitCrewTeamMembers.add(new FrontWingAdjust("Jose", true, "A"));
        PitCrewTeamMembers.add(new FrontWingAdjust("Evan", true, "B"));

        //Lollipop
        PitCrewTeamMembers.add(new LollipopMan("Nate"));

        System.out.println("All members have joined the team!");
    }

    public PitCrewTeam(){} //Sobrecarga de métodos



    public void printPitCrewMembers(){

        System.out.println("");
        System.out.println("Pit crew members:");

        for(int i = 0; i < PitCrewTeamMembers.size(); i++){

            System.out.print(PitCrewTeamMembers.get(i).getName() + ": " + PitCrewTeamMembers.get(i).getClass().getName());

            if(PitCrewTeamMembers.get(i).getExclusive() == true){
                System.out.print( " -> Team: " + PitCrewTeamMembers.get(i).getTeam());
            }

            System.out.println("");
        }

    }

    public void teamOverhaul(){
        for(int i = 0; i < PitCrewTeamMembers.size(); i++){
            PitCrewTeamMembers.get(i).setWorking(false);
        }
    }

    public static ArrayList<TeamMember> getPitCrewTeamMembers() {
        return PitCrewTeamMembers;
    }
}
