import javax.persistence.Column;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue("A")
public class Aerea extends FuerzaMilitar {

  @Column(name = "cantidad_recurso")
  private int cantidadDragones;

  @Override
  public void atacarA(Lugar lugar) {
  }

}
