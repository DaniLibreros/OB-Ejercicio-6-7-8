public class Main {
    public static void main(String[] args) {
        Cat cosmo = Cat.getInstancia();
        cosmo.setName( "cosmo");
        cosmo.setAge( 3 );
        cosmo.setColor("gris");

        System.out.println("name: " + cosmo.getName());
        System.out.println("age: " + cosmo.getAge());
        System.out.println("color: " + cosmo.getColor());

        Cat federico = Cat.getInstancia();
        System.out.println("no es federico: " + federico.getName());
    }
}