public class vehiculocarga extends vehiculo {
    private int capacidadcarga;

    public vehiculocarga(String marca, String modelo, int año, int kilometraje, int capacidadcarga) {
        super(marca, modelo, año, kilometraje);
        this.capacidadcarga = capacidadcarga;
    }

    public int getcapacidadcarga() {
        return capacidadcarga;
    }

    public void setcapacidadcarga(int capacidadcarga) {
        this.capacidadcarga = capacidadcarga;
    }
@Override
    public void mostrarinfo() {
        super.mostrarinfo();
        System.out.println("capacidad de carga: " + capacidadcarga);
    }

}
