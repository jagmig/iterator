package iterator;

/*Elegí el patróm iterator por que me parece que es el mas sencillo de entender, ya que sus metodos next(),
reset() y hasMore() son faciles de entender para recorrer cualquier tipo de array. Y como su definición dice,
los recorre sin importar como están almacenados.

Y su vez se le aplica el refactor para no tener que repetir código o métodos que ya hacen lo mismo.*/

public class Main {
    public static void main(String[] args) {

        System.out.println("Hola");
        Usuarios usuarios = new Usuarios();
        usuarios.make(new Usuario("Juan",18));
        usuarios.make(new Usuario("Jorge", 25));
        usuarios.make(new Usuario("Ramiro", 55));
        usuarios.make(new Usuario("María", 70));
        usuarios.make(new Usuario("Alma", 20));
        while(usuarios.hasMore()){
            Usuario usuario = usuarios.next();
            System.out.println(usuario.getNombre() + " " + usuario.getEdad());
        }
        usuarios.reset();
        while(usuarios.hasMore()){
            Usuario usuario = usuarios.next();
            System.out.println(usuario.getNombre() + " " + usuario.getEdad());
        }

    }
}