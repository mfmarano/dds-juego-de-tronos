import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.util.Collection;

@Entity
public class Casa {
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long id;
  private String nombre;
  private int patrimonio;
  private int anioFundacion;
  private Casa vasallaDe;
  private Collection<FuerzaMilitar> fuerzasMilitares;
  private Lugar origen;

  public String nombreLugarOrigen() {
    return origen.getNombre();
  }

  public void setId(Long id) {
    this.id = id;
  }

  public Long getId() {
    return id;
  }
}
