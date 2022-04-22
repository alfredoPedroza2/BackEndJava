package HarryPotter;

public class Main extends Thread{

    public static void main(String[] args) throws InterruptedException {
        Personajes per1 = new Personajes (
                "Mujer","Ginny","Gryffindor","Voldemort","Caballo"
        );

        Personajes per2 = new Personajes (
                "Hombre","Voldemort","Sitheryn","Morir","Serpiente"
        );

        Personajes per3 = new Personajes (
                "Hombre","Ron Weasley","Gryffindor","Acromántula","Jack Russel"
        );

        Personajes per4 = new Personajes (
                "Mujer","Minerva","Gryffinfor","Alumnos Muertos","Gato"
        );

        Personajes per5 = new Personajes (
                "Mujer","Bellatrix","Sitheryn","Desconocido","Ninguno"
        );

        System.out.println("___________________________________________");
        System.out.println("\tYo soy el personaje 1");
        System.out.println("Mi nobres es: " + per1.getNombre());
        System.out.println("Soy un/a: " + per1.getGenero());
        System.out.println("De las casa: " + per1.getCasa());
        System.out.println("Tengo un boggart: " + per1.getBoggart());
        System.out.println("Y un patronus llamado: " + per1.getPatronus());

        Thread.sleep(3000);

        System.out.println("\n___________________________________________");
        System.out.println("\tYo soy el personaje 2");
        System.out.println("Mi nobres es: " + per2.getNombre());
        System.out.println("Soy un/a: " + per2.getGenero());
        System.out.println("De las casa: " + per2.getCasa());
        System.out.println("Tengo un boggart: " + per2.getBoggart());
        System.out.println("Y un patronus llamado: " + per2.getPatronus());

        Thread.sleep(3000);

        System.out.println("\n___________________________________________");
        System.out.println("\tYo soy el personaje 3");
        System.out.println("Mi nobres es: " + per3.getNombre());
        System.out.println("Soy un/a: " + per3.getGenero());
        System.out.println("De las casa: " + per3.getCasa());
        System.out.println("Tengo un boggart: " + per3.getBoggart());
        System.out.println("Y un patronus llamado: " + per3.getPatronus());


        Thread.sleep(3000);

        System.out.println("\n___________________________________________");
        System.out.println("\tYo soy el personaje 4");
        System.out.println("Mi nobres es: " + per4.getNombre());
        System.out.println("Soy un/a: " + per4.getGenero());
        System.out.println("De las casa: " + per4.getCasa());
        System.out.println("Tengo un boggart: " + per4.getBoggart());
        System.out.println("Y un patronus llamado: " + per4.getPatronus());


        Thread.sleep(3000);

        System.out.println("\n___________________________________________");
        System.out.println("\tYo soy el personaje 5");
        System.out.println("Mi nobres es: " + per5.getNombre());
        System.out.println("Soy un/a: " + per5.getGenero());
        System.out.println("De las casa: " + per5.getCasa());
        System.out.println("Tengo un boggart: " + per5.getBoggart());
        System.out.println("Y un patronus llamado: " + per5.getPatronus());

    }
}
