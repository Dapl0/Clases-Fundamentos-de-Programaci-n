import java.util.ArrayList;
public class Ubicacion{
    private String Nombre;
    private float Distancia;
    private int CantidadZombies;
    ArrayList <Ubicacion> BaseDeDatosUbicacion = new ArrayList();
    public int contadorUbicacion;
    
    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }
    
    public float getDistancia() {
        return Distancia;
    }

    public void setDistancia(float Distancia) {
        this.Distancia = Distancia;
    }

    public int getCantidadZombies() {
        return CantidadZombies;
    }
    
    public void setCantidadZombies(int CantidadZombies) {
        this.CantidadZombies = CantidadZombies;
    }
    
     public ArrayList<Ubicacion> getBasedeDatosUbicacion() {
        return BaseDeDatosUbicacion;
    }
    
    public void setBasedeDatosUbicacion(Ubicacion BasedeDatosUbicacion) {
        this.BaseDeDatosUbicacion.add(BasedeDatosUbicacion);
        contadorUbicacion++;
    }
    
    @Override
    public String toString() {
        return "Ubicacion{" + "Nombre = " + Nombre + ", Distancia = " + Distancia + ", CantidadZombies = " + CantidadZombies + '}';
    }
}