import javax.persistence.Column;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue("T")
public class Terrestre extends FuerzaMilitar {

  @Column(name = "cantidad_recurso")
  private int cantidadSoldados;

  @Override
  public void atacarA(Lugar lugar) {
  }

}
