import java.util.ArrayList;

public class Main{
    public static void main(String [] args){

        //recordatorios:
        //TODO REVISAR TODO
        //TODO Actualizar los remove tyre de los tyregunners


        //TODO crear toGreet de las clases -> @Override 
        //Usar sponsors, victorias, etc de la clase F1

        //creación de carros
        ArrayList<RacingCar> cars = new ArrayList<>();
        cars.add(new RacingCar("A"));
        cars.add(new RacingCar("B"));


        //Creacion de los miembros del equipo con constructor, asi ahorramos un poco de espacio en el main
        PitCrewTeam pitCrewTeam = new PitCrewTeam(true);

        //creación del equipo
        F1Team f1team = new F1Team("Reds", "England", 1977, cars, pitCrewTeam);

        f1team.setTeamCaptain("Adama Jones");
        f1team.setPodiums(8);


        //Encapsulamiento
        //Modificar y agregar atributos privados de la clase f1team

        ArrayList<String> sponsor = new ArrayList<>();
        sponsor.add("CocaCola");
        sponsor.add("Apple");
        sponsor.add("Pilsen");
        sponsor.add("Mobile1");

        f1team.setSponsors(sponsor);
        f1team.setVictories(3);
    
        ArrayList<String> drivers = new ArrayList<>();
        sponsor.add("Mathew");
        sponsor.add("Jhon");

        f1team.setDrivers(drivers);
        
        f1team.getPitCrewTeam().printPitCrewMembers();

        System.out.println("");
        System.out.println("------------------------------------------------------");
        System.out.println("");


        for(int i = 0; i < pitCrewTeam.getPitCrewTeamMembers().size(); i++){
            pitCrewTeam.getPitCrewTeamMembers().get(i).toGreet();
        }



        System.out.println("");
        System.out.println("------------------------------------------------------");
        System.out.println("");

        System.out.println();

        System.out.println("Car A");
        f1team.getTeamA().teamWork();

        f1team.getPitCrewTeam().teamOverhaul();
        System.out.println("");
        System.out.println("------------------------------------------------------");
        System.out.println("");

        System.out.println("Car B");
        f1team.getTeamB().teamWork();


        System.out.println("");
        System.out.println("------------------------------------------------------");
        System.out.println("");

        System.out.println("Other functionalities to show about members:");
        System.out.println("Tyre On's and Tyre Off's");


        //Muestra otros métodos aparte de las clases Tyre On y Tyre Off

        for(int i = 0; i < pitCrewTeam.getPitCrewTeamMembers().size(); i++){
            
            if(pitCrewTeam.getPitCrewTeamMembers().get(i) instanceof TyreOff){

                ((TyreOff)pitCrewTeam.getPitCrewTeamMembers().get(i)).running(false);
                ((TyreOff)pitCrewTeam.getPitCrewTeamMembers().get(i)).carryTyre();
                ((TyreOff)pitCrewTeam.getPitCrewTeamMembers().get(i)).tellAction();


                break;

            }

        }

        System.out.println("");

        for(int i = 0; i < pitCrewTeam.getPitCrewTeamMembers().size(); i++){
            
            if(pitCrewTeam.getPitCrewTeamMembers().get(i) instanceof TyreOn){

                ((TyreOn)pitCrewTeam.getPitCrewTeamMembers().get(i)).running(true);
                ((TyreOn)pitCrewTeam.getPitCrewTeamMembers().get(i)).leaveTyre();
                ((TyreOn)pitCrewTeam.getPitCrewTeamMembers().get(i)).tellAction();

                break;

            }

        }
    }
}