import javax.persistence.Column;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue("N")
public class Naval extends FuerzaMilitar {

  @Column(name = "cantidad_recurso")
  private int cantidadBarcos;

  @Override
  public void atacarA(Lugar lugar) {
  }

}
