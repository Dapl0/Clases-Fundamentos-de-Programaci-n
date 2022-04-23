import java.util.ArrayList;
public class Zombie {
    
    private String Nombre;
    public int salud;
    private String FechadeNacimiento;
    private String TipodeSangre;
    ArrayList <Zombie> BasedeDatosZombies = new ArrayList();
    public int contadorZombies;

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public int getSalud() {
        return salud;
    }

    public void setSalud(int salud) {
        this.salud = salud;
    }

    public String getFechadeNacimiento() {
        return FechadeNacimiento;
    }

    public void setFechadeNacimiento(String FechadeNacimiento) {
        this.FechadeNacimiento = FechadeNacimiento;
    }

    public String getTipodeSangre() {
        return TipodeSangre;
    }

    public void setTipodeSangre(String TipodeSangre) {
        this.TipodeSangre = TipodeSangre;
    }

    public ArrayList<Zombie> getBasedeDatosZombies() {
        return BasedeDatosZombies;
    }

    public void setBasedeDatosZombies(Zombie BasedeDatosZombies) {
        this.BasedeDatosZombies.add(BasedeDatosZombies);
        contadorZombies++;
    }

    @Override
    public String toString() {
        return "Zombie{" + "Nombre = " + Nombre + ", salud = " + salud + ", FechadeNacimiento = " + FechadeNacimiento + ", TipodeSangre = " + TipodeSangre + '}';
    }
    
}