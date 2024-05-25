
public class vehiculospasajeros extends vehiculo{
    private int numPasajeros;

    public vehiculospasajeros(String marca, String modelo, int año, int kilometraje, int numPasajeros) {
        super(marca, modelo, año, kilometraje);
        this.numPasajeros = numPasajeros;
    }

    public int getnumPasajeros() {
        return numPasajeros;
    }

    public void setnumPasajeros(int numPasajeros) {
        this.numPasajeros = numPasajeros;
    }
    @Override
    public void mostrarinfo(){
        super.mostrarinfo();
        System.out.println("numero de pasajeros: " + numPasajeros);
    }




}
