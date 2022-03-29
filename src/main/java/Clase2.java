import java.util.Scanner;

public class Clase2 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Usuario u1 = new Usuario("pacosanz69", "1234");
        //Usuario u2 = new Usuario();
        Usuario[] usuarios= new Usuario[2];
        usuarios[0] = u1;
        //usuarios[1] = u2;

        if (comprobarLogin(sc, usuarios)){
            System.out.println("Inicio de sesion correcto!");
        }else
            System.out.println("Fallo en el inicio de sesion");

    }

    private static boolean comprobarLogin(Scanner sc, Usuario[] usuarios){
        String texto;

        do {
            System.out.println("Dime un nombre de usuario: ");
            texto= sc.nextLine();
        }while (!usuarios[0].getUsername().equals(texto));
        System.out.println("Nombre de usuario correcto");

        System.out.println("Pon la contraseña: ");
        texto = sc.nextLine();
        byte contVeces=0;
        while (!usuarios[0].getPassword().equals(texto) && contVeces<2){
            System.out.println("Pon la contraseña: ");
            texto = sc.nextLine();
            contVeces++;
        }

        return usuarios[0].getPassword().equals(texto);
    }
}
