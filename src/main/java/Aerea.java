import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue("A")
public class Aerea extends FuerzaMilitar {

  private int cantidadDragones;

  @Override
  public void atacarA(Lugar lugar) {
  }

}
