import javax.persistence.Entity;

@Entity
public class Ciudad extends Lugar {

  private int cantidadDeComercios;
  private int cantidadDeSantuarios;
  private double tasaDeMortalidad;

}
