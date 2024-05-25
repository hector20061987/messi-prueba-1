public class auto extends vehiculospasajeros {
    private String tipocombustible;

    public auto(String marca, String modelo, int año, int kilometraje, String tipocombustible) {
        super(marca, modelo, año, kilometraje, 0); 
        this.tipocombustible = tipocombustible;
    }

    public String gettipocombustible() {
        return tipocombustible; 
    }

    public void settipocombustible(String tipocombustible) {
        this.tipocombustible = tipocombustible;
    }
@Override
    public void mostrarinfo() {
        super.mostrarinfo();
        System.out.println("tipocombustible: " + tipocombustible);
    }
    public void realizarmantenimiento() {
        System.out.println("realizando mantenimiento del auto: cambio de aceite,revision de neumaticos y sistema de frenos");
    }
public double costototal(double costoporkm, int kilometrosrecorridos)

    {double costototal = costoporkm * kilometrosrecorridos;
    return costototal;
    }


}
