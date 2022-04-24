package Mona;

public class MonaSkateToCat extends Mona{

    MonaSkateToCat(String Nombre) throws InterruptedException {
        super(Nombre);
    }

    @Override
    void caminar() {
        System.out.println("Este gatito no camina, todo el dia sel pasa patinando"
                            +"\n AUN CUANDO VA AL BAÑO LLEVA LA PATINETA CON EL");
    }

    @Override
    void dormir() {
        System.out.println("Este gatito duerme abrazado a su patineta, nunca la deja"
                            +"siempre sueña con ser el mas grande patinador");
    }

    @Override
    void comer() {
        System.out.println("Este gatito suele comer solo:"
                            +"\nCome de todo casi nada es una liitante para el "
                            +"\nSu vevida preferida son la vevidar energetizantes");
    }
}
