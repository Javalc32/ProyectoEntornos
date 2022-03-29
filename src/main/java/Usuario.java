import java.util.Scanner;

public class Usuario {
    private String username;
    private String password;

    Usuario(){
        Scanner sc= new Scanner(System.in);
        System.out.println("Introduce el nombre de usuario: ");
        this.username=sc.nextLine();
        System.out.println("Introduce la contraseña: ");
        this.password= sc.nextLine();
    }

    Usuario(String username, String password){
        this.username=username;
        this.password=password;
    }

    public String getUsername(){
        return username;
    }

    public String getPassword(){
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    @Override
    public String toString() {
        return "Mi nombre es " + username + " y mi pass es " + password ;
    }
}
