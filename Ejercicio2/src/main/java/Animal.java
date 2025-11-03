public class Animal implements Volador,Nadador{
    private String nombreAnimal;

    public Animal(String nombreAnimal){
        this.nombreAnimal = nombreAnimal;
    }

    @Override
    public void volar() {
        System.out.println("El "+this.nombreAnimal+" esta volando");
    }

    @Override
    public void nadar() {
        System.out.println("El "+this.nombreAnimal+" esta nadando");
    }
}
