import java.util.ArrayList;

public class TeamA extends PitCrewTeam implements TeamDriverA { //<- Herencia multiple

    // Esta clase permite conectar y organizar a los miembros del equipo "A"
    // haciendo uso de la herencia múltiple
    // Esta clase hace herencia de "PitCrewTeam" ya que es una subdivision de los
    // miembros de los pits y además heredará
    // como atributo la lista estática de los miembros de los pits, que al ser
    // estática, tanto "TeamA" como "TeamB" tendrán acceso a la misma,
    //Ya que todos los miembros que pertenezcan al equipo "A", estarán en esta clase y esta clase implementa "TeamDriverA"
    //Esto permite relacionar a todos los miembro "A" con "TeamDriverA" y aplciar sus métodos

    private ArrayList<TeamMember> teamMembersA = new ArrayList<>();
    private static RacingCar carA;

    public TeamA(RacingCar teamcar) {

        carA = teamcar;

        addTeamMembers();

    }

    // Busca entre los miembros de los pits a los que son exclusivos de "A"
    public void addTeamMembers() {

        for (int i = 0; i < PitCrewTeamMembers.size(); i++) {

            if (PitCrewTeamMembers.get(i).getExclusive() == true) {

                if (PitCrewTeamMembers.get(i).getTeam().equals("A")) {

                    this.teamMembersA.add(PitCrewTeamMembers.get(i));
                }
            }
        }

    }


    //La estructura del bucle for encargado de buscar al miembro para que realice la accion es dificil de reducir
    //a una simple funcion e invocarla cuando se necesite para ahorrar espacio, ya que este ciclo for, cambia cada vez que si invoca,
    //varía la clase objetivo a buscar, la zona del coche con la que interactúa, la accion de quien interactúa, el cambio que realiza al coche
    //la lista sobre la que itera etc.
    //Por esto mismo es mejor dejar el ciclo y hacer los pequeños cambios necesarios manualmente




    //Remove Tyres:
    public void removeFrontLeftTyre() {

        // Busca el primer TyreGunner disponible en los Pits
        for (int i = 0; i < PitCrewTeamMembers.size(); i++) {

            if (PitCrewTeamMembers.get(i) instanceof TyreGunner) {
                
                if (PitCrewTeamMembers.get(i).getWorking() == false) { 


                    PitCrewTeamMembers.get(i).setWorking(true);

                    TeamMember actualTyreGunner = PitCrewTeamMembers.get(i);
                    ((TyreGunner) actualTyreGunner).modifyFrontLeftBolts(carA, false); // <- Polimorfismo

                    String actions = "removed";
                    String zone = "front left";
                    String part = "bolts";

                    printActions(actualTyreGunner, actions, zone ,part, carA );

                    break;

                }
            }
        }



        // Busca el primer TyreOff disponible en los pits
        for (int i = 0; i < PitCrewTeamMembers.size(); i++) {

            if (PitCrewTeamMembers.get(i) instanceof TyreOff) {
                
                if (PitCrewTeamMembers.get(i).getWorking() == false) {


                    PitCrewTeamMembers.get(i).setWorking(true);
                    TeamMember actualTyreOff = PitCrewTeamMembers.get(i);
                    ((TyreOff) actualTyreOff).carryTyre();
                    ((TyreOff) actualTyreOff).running(true); // <- Polimorfismo

                    String actions = "removed";
                    String zone = "front left";
                    String part = "tyre";

                    printActions(actualTyreOff, actions, zone, part, carA);

                    break;
                }
            }
        }

    }




    public void removeFrontRightTyre() {

     // Busca el primer TyreGunner disponible en los Pits
     for (int i = 0; i < PitCrewTeamMembers.size(); i++) {

        if (PitCrewTeamMembers.get(i) instanceof TyreGunner) {
            if (PitCrewTeamMembers.get(i).getWorking() == false) {
                

                PitCrewTeamMembers.get(i).setWorking(true);

                TeamMember actualTyreGunner = PitCrewTeamMembers.get(i);
                ((TyreGunner) actualTyreGunner).modifyFrontRightBolts(carA, false); // <- Polimorfismo

                String actions = "removed";
                String zone = "front right";
                String part = "bolts";

                printActions(actualTyreGunner, actions, zone, part, carA);

                break;

            }
        }
    }
    // Busca el primer TyreOff disponible en los pits
    for (int i = 0; i < PitCrewTeamMembers.size(); i++) {

        if (PitCrewTeamMembers.get(i) instanceof TyreOff) {
            if (PitCrewTeamMembers.get(i).getWorking() == false) {


                PitCrewTeamMembers.get(i).setWorking(true);
                TeamMember actualTyreOff = PitCrewTeamMembers.get(i);
                ((TyreOff) actualTyreOff).carryTyre();
                ((TyreOff) actualTyreOff).running(true); // <- Polimorfismo

                String actions = "removed";
                String zone = "front right";
                String part = "tyre";

                printActions(actualTyreOff, actions, zone, part, carA);

                break;
            }
        }
    }

    };



    public void removeRearLeftTyre() {

         // Busca el primer TyreGunner disponible en los Pits
         for (int i = 0; i < PitCrewTeamMembers.size(); i++) {

            if (PitCrewTeamMembers.get(i) instanceof TyreGunner) {
                if (PitCrewTeamMembers.get(i).getWorking() == false) {

    
                    PitCrewTeamMembers.get(i).setWorking(true);
    
                    TeamMember actualTyreGunner = PitCrewTeamMembers.get(i);
                    ((TyreGunner) actualTyreGunner).modifyRearLeftBolts(carA, false); // <- Polimorfismo
    
                    String actions = "removed";
                    String zone = "rear left";
                    String part = "bolts";

                    printActions(actualTyreGunner, actions, zone, part, carA);

                    break;
    
                }
            }
        }
        // Busca el primer TyreOff disponible en los pits
        for (int i = 0; i < PitCrewTeamMembers.size(); i++) {
    
            if (PitCrewTeamMembers.get(i) instanceof TyreOff) {
                if (PitCrewTeamMembers.get(i).getWorking() == false) {

    
                    PitCrewTeamMembers.get(i).setWorking(true);
                    TeamMember actualTyreOff = PitCrewTeamMembers.get(i);
                    ((TyreOff) actualTyreOff).carryTyre();
                    ((TyreOff) actualTyreOff).running(true); // <- Polimorfismo
    
                    String actions = "removed";
                    String zone = "rear left";
                    String part = "tyre";

                    printActions(actualTyreOff, actions, zone, part, carA);

                    break;
                }
            }
        }
        
    };



    public void removeRearRightTyre() {

        // Busca el primer TyreGunner disponible en los Pits
        for (int i = 0; i < PitCrewTeamMembers.size(); i++) {

            if (PitCrewTeamMembers.get(i) instanceof TyreGunner) {
                if (PitCrewTeamMembers.get(i).getWorking() == false) {

    
                    PitCrewTeamMembers.get(i).setWorking(true);
    
                    TeamMember actualTyreGunner = PitCrewTeamMembers.get(i);
                    ((TyreGunner) actualTyreGunner).modifyRearRightBolts(carA, false); // <- Polimorfismo
    
                    String actions = "removed";
                    String zone = "rear right";
                    String part = "bolts";

                    printActions(actualTyreGunner, actions, zone, part, carA);

                    break;
    
                }
            }
        }
        // Busca el primer TyreOff disponible en los pits
        for (int i = 0; i < PitCrewTeamMembers.size(); i++) {
    
            if (PitCrewTeamMembers.get(i) instanceof TyreOff) {
                if (PitCrewTeamMembers.get(i).getWorking() == false) {

    
                    PitCrewTeamMembers.get(i).setWorking(true);
                    TeamMember actualTyreOff = PitCrewTeamMembers.get(i);
                    ((TyreOff) actualTyreOff).carryTyre();
                    ((TyreOff) actualTyreOff).running(true); // <- Polimorfismo
    
                    String actions = "removed";
                    String zone = "rear right";
                    String part = "tyre";

                    printActions(actualTyreOff, actions, zone, part, carA);

                    break;
                }
            }
        }

    };



    

    public void setUpFrontLeftTyre() {

        boolean foundTeamMate = false;

        //Busca Miembros del equipo exclusivos para esta tarea
        for (int i = 0; i < teamMembersA.size(); i++){

           if( teamMembersA.get(i) instanceof TyreOn){

            if(teamMembersA.get(i).getWorking() == false){

                teamMembersA.get(i).setWorking(true);

                TeamMember actualTyreOn = teamMembersA.get(i);

                ((TyreOn)actualTyreOn).carryTyre();
                ((TyreOn)actualTyreOn).running(true);
                ((TyreOn)actualTyreOn).leaveTyre();

                String actions = "brought";
                String zone = "front left";
                String part = "tyre";

                printActions(actualTyreOn, actions, zone, part, carA);

                foundTeamMate = true;

                break;
            }
           }
        }

        //En caso de no haber encontrado TyreOn disponible en el equipo exclusivo de "A", pedirá asistencia
        //a los demás miembros de los pits, Verifica tambien no hacerlo a exclusivos del equipo "B"
        if(foundTeamMate == false){


            for (int i = 0; i < PitCrewTeamMembers.size(); i++){

                if(PitCrewTeamMembers.get(i) instanceof TyreOn){
                    if(PitCrewTeamMembers.get(i).getWorking() == false){

                        if(PitCrewTeamMembers.get(i).getTeam().equals("B") == false){

                            PitCrewTeamMembers.get(i).setWorking(true);

                            TeamMember actualSupporter = PitCrewTeamMembers.get(i);
    
                            ((TyreOn)actualSupporter).carryTyre();
                            ((TyreOn)actualSupporter).running(true);
                            ((TyreOn)actualSupporter).leaveTyre();
    
                            String actions = "brought";
                            String zone = "front left";
                            String part = "tyre";
    
                            printActions(actualSupporter, actions, zone, part, carA);

                            foundTeamMate = true;

                            break;

                        }
                    }
                }
            }
        }


        //Reevalua nuevamente si logró encontrar ayuda
        //Si pasa que no pedirá ayuda a algunos miembros de la clase auxiliar TyreOff para que ayuden a los TyreOn
        //a llevar todos los neumáticos
        if (foundTeamMate == false) {

            System.out.println("Looks like we need some help, not enough TyreOn members avaible");

            for (int i = 0; i < PitCrewTeamMembers.size(); i++) {

                if (PitCrewTeamMembers.get(i) instanceof TyreOff) {

                    if (PitCrewTeamMembers.get(i).getWorking() == false) {

                        PitCrewTeamMembers.get(i).setWorking(true);
                        TeamMember actualSupporter = PitCrewTeamMembers.get(i);

                        ((TyreOff) actualSupporter).carryTyre();
                        ((TyreOff) actualSupporter).running(true);
                        ((TyreOff) actualSupporter).leaveTyre();

                        String actions = "brought";
                        String zone = "front left";
                        String part = "tyre";

                        printActions(actualSupporter, actions, zone, part, carA);

                        foundTeamMate = true;

                        break;
                    }
                }
            }
        }

        //Busca al TyreGunner para terminar de ensamblar la llanta
        for (int i = 0; i < PitCrewTeamMembers.size(); i++){

            if( PitCrewTeamMembers.get(i) instanceof TyreGunner){
 
             if(PitCrewTeamMembers.get(i).getWorking() == false){
 
                PitCrewTeamMembers.get(i).setWorking(true);
                 TeamMember actualTyreGunner = PitCrewTeamMembers.get(i);
 
                 ((TyreGunner)actualTyreGunner).modifyFrontLeftBolts(carA, true);
 
                 String actions = "bolt";
                 String zone = "front left";
                 String part = "tyre";
 
                 printActions(actualTyreGunner, actions, zone, part, carA);
 
                 foundTeamMate = true;
 
                 break;
             }
            }
        }

    };






    //Se repite el proceso para las demás llantas
    public void setUpFrontRightTyre() {

        boolean foundTeamMate = false;

        //Busca Miembros del equipo exclusivos para esta tarea
        for (int i = 0; i < teamMembersA.size(); i++){

           if( teamMembersA.get(i) instanceof TyreOn){

            if(teamMembersA.get(i).getWorking() == false){

                teamMembersA.get(i).setWorking(true);
                TeamMember actualTyreOn = teamMembersA.get(i);

                ((TyreOn)actualTyreOn).carryTyre();
                ((TyreOn)actualTyreOn).running(true);
                ((TyreOn)actualTyreOn).leaveTyre();

                String actions = "brought";
                String zone = "front right";
                String part = "tyre";

                printActions(actualTyreOn, actions, zone, part, carA);

                foundTeamMate = true;

                break;
            }
           }
        }

        //Pide Asistencia a los demás 
        if(foundTeamMate == false){

            for (int i = 0; i < PitCrewTeamMembers.size(); i++){

                if(PitCrewTeamMembers.get(i) instanceof TyreOn){
                    if(PitCrewTeamMembers.get(i).getWorking() == false){

                        if(PitCrewTeamMembers.get(i).getTeam().equals("B") == false){

                            PitCrewTeamMembers.get(i).setWorking(true);

                            TeamMember actualSupporter = PitCrewTeamMembers.get(i);
    
                            ((TyreOn)actualSupporter).carryTyre();
                            ((TyreOn)actualSupporter).running(true);
                            ((TyreOn)actualSupporter).leaveTyre();
    
                            String actions = "brought";
                            String zone = "front right";
                            String part = "tyre";
    
                            printActions(actualSupporter, actions, zone, part, carA);

                            foundTeamMate = true;

                            break;

                        }
                    }
                }
            }
        } 


        //Reevalúa la asistencia
        if (foundTeamMate == false) {

            System.out.println("Looks like we need some help, not enough TyreOn members avaible");

            for (int i = 0; i < PitCrewTeamMembers.size(); i++) {

                if (PitCrewTeamMembers.get(i) instanceof TyreOff) {

                    if (PitCrewTeamMembers.get(i).getWorking() == false) {

                        PitCrewTeamMembers.get(i).setWorking(true);
                        TeamMember actualSupporter = PitCrewTeamMembers.get(i);

                        ((TyreOff) actualSupporter).carryTyre();
                        ((TyreOff) actualSupporter).running(true);
                        ((TyreOff) actualSupporter).leaveTyre();

                        String actions = "brought";
                        String zone = "front right";
                        String part = "tyre";

                        printActions(actualSupporter, actions, zone, part, carA);

                        foundTeamMate = true;

                        break;
                    }
                }
            }
        }

        //Busca al TyreGunner para terminar de ensamblar la llanta
        for (int i = 0; i < PitCrewTeamMembers.size(); i++){

            if( PitCrewTeamMembers.get(i) instanceof TyreGunner){
 
             if(PitCrewTeamMembers.get(i).getWorking() == false){
 
                PitCrewTeamMembers.get(i).setWorking(true);
                 TeamMember actualTyreGunner = PitCrewTeamMembers.get(i);
 
                 ((TyreGunner)actualTyreGunner).modifyFrontRightBolts(carA, true);
 
                 String actions = "bolt";
                 String zone = "front right";
                 String part = "tyre";
 
                 printActions(actualTyreGunner, actions, zone, part, carA);
 
                 foundTeamMate = true;
 
                 break;
             }
            }
        }

    };







    public void setUpRearLeftTyre() {

        boolean foundTeamMate = false;

        //Busca Miembros del equipo exclusivos para esta tarea
        for (int i = 0; i < teamMembersA.size(); i++){

           if( teamMembersA.get(i) instanceof TyreOn){

            if(teamMembersA.get(i).getWorking() == false){

                teamMembersA.get(i).setWorking(true);
                TeamMember actualTyreOn = teamMembersA.get(i);

                ((TyreOn)actualTyreOn).carryTyre();
                ((TyreOn)actualTyreOn).running(true);
                ((TyreOn)actualTyreOn).leaveTyre();

                String actions = "brought";
                String zone = "rear left";
                String part = "tyre";

                printActions(actualTyreOn, actions, zone, part, carA);

                foundTeamMate = true;

                break;
            }
           }
        }

        //En caso de no haber encontrado TyreOn disponible en el equipo exclusivo de "A", pedirá asistencia
        //a los demás miembros de los pits, Verifica tambien no hacerlo a exclusivos del equipo "B"
        if(foundTeamMate == false){


            for (int i = 0; i < PitCrewTeamMembers.size(); i++){

                if(PitCrewTeamMembers.get(i) instanceof TyreOn){
                    if(PitCrewTeamMembers.get(i).getWorking() == false){

                        if(PitCrewTeamMembers.get(i).getTeam().equals("B") == false){

                            PitCrewTeamMembers.get(i).setWorking(true);

                            TeamMember actualSupporter = PitCrewTeamMembers.get(i);
    
                            ((TyreOn)actualSupporter).carryTyre();
                            ((TyreOn)actualSupporter).running(true);
                            ((TyreOn)actualSupporter).leaveTyre();
    
                            String actions = "brought";
                            String zone = "rear left";
                            String part = "tyre";
    
                            printActions(actualSupporter, actions, zone, part, carA);

                            foundTeamMate = true;

                            break;

                        }
                    }
                }
            }
        }


        //Reevalua 
        if (foundTeamMate == false) {

            System.out.println("Looks like we need some help, not enough TyreOn members avaible");

            for (int i = 0; i < PitCrewTeamMembers.size(); i++) {

                if (PitCrewTeamMembers.get(i) instanceof TyreOff) {

                    if (PitCrewTeamMembers.get(i).getWorking() == false) {

                        PitCrewTeamMembers.get(i).setWorking(true);
                        TeamMember actualSupporter = PitCrewTeamMembers.get(i);

                        ((TyreOff) actualSupporter).carryTyre();
                        ((TyreOff) actualSupporter).running(true);
                        ((TyreOff) actualSupporter).leaveTyre();

                        String actions = "brought";
                        String zone = "rear left";
                        String part = "tyre";

                        printActions(actualSupporter, actions, zone, part, carA);

                        foundTeamMate = true;

                        break;
                    }
                }
            }
        }

        //Busca al TyreGunner
        for (int i = 0; i < PitCrewTeamMembers.size(); i++){

            if( PitCrewTeamMembers.get(i) instanceof TyreGunner){
 
             if(PitCrewTeamMembers.get(i).getWorking() == false){
 
                PitCrewTeamMembers.get(i).setWorking(true);
                 TeamMember actualTyreGunner = PitCrewTeamMembers.get(i);
 
                 ((TyreGunner)actualTyreGunner).modifyRearLeftBolts(carA, true);
 
                 String actions = "bolt";
                 String zone = "rear left";
                 String part = "tyre";
 
                 printActions(actualTyreGunner, actions, zone, part, carA);
 
                 foundTeamMate = true;
 
                 break;
             }
            }
        }

    };

    public void setUpRearRightTyre() {

        boolean foundTeamMate = false;

        //Exclusivos
        for (int i = 0; i < teamMembersA.size(); i++){

           if( teamMembersA.get(i) instanceof TyreOn){

            if(teamMembersA.get(i).getWorking() == false){

                teamMembersA.get(i).setWorking(true);
                TeamMember actualTyreOn = teamMembersA.get(i);

                ((TyreOn)actualTyreOn).carryTyre();
                ((TyreOn)actualTyreOn).running(true);
                ((TyreOn)actualTyreOn).leaveTyre();

                String actions = "brought";
                String zone = "rear right";
                String part = "tyre";

                printActions(actualTyreOn, actions, zone, part, carA);

                foundTeamMate = true;

                break;
            }
           }
        }

        //Pide Asistencia a los demás 
        if(foundTeamMate == false){

            for (int i = 0; i < PitCrewTeamMembers.size(); i++){

                if(PitCrewTeamMembers.get(i) instanceof TyreOn){
                    if(PitCrewTeamMembers.get(i).getWorking() == false){

                        if(PitCrewTeamMembers.get(i).getTeam().equals("B") == false){

                            PitCrewTeamMembers.get(i).setWorking(true);

                            TeamMember actualSupporter = PitCrewTeamMembers.get(i);
    
                            ((TyreOn)actualSupporter).carryTyre();
                            ((TyreOn)actualSupporter).running(true);
                            ((TyreOn)actualSupporter).leaveTyre();
    
                            String actions = "brought";
                            String zone = "rear right";
                            String part = "tyre";
    
                            printActions(actualSupporter, actions, zone, part, carA);

                            foundTeamMate = true;

                            break;

                        }
                    }
                }
            }
        } 


        //Reevalúa la asistencia
        if (foundTeamMate == false) {

            System.out.println("Looks like we need some help, not enough TyreOn members avaible");

            for (int i = 0; i < PitCrewTeamMembers.size(); i++) {

                if (PitCrewTeamMembers.get(i) instanceof TyreOff) {

                    if (PitCrewTeamMembers.get(i).getWorking() == false) {

                        PitCrewTeamMembers.get(i).setWorking(true);
                        TeamMember actualSupporter = PitCrewTeamMembers.get(i);

                        ((TyreOff) actualSupporter).carryTyre();
                        ((TyreOff) actualSupporter).running(true);
                        ((TyreOff) actualSupporter).leaveTyre();

                        String actions = "brought";
                        String zone = "rear right";
                        String part = "tyre";

                        printActions(actualSupporter, actions, zone, part, carA);

                        foundTeamMate = true;

                        break;
                    }
                }
            }
        }

        //Busca un TyreGunner 
        for (int i = 0; i < PitCrewTeamMembers.size(); i++){

            if( PitCrewTeamMembers.get(i) instanceof TyreGunner){
 
             if(PitCrewTeamMembers.get(i).getWorking() == false){
 
                PitCrewTeamMembers.get(i).setWorking(true);
                 TeamMember actualTyreGunner = PitCrewTeamMembers.get(i);
 
                 ((TyreGunner)actualTyreGunner).modifyRearRightBolts(carA, true);
 
                 String actions = "bolt";
                 String zone = "rear right";
                 String part = "tyre";
 
                 printActions(actualTyreGunner, actions, zone, part, carA);
 
                 foundTeamMate = true;
 
                 break;
                }
            }
        }        

    };

    public void increaseWingTightness() {

        for(int i = 0; i < teamMembersA.size(); i++ ){
            if(teamMembersA.get(i) instanceof FrontWingAdjust){
                if(teamMembersA.get(i).getWorking() == false){

                    teamMembersA.get(i).setWorking(true);

                    TeamMember actualFrontWingAdjust = teamMembersA.get(i);

                    ((FrontWingAdjust)actualFrontWingAdjust).increaseWingTightness(carA);

                    String actions = "tightened";
                    String zone = "front";
                    String part = "wing";

                    printActions(actualFrontWingAdjust, actions, zone, part, carA);

                }
            }
        }

    };

    public void decreaseWingTightness() {
        for(int i = 0; i < teamMembersA.size(); i++ ){
            if(teamMembersA.get(i) instanceof FrontWingAdjust){
                if(teamMembersA.get(i).getWorking() == false){

                    teamMembersA.get(i).setWorking(true);

                    TeamMember actualFrontWingAdjust = teamMembersA.get(i);

                    ((FrontWingAdjust)actualFrontWingAdjust).decreaseWingTightness(carA);

                    String actions = "tightened";
                    String zone = "front";
                    String part = "wing";

                    printActions(actualFrontWingAdjust, actions, zone, part, carA);

                }
            }
        }
    };

    //Front & Rear Jacks

    public void setUpFrontJack() {

        // Busca a el "FronJack" exclusivo del equipo "A"
        for (int i = 0; i < teamMembersA.size(); i++) {

            if (teamMembersA.get(i) instanceof FrontJack) {
                if (teamMembersA.get(i).getWorking() == false) {

                    teamMembersA.get(i).setWorking(true);
                    TeamMember actualFrontJack = teamMembersA.get(i);
                    ((FrontJack) actualFrontJack).setUpJack(carA); // <- Polimorfismo

                    String actions = "set up";
                    String zone = "front";
                    String part = "jack";

                    printActions(actualFrontJack, actions, zone, part, carA);

                    break;
                }
            }
        }

    };

    public void setUpRearJack() {

        // Busca el RearJack exclusivo de equipo
        for (int i = 0; i < teamMembersA.size(); i++) {

            if (teamMembersA.get(i) instanceof RearJack) {
                if (teamMembersA.get(i).getWorking() == false) {

                    teamMembersA.get(i).setWorking(true);
                    TeamMember actualRearJack = teamMembersA.get(i);
                    ((RearJack) actualRearJack).setUpJack(carA); // <- Polimorfismo

                    String actions = "set up";
                    String zone = "rear";
                    String part = "jack";

                    printActions(actualRearJack, actions, zone, part, carA);

                    break;
                }
            }
        }

    };




    //Side Jacks



    public void setUpLeftSideJack() {

     // Busca un SideJack del PitCrewTeam disponible
     for (int i = 0; i < PitCrewTeamMembers.size(); i++) {

        if (PitCrewTeamMembers.get(i) instanceof SideJack) {
            if (PitCrewTeamMembers.get(i).getWorking() == false) {

                PitCrewTeamMembers.get(i).setWorking(true);
                TeamMember actualSideJack = PitCrewTeamMembers.get(i);
                ((SideJack) actualSideJack).setUpJack(carA, false); // <- Polimorfismo
                //side: false = izquierda

                String actions = "set up";
                String zone = "left side";
                String part = "jack";

                printActions(actualSideJack, actions, zone, part, carA);

                break;
            }
        }
    }

    };

    public void setUpRightSideJack() {
       
        // Busca otro SideJack del PitCrewTeam disponible
     for (int i = 0; i < PitCrewTeamMembers.size(); i++) {

        if (PitCrewTeamMembers.get(i) instanceof SideJack) {
            if (PitCrewTeamMembers.get(i).getWorking() == false) {

                PitCrewTeamMembers.get(i).setWorking(true);
                TeamMember actualSideJack = PitCrewTeamMembers.get(i);
                ((SideJack) actualSideJack).setUpJack(carA, true); // <- Polimorfismo
                //side: true = derecha

                String actions = "set up";
                String zone = "right side";
                String part = "jack";

                printActions(actualSideJack, actions, zone, part, carA);

                break;
            }
        }
    }

    };





    public void removeFrontJack() {

        for (int i = 0; i < PitCrewTeamMembers.size(); i++){
            if(PitCrewTeamMembers.get(i) instanceof FrontJack){
                if(PitCrewTeamMembers.get(i).getWorking() == false){

                    PitCrewTeamMembers.get(i).setWorking(true);

                    TeamMember actualFrontJack = PitCrewTeamMembers.get(i);

                    ((FrontJack) actualFrontJack).removeJack(carA);

                    String actions = "removed";
                    String zone = "front";
                    String part = "jack";
    
                    printActions(actualFrontJack, actions, zone, part, carA);

                    break;
                }
            }
        }
    };

    public void removeRearJack() {

        for (int i = 0; i < PitCrewTeamMembers.size(); i++){
            if(PitCrewTeamMembers.get(i) instanceof RearJack){
                if(PitCrewTeamMembers.get(i).getWorking() == false){

                    if(PitCrewTeamMembers.get(i).getTeam().equals("A")){

                    PitCrewTeamMembers.get(i).setWorking(true);

                    TeamMember actualRearJack = PitCrewTeamMembers.get(i);

                    ((RearJack) actualRearJack).removeJack(carA);

                    String actions = "removed";
                    String zone = "rear";
                    String part = "jack";
    
                    printActions(actualRearJack, actions, zone, part, carA);

                    break;
                    }
                }
            }
        }

    };

    public void removeLeftSideJack() {

    // Busca un SideJack del PitCrewTeam disponible
    for (int i = 0; i < PitCrewTeamMembers.size(); i++) {

        if (PitCrewTeamMembers.get(i) instanceof SideJack) {
            if (PitCrewTeamMembers.get(i).getWorking() == false) {

                PitCrewTeamMembers.get(i).setWorking(true);
                TeamMember actualSideJack = PitCrewTeamMembers.get(i);
                ((SideJack) actualSideJack).removeJack(carA, false); // <- Polimorfismo
                //side: false = izquierda

                String actions = "removed";
                String zone = "left side";
                String part = "jack";

                printActions(actualSideJack, actions, zone, part, carA);

                break;
            }
        }
    }
    
    };

    public void removeRightSideJack() {
        // Busca un SideJack del PitCrewTeam disponible
        for (int i = 0; i < PitCrewTeamMembers.size(); i++) {

            if (PitCrewTeamMembers.get(i) instanceof SideJack) {
                if (PitCrewTeamMembers.get(i).getWorking() == false) {

                    PitCrewTeamMembers.get(i).setWorking(true);
                    TeamMember actualSideJack = PitCrewTeamMembers.get(i);
                    ((SideJack) actualSideJack).removeJack(carA, true);
                    // side: false = izquierda

                    String actions = "removed";
                    String zone = "right side";
                    String part = "jack";

                    printActions(actualSideJack, actions, zone, part, carA);

                    break;
                }
            }
        }
    };

    public void makeStopSignal() {

        //No tiene que verificar que el lollipopman esté ocupado, este siempre estará disponible
        for (int i = 0; i < PitCrewTeamMembers.size(); i++){
            if(PitCrewTeamMembers.get(i) instanceof LollipopMan){
                
                TeamMember lollipopman = PitCrewTeamMembers.get(i);

                ((LollipopMan)lollipopman).toLowerTheFlag();
            }
        }

    };

    public void makeGoSignal() {

        for (int i = 0; i < PitCrewTeamMembers.size(); i++){
            if(PitCrewTeamMembers.get(i) instanceof LollipopMan){
                
                TeamMember lollipopman = PitCrewTeamMembers.get(i);

                ((LollipopMan)lollipopman).toRaiseTheFlag();
            }
        }
    };

    public void teamWork(){
        makeStopSignal();
        System.out.println("");

        setUpFrontJack();
        System.out.println("");

        setUpRearJack();
        System.out.println("");

        setUpLeftSideJack();
        System.out.println("");

        setUpRightSideJack();
        System.out.println("");


        removeFrontLeftTyre();
        System.out.println("");

        removeFrontRightTyre();
        System.out.println("");

        removeRearLeftTyre();
        System.out.println("");

        removeRearRightTyre();
        System.out.println("");


        for (int i = 0; i < PitCrewTeamMembers.size(); i++){
            
            if(PitCrewTeamMembers.get(i) instanceof TyreOff){
                PitCrewTeamMembers.get(i).setWorking(false);
            }
        }

        increaseWingTightness();
        System.out.println("");

        setUpFrontLeftTyre();
        System.out.println("");

        setUpFrontRightTyre();
        System.out.println("");
        
        setUpRearLeftTyre();
        System.out.println("");

        setUpRearRightTyre();
        System.out.println("");

        for(int i = 0; i < PitCrewTeamMembers.size(); i++){
            if(PitCrewTeamMembers.get(i) instanceof FrontJack){
                PitCrewTeamMembers.get(i).setWorking(false);
            }
        }

        for(int i = 0; i < PitCrewTeamMembers.size(); i++){
            if(PitCrewTeamMembers.get(i) instanceof RearJack){
                PitCrewTeamMembers.get(i).setWorking(false);
            }
        }

        for(int i = 0; i < PitCrewTeamMembers.size(); i++){
            if(PitCrewTeamMembers.get(i) instanceof SideJack){
                PitCrewTeamMembers.get(i).setWorking(false);
            }
        }

        removeFrontJack();
        System.out.println("");

        removeRearJack();
        System.out.println("");

        removeLeftSideJack();
        System.out.println("");

        removeRightSideJack();
        System.out.println("");

        makeGoSignal();
        
    }

    public void printActions(TeamMember teamMember, String action, String zone, String part, RacingCar actualCar){
        
        System.out.println(teamMember.getClass().getName() + " " + teamMember.getName() + " " + action + " "  + zone + " " + part + " to the car "+  carA.getTeam());

    }

}
