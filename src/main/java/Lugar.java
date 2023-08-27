import javax.persistence.Entity;

@Entity
public class Lugar {
  private String nombre;
  private int anioFundacion;
  private int poblacion;

  public String getNombre() {
    return nombre;
  }

}
