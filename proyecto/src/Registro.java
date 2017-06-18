
import javax.swing.JOptionPane;

public class Registro {

    public static void main(String[] args) {
        int opcion = 0, elemento;
        String nombre;
        String precio;
        String fecha;
        String bodega;
        String clave;
        String total;
        ArbolBinario arbolito = new ArbolBinario();
        do {
            try {
                opcion = Integer.parseInt(JOptionPane.showInputDialog(null,
                        "1.Agregar un Producto\n"
                        + "2.Mostrar el inventario\n"
                        + "3.Buscar un codigo en el inventario\n"
                        + "4.Mostrar inventario por producto en el inventario\n"
                        + "5.Eliminar un codigo del inventario\n"
                        + "6.Cambiar precio de un producto\n"
                        + "7.Salir\n"
                        + "Elige una opcion...", "Inventario menu", JOptionPane.QUESTION_MESSAGE));
                switch (opcion) {
                    case 1:
                        clave = JOptionPane.showInputDialog(null,
                                "Ingresa el codigo del producto ", "Agregando producto", JOptionPane.QUESTION_MESSAGE);
                        if (clave != null) {
                            while (!arbolito.valida(clave)) {
                                JOptionPane.showMessageDialog(null, "Por favor ingresa el codigo de producto", "warning", JOptionPane.INFORMATION_MESSAGE);
                                clave = JOptionPane.showInputDialog(null,
                                        "Ingresa el codigo del producto", "Agregando producto", JOptionPane.QUESTION_MESSAGE);
                                while (clave == null) {
                                    JOptionPane.showMessageDialog(null, "Por favor ingresa el codigo de producto", "warning", JOptionPane.INFORMATION_MESSAGE);
                                    clave = JOptionPane.showInputDialog(null,
                                            "Ingresa el codigo del producto", "Agregando producto", JOptionPane.QUESTION_MESSAGE);
                                }
                            }
                            elemento = arbolito.conversion(clave);
                            if (!arbolito.estaVacio()) {
                                while (arbolito.buscarNodo(elemento) != null) {
                                    JOptionPane.showMessageDialog(null, "El codigo ya se encuentra en el inventario", "warning", JOptionPane.INFORMATION_MESSAGE);
                                    clave = JOptionPane.showInputDialog(null,
                                            "Ingresa el codigo del producto", "Agregando producto", JOptionPane.QUESTION_MESSAGE);
                                    while (clave == null) {
                                        JOptionPane.showMessageDialog(null, "Por favor ingresa el codigo de producto", "warning", JOptionPane.INFORMATION_MESSAGE);
                                        clave = JOptionPane.showInputDialog(null,
                                                "Ingresa el codigo del producto", "Agregando producto", JOptionPane.QUESTION_MESSAGE);
                                    }
                                    while (!arbolito.valida(clave)) {
                                        JOptionPane.showMessageDialog(null, "Por favor ingresa el codigo de producto", "warning", JOptionPane.INFORMATION_MESSAGE);
                                        clave = JOptionPane.showInputDialog(null,
                                                "Ingresa el codigo del producto", "Agregando producto", JOptionPane.QUESTION_MESSAGE);
                                        while (clave == null) {
                                            JOptionPane.showMessageDialog(null, "Por favor ingresa el codigo de producto", "warning", JOptionPane.INFORMATION_MESSAGE);
                                            clave = JOptionPane.showInputDialog(null,
                                                    "Ingresa el codigo del producto", "Agregando producto", JOptionPane.QUESTION_MESSAGE);
                                        }
                                    }
                                    elemento = arbolito.conversion(clave);

                                }
                            }

                            nombre = JOptionPane.showInputDialog(null, "Ingresa el nombre del producto",
                                    "Agregando producto", JOptionPane.QUESTION_MESSAGE);
                            if (nombre != null) {
                                while (!arbolito.valida(nombre)) {
                                    JOptionPane.showMessageDialog(null, "Por favor ingresa el nombre del producto", "warning", JOptionPane.INFORMATION_MESSAGE);
                                    nombre = JOptionPane.showInputDialog(null,
                                            "Ingresa el nombre del producto", "Agregando producto", JOptionPane.QUESTION_MESSAGE);
                                    if (nombre == null) {
                                        break;
                                    }
                                }
                            }
                            while (nombre == null) {
                                JOptionPane.showMessageDialog(null, "Por favor ingresa el nombre del producto", "warning", JOptionPane.INFORMATION_MESSAGE);
                                nombre = JOptionPane.showInputDialog(null, "Ingresa el nombre del producto",
                                        "Agregando producto", JOptionPane.QUESTION_MESSAGE);
                                if (nombre != null) {
                                    while (!arbolito.valida(nombre)) {
                                        JOptionPane.showMessageDialog(null, "Por favor ingresa el nombre del producto", "warning", JOptionPane.INFORMATION_MESSAGE);
                                        nombre = JOptionPane.showInputDialog(null,
                                                "Ingresa el nombre del producto", "Agregando producto", JOptionPane.QUESTION_MESSAGE);
                                        if (nombre == null) {
                                            break;
                                        }
                                    }
                                }
                            }
                            while (true) {
                                precio = JOptionPane.showInputDialog(null, "Ingresa el precio del producto",
                                        "Agregando producto", JOptionPane.QUESTION_MESSAGE);
                                if (precio != null) {
                                    while (!arbolito.valida(precio)) {
                                        JOptionPane.showMessageDialog(null, "Por favor ingresa el precio del producto", "warning", JOptionPane.INFORMATION_MESSAGE);
                                        precio = JOptionPane.showInputDialog(null,
                                                "Ingresa el precio del producto", "Agregando producto", JOptionPane.QUESTION_MESSAGE);
                                        if (precio == null) {
                                            break;
                                        }
                                    }
                                }
                                while (precio == null) {
                                    if (precio != null) {
                                        while (!arbolito.valida(precio)) {
                                            JOptionPane.showMessageDialog(null, "Por favor ingresa el precio del producto", "warning", JOptionPane.INFORMATION_MESSAGE);
                                            precio = JOptionPane.showInputDialog(null,
                                                    "Ingresa el precio del producto", "Agregando producto", JOptionPane.QUESTION_MESSAGE);
                                            if (precio == null) {
                                                break;
                                            }
                                        }
                                    }
                                    JOptionPane.showMessageDialog(null, "Por favor ingresa el precio del producto", "warning", JOptionPane.INFORMATION_MESSAGE);
                                    precio = JOptionPane.showInputDialog(null,
                                            "Ingresa el precio del producto", "Agregando producto", JOptionPane.QUESTION_MESSAGE);
                                    if (precio != null) {
                                        while (!arbolito.valida(precio)) {

                                            JOptionPane.showMessageDialog(null, "Por favor ingresa el precio del producto", "warning", JOptionPane.INFORMATION_MESSAGE);
                                            precio = JOptionPane.showInputDialog(null,
                                                    "Ingresa el precio del producto", "Agregando producto", JOptionPane.QUESTION_MESSAGE);
                                            if (precio == null) {
                                                break;
                                            }
                                        }
                                    }
                                }
                                if (arbolito.validacionprecio(precio)) {
                                    break;
                                }
                                JOptionPane.showMessageDialog(null, "Solo se aceptan numeros y cantidades positivas", "warning", JOptionPane.INFORMATION_MESSAGE);
                            }
                            while (true) {
                                total = JOptionPane.showInputDialog(null, "Ingresa el numero de productos ",
                                        "Agregando producto", JOptionPane.QUESTION_MESSAGE);
                                if (total != null) {
                                    while (!arbolito.valida(total)) {
                                        JOptionPane.showMessageDialog(null, "Por favor ingresa el numero de productos", "warning", JOptionPane.INFORMATION_MESSAGE);
                                        total = JOptionPane.showInputDialog(null,
                                                "Ingresa el numero de productos", "Agregando producto", JOptionPane.QUESTION_MESSAGE);
                                        if (total == null) {
                                            break;
                                        }
                                    }
                                }
                                while (total == null) {
                                    if (total != null) {
                                        while (!arbolito.valida(total)) {
                                            JOptionPane.showMessageDialog(null, "Por favor ingresa el numero de productos", "warning", JOptionPane.INFORMATION_MESSAGE);
                                            total = JOptionPane.showInputDialog(null,
                                                    "Ingresa el precio del producto", "Agregando producto", JOptionPane.QUESTION_MESSAGE);
                                            if (total == null) {
                                                break;
                                            }
                                        }
                                    }
                                    JOptionPane.showMessageDialog(null, "Por favor ingresa el numero de productos", "warning", JOptionPane.INFORMATION_MESSAGE);
                                    total = JOptionPane.showInputDialog(null,
                                            "Ingresa el numero de productos", "Agregando producto", JOptionPane.QUESTION_MESSAGE);
                                    if (total != null) {
                                        while (!arbolito.valida(total)) {
                                            JOptionPane.showMessageDialog(null, "Por favor ingresa el numero de productos", "warning", JOptionPane.INFORMATION_MESSAGE);
                                            total = JOptionPane.showInputDialog(null,
                                                    "Ingresa el numero de productos", "Agregando producto", JOptionPane.QUESTION_MESSAGE);
                                            if (total == null) {
                                                break;
                                            }
                                        }
                                    }

                                }
                                if (arbolito.validacionprecio(total)) {
                                    break;
                                }
                                JOptionPane.showMessageDialog(null, "Solo se aceptan numeros y cantidades positivas", "warning", JOptionPane.INFORMATION_MESSAGE);
                            }
                            fecha = JOptionPane.showInputDialog(null, "Ingresa la fecha de caducidad",
                                    "Agregando producto", JOptionPane.QUESTION_MESSAGE);
                            if (fecha != null) {
                                while (!arbolito.FechaValida(fecha)) {
                                    JOptionPane.showMessageDialog(null, "No es el formato aceptado intente dd/MM/yyyy", "warning", JOptionPane.INFORMATION_MESSAGE);
                                    fecha = JOptionPane.showInputDialog(null, "Ingresa la fecha de caducidad",
                                            "Agregando producto", JOptionPane.QUESTION_MESSAGE);
                                    while (fecha == null) {
                                        JOptionPane.showMessageDialog(null, "Por favor ingrese la fecha de caducidad", "warning", JOptionPane.INFORMATION_MESSAGE);
                                        fecha = JOptionPane.showInputDialog(null, "Ingresa la fecha de caducidad",
                                                "Agregando producto", JOptionPane.QUESTION_MESSAGE);
                                    }
                                }
                            } else {
                                JOptionPane.showMessageDialog(null, "Por favor ingrese la fecha de caducidad", "warning", JOptionPane.INFORMATION_MESSAGE);
                                fecha = JOptionPane.showInputDialog(null, "Ingresa la fecha de caducidad",
                                        "Agregando producto", JOptionPane.QUESTION_MESSAGE);
                                while (fecha == null) {
                                    JOptionPane.showMessageDialog(null, "Por favor ingrese la fecha de caducidad", "warning", JOptionPane.INFORMATION_MESSAGE);
                                    fecha = JOptionPane.showInputDialog(null, "Ingresa la fecha de caducidad",
                                            "Agregando producto", JOptionPane.QUESTION_MESSAGE);
                                }
                                while (!arbolito.FechaValida(fecha)) {
                                    JOptionPane.showMessageDialog(null, "No es el formato aceptado intente dd/MM/yyyy", "warning", JOptionPane.INFORMATION_MESSAGE);
                                    fecha = JOptionPane.showInputDialog(null, "Ingresa la fecha de caducidad",
                                            "Agregando producto", JOptionPane.QUESTION_MESSAGE);
                                    while (fecha == null) {
                                        JOptionPane.showMessageDialog(null, "Por favor ingresa la fecha de caducidad", "warning", JOptionPane.INFORMATION_MESSAGE);
                                        fecha = JOptionPane.showInputDialog(null, "Ingresa la fecha de caducidad",
                                                "Agregando producto", JOptionPane.QUESTION_MESSAGE);
                                    }
                                }
                            }
                            bodega = JOptionPane.showInputDialog(null, "Ingresa la bodega",
                                    "Agregando producto", JOptionPane.QUESTION_MESSAGE);
                            if (bodega != null) {
                                while (!arbolito.valida(bodega)) {
                                    JOptionPane.showMessageDialog(null, "Por favor ingresa la bodega ", "warning", JOptionPane.INFORMATION_MESSAGE);
                                    bodega = JOptionPane.showInputDialog(null,
                                            "Ingresa la bodega", "Agregando producto", JOptionPane.QUESTION_MESSAGE);
                                    if (bodega == null) {
                                        break;
                                    }
                                }
                            }
                            while (bodega == null) {
                                JOptionPane.showMessageDialog(null, "Por favor ingresa la bodega ", "warning", JOptionPane.INFORMATION_MESSAGE);
                                bodega = JOptionPane.showInputDialog(null, "Ingresa la bodega",
                                        "Agregando producto", JOptionPane.QUESTION_MESSAGE);
                                if (bodega != null) {
                                    while (!arbolito.valida(bodega)) {
                                        JOptionPane.showMessageDialog(null, "Por favor ingresa la bodega", "warning", JOptionPane.INFORMATION_MESSAGE);
                                        bodega = JOptionPane.showInputDialog(null,
                                                "Ingresa la bodega", "Agregando producto", JOptionPane.QUESTION_MESSAGE);
                                        if (bodega == null) {
                                            break;
                                        }
                                    }
                                }
                            }
                            arbolito.AgregarNodo(elemento, clave, nombre, precio, fecha, bodega);
                            int contador = Integer.parseInt(total);
                            for (int i = 1; i < contador; i++) {
                                arbolito.AgregarNodo(elemento + i, clave + Integer.toString(i), nombre, precio, fecha, bodega);
                            }
                        }
                        break;
                    case 2:
                        if (!arbolito.estaVacio()) {
                            arbolito.inOrden(arbolito.raiz);
                        } else {
                            JOptionPane.showMessageDialog(null, "El inventario esta vacio", "warning", JOptionPane.INFORMATION_MESSAGE);
                        }
                        break;
                    case 3:
                        if (!arbolito.estaVacio()) {
                            clave = JOptionPane.showInputDialog(null,
                                    "Ingresa el codigo del producto buscado", "Buscando", JOptionPane.QUESTION_MESSAGE);
                            if (clave != null) {
                                elemento = arbolito.conversion(clave);

                                if (arbolito.buscarNodo(elemento) == null) {
                                    JOptionPane.showMessageDialog(null, "El producto no esta en existencia uvu", "warning", JOptionPane.INFORMATION_MESSAGE);
                                } else {
                                    System.out.println("Producto encontrado: " + arbolito.buscarNodo(elemento));
                                }
                            }
                        } else {
                            JOptionPane.showMessageDialog(null, "El inventario esta en ceros", "warning", JOptionPane.INFORMATION_MESSAGE);
                        }
                        break;
                    case 4:
                        nombre = JOptionPane.showInputDialog(null, "Ingresa el nombre del producto",
                                "Agregando producto", JOptionPane.QUESTION_MESSAGE);
                        if (nombre != null) {
                            while (!arbolito.valida(nombre)) {
                                JOptionPane.showMessageDialog(null, "Por favor ingresa el nombre del producto", "warning", JOptionPane.INFORMATION_MESSAGE);
                                nombre = JOptionPane.showInputDialog(null,
                                        "Ingresa el nombre del producto", "Agregando producto", JOptionPane.QUESTION_MESSAGE);
                                if (nombre == null) {
                                    break;
                                }
                            }
                        }
                        while (nombre == null) {
                            JOptionPane.showMessageDialog(null, "Por favor ingresa el nombre del producto", "warning", JOptionPane.INFORMATION_MESSAGE);
                            nombre = JOptionPane.showInputDialog(null, "Ingresa el nombre del producto",
                                    "Agregando producto", JOptionPane.QUESTION_MESSAGE);
                            if (nombre != null) {
                                while (!arbolito.valida(nombre)) {
                                    JOptionPane.showMessageDialog(null, "Por favor ingresa el nombre del producto", "warning", JOptionPane.INFORMATION_MESSAGE);
                                    nombre = JOptionPane.showInputDialog(null,
                                            "Ingresa el nombre del producto", "Agregando producto", JOptionPane.QUESTION_MESSAGE);
                                    if (nombre == null) {
                                        break;
                                    }
                                }
                            }
                        }
                        if (!arbolito.estaVacio()) {
                            arbolito.muestraproducto(nombre, arbolito.raiz);
                        } else {
                            JOptionPane.showMessageDialog(null, "El inventario esta vacio", "warning", JOptionPane.INFORMATION_MESSAGE);
                        }
                        break;
                    case 5:
                        if (!arbolito.estaVacio()) {
                            clave = JOptionPane.showInputDialog(null,
                                    "Ingresa el codigo del producto a eliminar", "Eliminando productos", JOptionPane.QUESTION_MESSAGE);
                            if (clave != null) {
                                elemento = arbolito.conversion(clave);

                                if (arbolito.eliminar(elemento) == false) {
                                    JOptionPane.showMessageDialog(null, "El producto no esta en existencia uvu", "warning", JOptionPane.INFORMATION_MESSAGE);
                                } else {
                                    JOptionPane.showMessageDialog(null, "El producto ha sido eliminado", "Delete"
                                            + "", JOptionPane.INFORMATION_MESSAGE);
                                }
                            }
                        } else {
                            JOptionPane.showMessageDialog(null, "El inventario esta en ceros", "warning", JOptionPane.INFORMATION_MESSAGE);
                        }
                        break;
                        
                    case 6:
                        nombre = JOptionPane.showInputDialog(null, "Ingresa el nombre del producto",
                                "Agregando producto", JOptionPane.QUESTION_MESSAGE);
                        if (nombre != null) {
                            while (!arbolito.valida(nombre)) {
                                JOptionPane.showMessageDialog(null, "Por favor ingresa el nombre del producto", "warning", JOptionPane.INFORMATION_MESSAGE);
                                nombre = JOptionPane.showInputDialog(null,
                                        "Ingresa el nombre del producto", "Agregando producto", JOptionPane.QUESTION_MESSAGE);
                                if (nombre == null) {
                                    break;
                                }
                            }
                        }
                        while (nombre == null) {
                            JOptionPane.showMessageDialog(null, "Por favor ingresa el nombre del producto", "warning", JOptionPane.INFORMATION_MESSAGE);
                            nombre = JOptionPane.showInputDialog(null, "Ingresa el nombre del producto",
                                    "Agregando producto", JOptionPane.QUESTION_MESSAGE);
                            if (nombre != null) {
                                while (!arbolito.valida(nombre)) {
                                    JOptionPane.showMessageDialog(null, "Por favor ingresa el nombre del producto", "warning", JOptionPane.INFORMATION_MESSAGE);
                                    nombre = JOptionPane.showInputDialog(null,
                                            "Ingresa el nombre del producto", "Agregando producto", JOptionPane.QUESTION_MESSAGE);
                                    if (nombre == null) {
                                        break;
                                    }
                                }
                            }
                        }
                        while (true) {
                            precio = JOptionPane.showInputDialog(null, "Ingresa el precio del producto",
                                    "Agregando producto", JOptionPane.QUESTION_MESSAGE);
                            if (precio != null) {
                                while (!arbolito.valida(precio)) {

                                    JOptionPane.showMessageDialog(null, "Por favor ingresa el precio del producto", "warning", JOptionPane.INFORMATION_MESSAGE);
                                    precio = JOptionPane.showInputDialog(null,
                                            "Ingresa el precio del producto", "Agregando producto", JOptionPane.QUESTION_MESSAGE);
                                    if (precio == null) {
                                        break;
                                    }
                                }
                            }
                            while (precio == null) {
                                if (precio != null) {
                                    while (!arbolito.valida(precio)) {
                                        JOptionPane.showMessageDialog(null, "Por favor ingresa el precio del producto", "warning", JOptionPane.INFORMATION_MESSAGE);
                                        precio = JOptionPane.showInputDialog(null,
                                                "Ingresa el precio del producto", "Agregando producto", JOptionPane.QUESTION_MESSAGE);
                                        if (precio == null) {
                                            break;
                                        }
                                    }
                                }
                                JOptionPane.showMessageDialog(null, "Por favor ingresa el precio del producto", "warning", JOptionPane.INFORMATION_MESSAGE);
                                precio = JOptionPane.showInputDialog(null,
                                        "Ingresa el precio del producto", "Agregando producto", JOptionPane.QUESTION_MESSAGE);
                                if (precio != null) {
                                    while (!arbolito.valida(precio)) {
                                        JOptionPane.showMessageDialog(null, "Por favor ingresa el precio del producto", "warning", JOptionPane.INFORMATION_MESSAGE);
                                        precio = JOptionPane.showInputDialog(null,
                                                "Ingresa el precio del producto", "Agregando producto", JOptionPane.QUESTION_MESSAGE);
                                        if (precio == null) {
                                            break;
                                        }
                                    }
                                }

                            }
                            if (arbolito.validacionprecio(precio)) {
                                break;
                            }
                            JOptionPane.showMessageDialog(null, "Solo se aceptan numeros y cantidades positivas", "warning", JOptionPane.INFORMATION_MESSAGE);
                        }
                        if (!arbolito.estaVacio()) {
                            arbolito.editaprecio(nombre, precio, arbolito.raiz);
                        } else {
                            JOptionPane.showMessageDialog(null, "El inventario esta vacio", "warning", JOptionPane.INFORMATION_MESSAGE);
                        }
                        break;
                        
                    case 7:
                        JOptionPane.showMessageDialog(null, "Aplicacion Finalizada", "Fin", JOptionPane.INFORMATION_MESSAGE);
                        break;
                    default:
                        JOptionPane.showMessageDialog(null, "Opcion Incorrecta",
                                "Warning", JOptionPane.INFORMATION_MESSAGE);
                }
            } catch (NumberFormatException n) {
                JOptionPane.showMessageDialog(null, "Error " + n.getMessage());
            }catch(OutOfMemoryError n){
                 JOptionPane.showMessageDialog(null, "Ha ocurrido un error en la memoria", "warning", JOptionPane.INFORMATION_MESSAGE);
            }catch(ArrayIndexOutOfBoundsException excepcion){
            JOptionPane.showMessageDialog(null, "Ha ocurrido un error en en el puntero", "warning", JOptionPane.INFORMATION_MESSAGE);
        }catch(NullPointerException n){
            JOptionPane.showMessageDialog(null, "Ha ocurrido un error en el puntero", "warning", JOptionPane.INFORMATION_MESSAGE);
        }catch(Exception m){
            JOptionPane.showMessageDialog(null, "Ha ocurrido un error en el puntero", "warning", JOptionPane.INFORMATION_MESSAGE);
        }
        } while (opcion != 7);
    }

}
