import java.util.Scanner;

public class Clase2 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        ListaUsuarios l = new ListaUsuarios();

        System.out.println("1.-Login");
        System.out.println("2.-Registro");
        byte eleccion = sc.nextByte();

        if (eleccion==1){
            if (l.iniciarSesion()) {
                System.out.println("Usuario logueado");
            } else {
                System.out.println("Alerta Hackerman!");
            }
        }else{

        }

    }

}

