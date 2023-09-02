import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import java.util.Collection;

@Entity
public class Casa {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long id;
  private String nombre;
  private int patrimonio;
  private int anioFundacion;
  @ManyToOne
  private Casa vasallaDe;
  @OneToMany
  @JoinColumn(name = "casa_id")
  private Collection<FuerzaMilitar> fuerzasMilitares;
  @ManyToOne
  private Lugar origen;

  public String nombreLugarOrigen() {
    return origen.getNombre();
  }

}
