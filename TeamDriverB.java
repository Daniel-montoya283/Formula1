public interface TeamDriverB { //<- Herencia multiple

 //porfavor leer primero "TeamDriverA"
 // Esta interfaz es lo equivalente a TeamDriverA y está relacionado con sus miembros de la misma manera
 
 
 
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
