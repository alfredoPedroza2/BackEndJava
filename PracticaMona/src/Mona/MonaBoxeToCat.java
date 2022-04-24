package Mona;

public class MonaBoxeToCat extends Mona{

    MonaBoxeToCat(String Nombre) throws InterruptedException {
        super(Nombre);
    }

    @Override
    void caminar(){
        System.out.println("Este gattito boxeador camina dando brinco y sin bajar la guardia"
                            +"\nEN OCACIONES NO PREFIERE CAMINA Y SOLO VIAJAR EN SU CAMIONETA");
    }

    @Override
    void comer() {
        System.out.println("Este gato solo como lo siguientes alimentos:"
                            +"\n Carnes Para tener una buenca cantidad proteinas"
                            +"\n Agua para mantenerce hidratado"
                            +"\n frutas y verduras para mantenerse sano"
                            +"\n EN OCACIONES NO PUEDE RECISTIRCE A COMER TACOS....");
    }

    @Override
    void dormir() {
        System.out.println("Este gatitco duerme de manera normal, en ocaciones sueña con ganarle al campeon del mundo en una batalla");
    }
}
