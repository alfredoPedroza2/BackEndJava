package Mona;

public class MonaLuhadorToCat extends Mona{
    MonaLuhadorToCat(String Nombre) throws InterruptedException {
        super(Nombre);
    }

    @Override
    void caminar() {
        System.out.println("Este gato luchador siempre llevara con el su mascara"
                            +"\nNo suele camiinar poque seipre se la pasa entrenando"
                            +"\nEn ocaciones prefiere correr");
    }

    @Override
    void dormir() {
        System.out.println("Siempre duerme hasta con la mascara puesta nunca las deja atras"
                            +"\nSu peor pesadilla es sperder algun dia su mascara en combate"
                            +"\nNI SU FAMILIA CONOCE SU ROSTRO");
    }

    @Override
    void comer() {
        System.out.println("Suele comer un licuado muy extraño pero siempre lleno de poder, contiene"
                            +"\nVeneno de alacran"
                            +"\nVeneno de cobra"
                            +"\nleche"
                            +"\nhuevos"
                            +"\nplatanos"
                            +"\nPOR LO MENOS ESO ES LO QUE DICE QUE CONTIENE");
    }
}
