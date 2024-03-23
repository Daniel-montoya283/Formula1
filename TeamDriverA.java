public interface TeamDriverA {

    //se ha puesto como interfaz a "TeamDriverA" para que pueda usarse en otras clases haciendo herencia multiple
    //contiene todos los métodos que deben hacer los miembros del equipo "A" tales como:
    //removeFrontLeftTyre(), removeBolts(), etc. estos métodos en la clase "TeamA" los implementa a sus miembros
    //Los miembros "A" estan directamente relacionados con "TeamDriverA" mediante la clase "TeamA"

    public void removeFrontLeftTyre();
    public void removeFrontRightTyre();
    public void removeRearLeftTyre();
    public void removeRearRightTyre();

    public void setUpFrontLeftTyre();
    public void setUpFrontRightTyre();
    public void setUpRearLeftTyre();
    public void setUpRearRightTyre();

    public void increaseWingTightness();
    public void decreaseWingTightness();

    public void setUpFrontJack();
    public void setUpRearJack();
    public void setUpLeftSideJack();
    public void setUpRightSideJack();

    public void removeFrontJack();
    public void removeRearJack();
    public void removeLeftSideJack();
    public void removeRightSideJack();

    public void makeStopSignal();
    public void makeGoSignal();
}