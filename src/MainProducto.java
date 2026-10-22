public class MainProducto {

    public static void main(String[] args) {

        Producto producto1 = new Producto();
        Producto producto2 = new Producto();
        Producto producto3 = new Producto();

        producto1.setNombre("Audífonos Bluetooth");
        producto1.setPrecio(32.50);
        producto1.setCategoria("Tecnología");
        producto1.setDisponible(true);


 /*
            producto1.nombre = "Audífonos Bluetooth";
            producto1.precio = 32.50;
            producto1.categoria = "Tecnología";
            producto1.disponible = true;

            producto2.nombre = "Mouse inalámbrico";
            producto2.precio = 25.99;
            producto2.categoria = "Tecnología";
            producto2.disponible = true;

            producto3.nombre = "Mochila";
            producto3.precio = 45.00;
            producto3.categoria = "Accesorios";
            producto3.disponible = false;
            */


        System.out.println("PRODUCTO 1");
        producto1.mostrarInformacion();

        System.out.println();

        System.out.println("PRODUCTO 2");
        producto2.mostrarInformacion();

        System.out.println();

        System.out.println("PRODUCTO 3");
        producto3.mostrarInformacion();

        System.out.println();

        System.out.println("Cambiando disponibilidad del producto 1 ...");

        producto1.setNombre("");
        System.out.println("Nombre: "+producto1.getNombre());
    }
}