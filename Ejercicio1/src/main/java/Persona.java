public class Persona implements Hablador, Trabajador{
    private String nombre;

    public Persona(String nombre){
        this.nombre = nombre;
    }

    @Override
    public void trabajar() {
        System.out.println(this.nombre+" esta trabajando");
    }

    @Override
    public void hablar(){
        System.out.println( this.nombre+" esta hablando");
    }
}