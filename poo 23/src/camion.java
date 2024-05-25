public class camion extends vehiculocarga{
    private int numEjes;
    public camion(String marca, String modelo, int año, int kilometraje, int numEjes) {
        super(marca, modelo, año, kilometraje, 0);
        this.numEjes = numEjes;
    }
    public int getnumEjes() {
        return numEjes;
    }
    public void setnumEjes(int numEjes) {
        this.numEjes = numEjes;
    }
    @Override
    public void mostrarinfo() {
        super.mostrarinfo();
        System.out.println("numero de ejes: " + numEjes);
    }
    public void realizarmantenimiento() {
        System.out.println("realizando mantenimiento del camion: cambio de filtros, revision del sistema de frenos y suspensión");
    }

}
