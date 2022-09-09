public class Cat {
    private static Cat instancia;
    String name;
    String color;
    int age;

    private Cat ()  { }

    public static Cat getInstancia() {
        if ( instancia == null ) {
            instancia = new Cat();
        }
        return instancia;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void crearGato (Cat cat,String name, int age, String color ) {
        cat.setName(name);
        cat.setAge( age );
        cat.setColor(color);
    }

    public void showInfoCat ( Cat cat) {
        System.out.println("name: " + cat.getName());
        System.out.println("age: " + cat.getAge());
        System.out.println("color: " + cat.getColor());
    }
}
