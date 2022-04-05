import java.util.Scanner;

public class Usuario {

    private String nombre;
    private String pass;
    private int intentosRestantes = 3;


    Usuario(String nombre, String pass) {
        this.nombre = nombre;
        this.pass = pass;
    }

    @Override
    public String toString() {
        return "Mi nombre es " + nombre + " y mi pass es " + pass;
    }

    public boolean nombreCorrecto(String nombreCandidato) {
        return nombreCandidato.contentEquals(nombre);
    }

    public boolean passCorrecta(String pasCandidata) {
        if (pasCandidata.contentEquals(pass)) {
            intentosRestantes = 3;
            return true;
        } else {
            intentosRestantes--;
            return false;
        }
    }

    public boolean quedanIntentos() {
        return intentosRestantes > 0;
    }


    public boolean coincidePass(String pass1, String pass2) {
        return pass1.equals(pass2);
    }

    public String getPass(String pass){
        return this.pass=pass;
    }



}
