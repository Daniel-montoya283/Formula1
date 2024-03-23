public class TeamMember {

    //Esta calse permite conectar a todos los miembros del equipo a una misma clase padre aplicando herencia
    //Es bastante versátil ya que permite tener a todos los miembros del equipo de diferentes clases en listas dinámicas

    //Esta clase heredará los atributos a los roles de los pits, de esta manera, todas las clases de tipo rol tendrán al menos 4 atributos
    //como resalta la guía de la práctica

    protected boolean exclusive;
    protected String team;
    protected String name;
    protected boolean working;

    public TeamMember(String name){
        this.name = name;
        this.team = "NA";
        this.exclusive = false;
    }

    public TeamMember(String name, boolean exclusive, String team){ //<- Sobrecarga de métodos
        this.name = name;
        this.team = team;
        this.exclusive = true;
    }

    //saludar
    public void toGreet(){
        System.out.println("Hi! i'm " + this.name);
    }

    public String getTeam(){
        return this.team;
    }

    public boolean getExclusive(){
        return this.exclusive;
    }

    public String getName(){
        return this.name;
    }

    public boolean getWorking(){
        return this.working;
    }

    public void setWorking(boolean status){
        this.working = status;
    }
}
