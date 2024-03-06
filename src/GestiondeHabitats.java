public abstract class GestiondeHabitats {
    protected String nombre;
    protected int capacidad;
    public GestiondeHabitats(String nombre, int capacidad) {
        this.nombre = nombre;
        this.capacidad = capacidad;
    }
    public abstract void mostrarInformacion();
}
class Acuatico extends GestiondeHabitats {
    public Acuatico(String nombre, int capacidad) {
        super(nombre, capacidad);
    }
    @Override
    public void mostrarInformacion() {
        System.out.println("Habitat Acuático: " + nombre + ", Capacidad: " + capacidad);
    }
}