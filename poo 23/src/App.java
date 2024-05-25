
public class App {
    public static void main(String[] args) throws Exception {

        auto auto = new auto("Toyota", "corolla", 2020, 15000, "Gasolina");
        camion camion = new camion("volvo", "FH", 2019, 10000, 4);
        auto.realizarmantenimiento();
        camion.realizarmantenimiento();
        System.out.println("informacion del auto: ");
    
        auto.mostrarinfo();

        System.out.println("informacion del camion: ");
        camion.mostrarinfo();

        double costomantenimiento = 
        auto.costototal (0.5,1000);

        System.out.printf("costo de mantenimiento del auto es: %.2f", costomantenimiento);
        
    }
}
