public class Producto {

    private String nombre;
    private double precio;
    private String categoria;
    private boolean disponible;

    //--- METODOS SETTERS (Paso 3) ----//

    public void setNombre(String nombre){
        if (nombre != null && !nombre.trim().isEmpty()) {
            this.nombre = nombre;
            System.out.println("Error: El nombre no puede ser nulo ni estar vacío");
        }
    }

    public void setPrecio(double precio) {
        if (precio > 0) {
            this.precio = precio;
            System.out.println("Error: El precio no debe ser mayor a 0. No se actualizo el valor");
        }
    }

    public void setCategoria(String categoria) {
        if (categoria != null && ! categoria.trim().isEmpty()) {
            this.categoria = categoria;
            System.out.println("Error: La categoria no puede ser nula ni estar vacia");
        }
    }

    public void setDisponible(boolean disponible) {
        this.disponible = disponible;
    }
    //Metodos get
    public String getNombre (){
        return nombre;
    }
    public double getPrecio (){
        return precio;
    }
    public String getCategoria (){
        return categoria;
    }
    public boolean isDisponible(){
        return disponible;
    }

    public void mostrarInformacion() {
        System.out.println("Nombre: " + nombre);
        System.out.println("Precio: $" + precio);
        System.out.println("Categoria: " + categoria);
        System.out.println("Disponible: " + disponible);
    }
}