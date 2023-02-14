
package vehiculo;

/**
 * La clase Main es la clase principal de la aplicación que permite realizar la operativa de venta y compra de vehículos.
 * @author IES Aguadulce
 */
public class Main {
    
/**
*El método main es el punto de entrada a la aplicación. En este caso, se llama al método operativaVehiculosPenaIglesiasJavier2223
*con un parámetro de cantidad de vehículos.
*@param args argumentos pasados por línea de comandos (no se utilizan en este caso)
*/
      public static void main(String[] args) {
        VehiculoPenaIglesiasJavier2223 miVehiculoPenaIglesiasJavier2223;
        int stockActual;
        
        operativaVehiculosPenaIglesiasJavier2223(50);
    }
/**
*El método operativaVehiculosPenaIglesiasJavier2223 se encarga de realizar las operaciones de compra y venta de vehículos,
*utilizando un objeto de la clase VehiculoPenaIglesiasJavier2223. Se capturan las excepciones que puedan ocurrir durante
*la operativa y se muestra el stock actual de vehículos.
*@param cantidad la cantidad de vehículos a comprar
*/
    private static void operativaVehiculosPenaIglesiasJavier2223(int cantidad) {
        VehiculoPenaIglesiasJavier2223 miVehiculoPenaIglesiasJavier2223;
        int stockActual;
        // Se crea un objeto VehiculoPenaIglesiasJavier2223 con nombre "Seat", precio de 18000 y stock de 100
        miVehiculoPenaIglesiasJavier2223 = new VehiculoPenaIglesiasJavier2223("Seat",18000,100);
        try 
        {
        // Se intenta vender 20 vehículos   
            System.out.println("Venta de Vehiculos");
            miVehiculoPenaIglesiasJavier2223.vender(20);
        } catch (Exception e)
        {
            System.out.print("Fallo al vender");
        }
        try
        {
        // Se intenta comprar 100 vehículos    
            System.out.println("Compra de Vehiculos");
            miVehiculoPenaIglesiasJavier2223.comprar(100);
        } catch (Exception e)
        {
            System.out.print("Fallo al comprar");
        }
        // Se obtiene el stock actual y se muestra por pantalla
        stockActual = miVehiculoPenaIglesiasJavier2223.obtenerStock();
        System.out.println("El stock actual es"+ stockActual );
    }

}
    
