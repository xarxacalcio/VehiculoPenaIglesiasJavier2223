
package vehiculo;

/**
 * Clase que representa un vehículo.
 * Contiene propiedades como nombre, precio, precio con IVA y stock.
 * También tiene métodos para comprar y vender vehículos, y para obtener el nombre y el stock del vehículo.
 * 
 * @author IES Aguadulce
 */
public class VehiculoPenaIglesiasJavier2223 {

    private String nombre; // Nombre del vehículo
    private double precio; // Precio del vehículo sin IVA
    private double precioIVA; // Precio del vehículo con IVA
    private int stock; // Cantidad de vehículos disponibles en el stock

 /**
 * Constructor sin argumentos de la clase VehiculoPenaIglesiasJavier2223.
 */
    public VehiculoPenaIglesiasJavier2223 ()
    {
    }
    
    /**
     * Constructor con parámetros para iniciar todas las propiedades de la clase.
     * 
     * @param nom Nombre del vehículo
     * @param precio Precio del vehículo sin IVA
     * @param stock Cantidad de vehículos disponibles en el stock
     */
    public VehiculoPenaIglesiasJavier2223 (String nom, double precio, int stock)
    {
        this.nombre =nom;
        this.precio=precio;
        this.stock=stock;
    }
   
   /**
    * Método para asignar el nombre del vehículo.
    * 
    * @param nom Nombre del vehículo
    */
    public void asignarNombre(String nom)
    {
        setNombre(nom);
    }
    
    /**
     * Método que devuelve el nombre del vehículo.
     * 
     * @return Nombre del vehículo
     */
    public String obtenerNombre()
    {
        return getNombre();
    }

    /**
     * Método que devuelve el stock de vehículos disponible en cada momento.
     * 
     * @return Cantidad de vehículos disponibles en el stock
     */
     public int obtenerStock ()
    {
        return getStock();
    }

    /**
     * Método para comprar vehículos.
     * Modifica el stock.
     * Este método va a ser probado con Junit.
     * 
     * @param cantidad Cantidad de vehículos a comprar
     * @throws Exception Si la cantidad de vehículos a comprar es negativa
     */
    public void comprar(int cantidad) throws Exception
    {
        if (cantidad<0)
            throw new Exception("No se puede comprar un nº negativo de vehículos");
        setStock(getStock() + cantidad);
    }

    /**
     * Método para vender vehículos.
     * Modifica el stock.
     * 
     * @param cantidad Cantidad de vehículos a vender
     * @throws Exception Si la cantidad de vehículos a vender es negativa o si no hay suficientes vehículos para vender
     */
    public void vender (int cantidad) throws Exception
    {
        if (cantidad <= 0)
            throw new Exception ("No se puede vender una cantidad negativa de vehículos");
        if (obtenerStock()< cantidad)
            throw new Exception ("No se hay suficientes vehículos para vender");
        setStock(getStock() - cantidad);
    }

    /**
     * @return the nombre
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * @param nombre the nombre to set
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
/**
*Método para obtener el precio del vehículo.
*@return el precio del vehículo.
*/
public double getPrecio() {
return precio;
}
/**
*
*Método para establecer el precio del vehículo.
*@param precio el precio del vehículo.
*/
public void setPrecio(double precio) {
this.precio = precio;
}
/**
*
*Método para obtener el precio del vehículo con IVA incluido.
*@return el precio del vehículo con IVA incluido.
*/
public double getPrecioIVA() {
return precioIVA;
}
/**
*
*Método para establecer el precio del vehículo con IVA incluido.
*@param precioIVA el precio del vehículo con IVA incluido.
*/
public void setPrecioIVA(double precioIVA) {
this.precioIVA = precioIVA;
}
/**
*
*Método para obtener el stock de vehículos disponible.
*@return el stock de vehículos disponible.
*/
public int getStock() {
return stock;
}
/**
*
*Método para establecer el stock de vehículos disponible.
*@param stock el stock de vehículos disponible.
*/
public void setStock(int stock) {
this.stock = stock;
}
}
   
    

