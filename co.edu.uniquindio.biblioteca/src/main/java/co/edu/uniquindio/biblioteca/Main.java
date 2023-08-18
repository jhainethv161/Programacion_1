package co.edu.uniquindio.biblioteca;
import co.edu.uniquindio.biblioteca.model.Libro;
import javax.sound.midi.SysexMessage;
public class Main {
    public static void main(String[] args) {
        Libro libro1 = new Libro();
        Libro libro2 = new Libro();
        Libro libro3 = new Libro();
        Libro libro4 = new Libro();
        Libro libro5 = new Libro();

        libro1.setNombre("Calculo integral");
        libro1.setGenero("Estudio");
        libro1.setAutor("Stewart");
        libro1.setAnioPublicacion(2006);
        libro1.setNumeroPaginas(195);
        libro1.setEditorial("Cengaje Learning");

        libro2.setNombre("Calculo diferencial");
        libro2.setGenero("Estudio");
        libro2.setAutor("Stewart");
        libro2.setAnioPublicacion(1994);
        libro2.setNumeroPaginas(363);
        libro2.setEditorial("Cengaje Learning");

        libro3.setNombre("El principito");
        libro3.setGenero("Infantil");
        libro3.setAutor("Oscar Montoya");
        libro3.setAnioPublicacion(1990);
        libro3.setNumeroPaginas(150);
        libro3.setEditorial("Planeta");

        libro4.setNombre("Eso");
        libro4.setGenero("Terror");
        libro4.setAutor("Stephen King");
        libro4.setAnioPublicacion(1990);
        libro4.setNumeroPaginas(760);
        libro4.setEditorial("Debolsillo");

        libro5.setNombre("Harry Potter");
        libro5.setGenero("Fantasia");
        libro5.setAutor("J.K Rowlin");
        libro5.setAnioPublicacion(1999);
        libro5.setNumeroPaginas(436);
        libro5.setEditorial("Planeta");

        //Contar cuantos nombres del libro inician con vocal y cuantos inician con consonante

        int iniciaVocal = 0;
        int iniciaConsonante = 0;

        if (esVocal(libro1.getNombre())){
            iniciaVocal++;
        }else{
            iniciaConsonante++;
        }
        if (esVocal(libro2.getNombre())){
            iniciaVocal++;
        }else{
            iniciaConsonante++;
        }
        if (esVocal(libro3.getNombre())){
            iniciaVocal++;
        }else{
            iniciaConsonante++;
        }if (esVocal(libro4.getNombre())){
            iniciaVocal++;
        }else{
            iniciaConsonante++;
        }if (esVocal(libro5.getNombre())){
            iniciaVocal++;
        }else {
            iniciaConsonante++;
        }

        System. out. println("La cantidad libros que su nombre inicia con vocal es "+iniciaVocal+"\nLa cantidad libros que su nombre inicia con consonantes es: "+iniciaConsonante+"\n");

        //Contar cuantos libros tienen como genero "Terror"
        int contadorTerror = 0;
        if (contarTerror(libro1.getGenero())){
            contadorTerror++;
        }
        if (contarTerror(libro2.getGenero())){
            contadorTerror++;
        }
        if (contarTerror(libro3.getGenero())){
            contadorTerror++;
        }
        if (contarTerror(libro4.getGenero())){
            contadorTerror++;
        }
        if (contarTerror(libro5.getGenero())){
            contadorTerror++;
        }
        System. out. println("La cantidad de libros que tienen como genero terror es: "+contadorTerror+"\n");

        //Cambiar titulo del libro "calculo integral" por "calculo integral y diferencial"

        String nuevoTitulo = "Calculo integral y diferencial";
        String tituloBuscar = "Calculo integral";

        if (buscarTitulo(tituloBuscar, libro1.getNombre())){
            libro1.setNombre(nuevoTitulo);
            System.out.println("Ahora el nombre del libro 1 es: "+nuevoTitulo+"\n");
        }
        if (buscarTitulo(tituloBuscar, libro2.getNombre())){
            libro2.setNombre(nuevoTitulo);
            System.out.println( "Ahora el nombre del libro 2 es: "+nuevoTitulo+"\n");
        }
        if (buscarTitulo(tituloBuscar,libro3.getNombre())){
            libro3.setNombre(nuevoTitulo);
            System.out.println( "Ahora el nombre del libro 3 es: "+nuevoTitulo+"\n");
        }
        if (buscarTitulo(tituloBuscar,libro4.getNombre())) {
            libro4.setNombre(nuevoTitulo);
            System.out.println("Ahora el nombre del libro 4 es: " + nuevoTitulo+"\n");
        }
        if (buscarTitulo(tituloBuscar,libro5.getNombre())){
            libro5.setNombre(nuevoTitulo);
        System.out.println( "Ahora el nombre del libro 5 es: "+nuevoTitulo+"\n");

        }

        //mostrar nombre de los libros y el numero de sus paginas
        mostrarNombreYPaginas(libro1);
        mostrarNombreYPaginas(libro2);
        mostrarNombreYPaginas(libro3);
        mostrarNombreYPaginas(libro4);
        mostrarNombreYPaginas(libro5);


    }

    public static boolean esVocal(String cadena){
        boolean valido = false;
        String lowerCase = cadena.toLowerCase();
        char caracterValidacion = lowerCase.charAt(0);
        if (caracterValidacion == 'a'|| caracterValidacion == 'e'||caracterValidacion == 'i'||caracterValidacion == 'o'||caracterValidacion == 'u'){
            valido = true;
        }
        return valido;
    }

    public static boolean contarTerror(String genero){
        boolean valido = false;
        if (genero.equalsIgnoreCase("Terror")){
            valido=true;
        }
        return valido;
    }

    public static boolean buscarTitulo(String tituloBuscar, String cadena){
        tituloBuscar =tituloBuscar.toLowerCase();
        cadena  = cadena.toLowerCase();
        boolean coincide = false;
        if (cadena.equalsIgnoreCase(tituloBuscar)){
            coincide =true;
        }
        return coincide;
    }

    public static void mostrarNombreYPaginas(Libro libro){
        String nombre = libro.getNombre();
        int paginas = libro. getNumeroPaginas();
        String mensaje = "Libro: " +nombre+"\nCantidad de paginas: "+paginas+"\n --------------";
        System.out.println(mensaje);
    }
}