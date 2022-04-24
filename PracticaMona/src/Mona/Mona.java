package Mona;

abstract class Mona {

    Mona(String Nombre) throws InterruptedException{
        System.out.println("Generando Personaje espera....");
        Thread.sleep(3000);
        System.out.println("Personje iniciado con el nombre de: " + Nombre);
        System.out.println("Apareciendo personaje espera.....");
        Thread.sleep(3000);
        System.out.println("Persoanje Aparecido en campo");
    }

    abstract void caminar ();
    abstract void dormir ();
    abstract void comer ();
}
