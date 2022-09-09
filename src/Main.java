public class Main {
    public static void main(String[] args) {
        Cat cosmo = Cat.getInstancia();
        cosmo.crearGato(cosmo, "cosmo", 3, "gris");
        cosmo.showInfoCat(cosmo);

        Cat max = Cat.getInstancia();
        max.crearGato(max, "max", 5, "blanco");
        max.showInfoCat(max);

        Cat federico = Cat.getInstancia();
        System.out.println("no es federico: " + federico.getName());
    }
}