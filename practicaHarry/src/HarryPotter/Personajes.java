package HarryPotter;

public class Personajes {

    private String casa, genero, nombre, boggart, patronus;

    //Creamos un contructor para al ser mandoado a llamar se declare asi
    Personajes(String genero, String nombre, String casa, String boggart, String patronus){
        this.casa = casa;
        this.genero = genero;
        this.nombre = nombre;
        this.boggart = boggart;
        this.patronus = patronus;
    }

    //Los setters y getter se generaron para practicar, para cada
    //una de las caracteristicas se generara una
    //Estos son los Getters
    public String getGenero(){
        return genero;
    }

    public String getNombre(){
        return nombre;
    }

    public String getCasa(){
        return casa;
    }

    public String getBoggart(){
        return boggart;
    }

    public String getPatronus(){
        return patronus;
    }

    //Estos son los settters
    public boolean setGenero(String Genero){
        if(!(genero.isEmpty())){
            this.genero = genero;
            return true;
        }else
            return false;
    }

    public boolean setNombre(String nombre){
        if(!(nombre.isEmpty())){
            this.nombre = nombre;
            return true;
        }else
            return false;
    }

    public boolean setBoggart(String boggart){
        if(!(boggart.isEmpty())){
            this.boggart =  boggart;
            return true;
        }else
            return false;
    }

    public boolean setPatronus(String patonus){
        if(!(patronus.isEmpty())){
            this.patronus =  patronus;
            return true;
        }else
            return false;
    }

    public boolean setCasa(String casa){
        if(!(casa.isEmpty())){
            this.casa = casa;
            return true;
        }else
            return false;
    }
}
