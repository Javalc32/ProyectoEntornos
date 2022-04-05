import java.util.Scanner;

public class ListaUsuarios {
    Usuario[] usuarios;

    ListaUsuarios() {
        Usuario u1 = new Usuario("Antonio", "1234");
        usuarios = new Usuario[10];
        usuarios[0] = u1;
    }

    public boolean registro(){
        Usuario usuarioCandidato;

        System.out.println("Creando usuario...");
        Scanner sc = new Scanner(System.in);


            System.out.println("Introduce el nombre del usuario");
            String nombreCandidato = sc.nextLine();
            usuarioCandidato = buscarUsuarioPorNombre(usuarios, nombreCandidato);

            if (usuarioCandidato!=null) {
                System.out.println("El usuario ya existe");
                return false;
            }else {
                System.out.println("Introduce la pass del usuario " + nombreCandidato);
                String passCandidata1 = sc.nextLine();


                System.out.println("Introduce la pass de nuevo: ");
                String passCandidata2 = sc.nextLine();

                if (!usuarioCandidato.coincidePass(passCandidata1, passCandidata2)){
                    System.out.println("Las passwords no coinciden");
                    usuarioCandidato.getPass(passCandidata1);
                    return false;
                }else {
                    for (byte cont=0; cont<10; cont++){
                        if (usuarios[cont]!=null)
                            usuarios[cont]=usuarioCandidato;
                    }
                    return true;
                }
            }
    }

    public boolean iniciarSesion(){
        Scanner sc = new Scanner(System.in);
        Usuario usuarioCandidato;
        System.out.println("Comenzando el login");

        do {
            System.out.println("Introduce el nombre del usuario");
            String nombreCandidato = sc.nextLine();
            usuarioCandidato = buscarUsuarioPorNombre(usuarios, nombreCandidato);
            if (usuarioCandidato != null) {
                System.out.println(nombreCandidato + " es un nombre correcto.");
            }
        } while (usuarioCandidato == null);

        do {
            System.out.println("Introduce la contraseña");
            String passCandidata = sc.nextLine();
            if (usuarioCandidato.passCorrecta(passCandidata)) {
                return true;
            }
        } while (usuarioCandidato.quedanIntentos());
        return false;

    }

    private Usuario buscarUsuarioPorNombre(Usuario[] usuarios, String nombreCandidato){
        for (Usuario u : usuarios) {
            if (u.nombreCorrecto(nombreCandidato)) return u;
        }
        return null;
    }
}
