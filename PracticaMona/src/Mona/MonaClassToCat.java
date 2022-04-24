package Mona;

public class MonaClassToCat extends Mona{
    MonaClassToCat(String Nombre) throws InterruptedException {
        super(Nombre);
    }

    @Override
    void caminar() {
        System.out.println("Se la pasa todo el día en su limosina de lujo"
                            +"\ndice que lo hace porque cuando no tenia dinero todo el día caminaba");
    }

    @Override
    void dormir() {
        System.out.println("Duerme casi todo el dia, dado que tiene tanto dinero que no nececita trabajar"
                            +"\nSu peor pesadilla es quedar sin dinero a como estaba antes");
    }

    @Override
    void comer() {
        System.out.println("El solo come comida fina:"
                            +"\nLangosta"
                            +"\nCabiar"
                            +"\nHuevos dorados"
                            +"\nSolo toma Vino");
    }
}
