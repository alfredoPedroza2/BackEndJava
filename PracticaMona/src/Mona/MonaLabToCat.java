package Mona;

public class MonaLabToCat extends Mona{
    MonaLabToCat(String Nombre) throws InterruptedException {
        super(Nombre);
    }

    @Override
    void caminar() {
        System.out.println("El no camina !!!"
                            +"\nEl se transporta con su maquina de teletransportacion"
                            +"\nDice que caminar es pare gente floja!!!");
    }

    @Override
    void dormir() {
        System.out.println("El duerme muy poco, se la pasa pensando en nuevos inventos"
                            +"\nsu mayor miedo es convertirse en un vilano"
                            +"\nsueña que sus experimentos nunca fallan");
    }

    @Override
    void comer() {
        System.out.println("El no come!!!"
                            +"\nRealizo un antidoto que hace que no le de hambre"
                            +"\nSiempre tiene sabor de coida cuando es necesario");
    }
}
