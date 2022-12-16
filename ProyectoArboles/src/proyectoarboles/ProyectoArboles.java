package proyectoarboles;

import Clases.ArbolBinario;
import javax.swing.JOptionPane;

public class ProyectoArboles {

    public static void main(String[] args) {
       
    int opcion = 0;
        String nombre;
        String genero = "";
        ArbolBinario arbolCreado = new ArbolBinario();
        arbolCreado.insertar("Carlos", "M");
        arbolCreado.insertar("Maria", "F");
        arbolCreado.insertar("Ana", "F");
        arbolCreado.insertar("Jorge", "M");
        arbolCreado.insertar("Luis", "M");
        arbolCreado.insertar("Alicia", "F");
        arbolCreado.insertar("Andres", "M");
      
        
        do {
            try {
                opcion = Integer.parseInt(JOptionPane.showInputDialog(null,
                          "1. Agregar nodo\n"
                        + "2. Recorrer el árbol INORDEN\n"
                        + "3. Recorrer el árbol POSTORDEN\n"
                        + "4. Recorrer el árbol PREORDEN\n"
                        + "5. Mostrar progenitores femeninos\n"
                        + "6. Salir del menú\n\n","-- MENÚ DE OPCIONES",                        
                        JOptionPane.QUESTION_MESSAGE));
                        
                switch (opcion) {
                    case 1:
                        opcion = Integer.parseInt(JOptionPane.showInputDialog(null,
                                  "1. Mujer\n"
                                + "2. Hombre\n\n","-- MENÚ DE OPCIONES",                        
                        JOptionPane.QUESTION_MESSAGE));
                        if (opcion == 1) {
                            genero = "F";
                        }
                        if (opcion == 2) {
                            genero = "M";
                        }
                        nombre = JOptionPane.showInputDialog(null, "Ingresa el nombre del nodo: ");
                        arbolCreado.insertar(nombre, genero);
                        break;
                    case 2:
                        System.out.println("Recorriendo INORDEN: ");
                        arbolCreado.inorden();
                        System.out.println(" ");
                        break;

                    case 3:
                        System.out.println("Recorriendo POSTORDEN: ");
                        arbolCreado.postorden();
                        System.out.println(" ");
                        break;

                    case 4:
                        System.out.println("Recorriendo PREORDEN: ");
                        arbolCreado.preorden();
                        System.out.println(" ");
                        break;

                    case 5:
                        System.out.println("Progenitores Mujeres: ");
                        arbolCreado.BuscarMujeres();
                        System.out.println(" ");
                        break;

                    case 6:
                        JOptionPane.showMessageDialog(null, "¡GRACIAS POR UTILIZAR NUESTRO SISTEMA! ");
                        break;
                    default:
                        JOptionPane.showMessageDialog(null, "¡OPCIÓN INVÁLIDA!");
                        break;

                }
            } catch (NumberFormatException n) {
                if ("null".equals(n.getMessage())) {
                    break;
                } else {
                    JOptionPane.showMessageDialog(null, "Error" + n.getMessage());
                }
            }
        } while (opcion != 6);
    }

}

    

