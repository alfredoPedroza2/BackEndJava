package Mona;

public class MonaRobotToCoat extends Mona{
    MonaRobotToCoat(String Nombre) throws InterruptedException {
        super(Nombre);
    }

    @Override
    void caminar() {
        System.out.println("No camina!!!"
                            +"\nSe la pasa volando con sus proyectiles"
                            +"\nDi que la humidad aun tiene esperanza si camina mas");
    }

    @Override
    void dormir() {
        System.out.println("No duerme, es solo recarga su bateria de foma automatica"
                            +"\nDice que le gustaria poder dormir aunque sea 1 vez");
    }

    @Override
    void comer() {
        System.out.println("No comer, el solo mira como la humanidad come"
                            +"\nDice que no le gustaria comer");
    }
}
