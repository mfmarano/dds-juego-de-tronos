import static java.util.stream.Collectors.toSet;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import java.util.Collection;
import java.util.Set;

@Entity
public class Region {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  Long id;
  private String nombre;
  @ManyToOne
  private Casa casaPrincipal;
  @ManyToMany
  private Collection<Lugar> lugares;

  public Region(String nombre, Casa casaPrincipal, Collection<Lugar> lugares) {
    this.nombre = nombre;
    this.casaPrincipal = casaPrincipal;
    this.lugares = lugares;
  }

  public Region() {

  }

  public Set<Lugar> castillos() {
    return lugares.stream().filter(Castillo.class::isInstance).collect(toSet());
  }

  public Set<Lugar> ciudades() {
    return lugares.stream().filter(Ciudad.class::isInstance).collect(toSet());
  }

  public int poblacionTotal() {
    return lugares.stream().mapToInt(Lugar::getPoblacion).sum();
  }

}
