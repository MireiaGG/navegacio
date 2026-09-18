//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import java.util.*;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        ArrayList<String> usuarios = new ArrayList<>();
        int op = -1;
        int op2 = -1;

        while (op != 0){
            System.out.println("Bienvenido al menú principal elige una de las opciones:");
            System.out.println("1.Gestión de usuarios");
            System.out.println("2.Mirar estado del sistema");
            System.out.println("0.Salir");
            op = sc.nextInt();
            if (op == 1){
                while(op2 != 0){
                    op2 = subMenu(sc);
                    if (op2 == 1){
                        primeraOp(usuarios);
                    } else if (op2 == 2) {
                        usuarios = segundaOp(sc, usuarios);

                    }
                }
            }else if (op == 2){
                System.out.println("Todo va bien");

            }
        }
        System.out.println("Has cerrado el menú. Adios");
        sc.close();
    }
    public static int subMenu(Scanner sc){
        System.out.println("Has abierto el submenú elige una opcion:");
        System.out.println("1.Listar usuarios");
        System.out.println("2.Añadir nuevo usuario");
        System.out.println("0.Volver al menú");
        return sc.nextInt();
    }
    public static void primeraOp(ArrayList<String> usuarios){
        System.out.println("Buscando usuarios...");
        for (String usuario: usuarios){
            System.out.println(usuario);
        }

    }
    public static ArrayList segundaOp(Scanner sc, ArrayList<String> usuarios){
        System.out.println("Pon el nombre del nuevo usuario:");
        sc.nextLine();
        String nom = sc.nextLine();
        usuarios.add(nom);
        return usuarios;

    }
}
