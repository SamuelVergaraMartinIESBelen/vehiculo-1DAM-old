
package vehiculo;

/**
 *
 * @author Samuel Vergara Martín
 * @version 1.0
 * @since 26-04-2024
 */
public class VehiculoSVM2324 {

    /**
     * atributo que indica el nombre del vehiculo
     */
    protected String nombre;
    /**
     * atributo que indica el precio del vehiculo
     */
    protected double precio;
    /**
     * atributo que indica el precio + iva del vehiculo
     */
    protected double precioIVA;
    /**
     * atributo que indica la cantidad del stock del vehiculo
     */
    protected int stock;

    /**
     * Constructor sin atributos de la clase
     */
    public VehiculoSVM2324 ()
    {
    }
    // Constructor con parámetro para iniciar todas las propiedades de la clase
    
    /**
     * Constructor con parámetros
     * @param nom nombre del vehiculo
     * @param precio precio de venta del vehiculo
     * @param stock Número de unidades en stock
     */
    public VehiculoSVM2324 (String nom, double precio, int stock)
    {
        this.nombre =nom;
        this.precio=precio;
        this.stock=stock;
    }
    
    /**
     * Método para asignar el nombre del vehiculo
     * @param nom 
     */
    public void asignarNombre(String nom)
    {
        setNombre(nom);
    }
   
    /**
     * Método que me devuelve el nombre del vehiculo
     * @return 
     */
    public String obtenerNombre()
    {
        return getNombre();
    }

     
    /**
     * Método que me devuelve el stock de vehiculos disponible en cada momento
     * @return 
     */
     public int obtenerStock ()
    {
        return getStock();
    }

    /** Método para comprar vehiculos. Modifica el stock.
     * Este método va a ser probado con Junit
     *
     * @param cantidad
     * @throws Exception 
     */
    public void comprar(int cantidad) throws Exception
    {
        if (cantidad<0)
            throw new Exception("No se puede comprar un nº negativo de vehiculos");
        setStock(getStock() + cantidad);
    }

    /**
     * Metodo para vender vehiculos. 
     * @param cantidad
     * @throws Exception 
     */
    public void vender (int cantidad) throws Exception
    {
        if (cantidad <= 0)
            throw new Exception ("No se puede vender una cantidad negativa de vehiculos");
        if (obtenerStock()< cantidad)
            throw new Exception ("No se hay suficientes vehiculos para vender");
        setStock(getStock() - cantidad);
    }

    /**
     * Método de selección del atributo nombre
     * @return the nombre
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Método de acceso del atributo nombre
     * @param nombre the nombre to set
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * @return the precio
     */
    public double getPrecio() {
        return precio;
    }

    /**
     * @param precio the precio to set
     */
    public void setPrecio(double precio) {
        this.precio = precio;
    }

    /**
     * @return the precioIVA
     */
    public double getPrecioIVA() {
        return precioIVA;
    }

    /**
     * @param precioIVA the precioIVA to set
     */
    public void setPrecioIVA(double precioIVA) {
        this.precioIVA = precioIVA;
    }

    /**
     * @return the stock
     */
    public int getStock() {
        return stock;
    }

    /**
     * @param stock the stock to set
     */
    public void setStock(int stock) {
        this.stock = stock;
    }
    
}  
   
    

