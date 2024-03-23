public class LollipopMan extends TeamMember {

    //Contiene 4 atributos:
    //Los ha heredado de TeamMember por lo que le pertenecen a la clase
    //name
    //working
    //team
    //exclusive
 
    public LollipopMan(String name){
        super(name);
    }

    public void toRaiseTheFlag(){
        System.out.println(this.getClass().getName() + " " + super.name + " have just riased the flag! ");
    }

    public void toLowerTheFlag(){
        System.out.println(this.getClass().getName() + " " + super.name + " have just lowered the flag! ");
    }

    @Override
    public void toGreet() {
        System.out.println("Hi my name is " + super.name + " im the lollipopman, really exited to work here"); //<- Polimorfismo
    }

}

