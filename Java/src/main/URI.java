package main;

public abstract class URI {

    public abstract String getExercicio();
    public abstract void core();

    public void execute(){
        System.out.println("*********** EXECUTANDO - " + getExercicio() + "***********");
        core();
        System.out.println("*********** FINALIZADO - " + getExercicio() + "***********");
    }
}
