
package vehiculo;

/**
 *
 * @author 
 */
public class Main {
    
      public static void main(String[] args) {
        VehiculoSVM2324 miVehiculoXXX2223;
        int stockActual;
        
        miVehiculoXXX2223 = new VehiculoSVM2324("Seat",18000,100);
        operativaVehiculosSVM2324(miVehiculoXXX2223); 
        stockActual = miVehiculoXXX2223.obtenerStock();
        System.out.println("El stock actual es "+ stockActual );
    }

    public static void operativaVehiculosSVM2324(VehiculoSVM2324 miVehiculoXXX2223) {
        try
        {
            System.out.println("Venta de Vehiculos");
            miVehiculoXXX2223.vender(20);
        } catch (Exception e)
        {
            System.out.print("Fallo al vender");
        }
        
        try
        {
            System.out.println("Compra de Vehiculos");
            miVehiculoXXX2223.comprar(100);
        } catch (Exception e)
        {
            System.out.print("Fallo al comprar");
        }
    }

}
    
