package ESIIIHibernateDDL1.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotNull;

@Entity
@Table(name = "entregador")
public class Entregador extends Funcionario {
  @Column(name = "numero", length = 10)
  @NotNull
  private String numero;

  @Column(name = "cnh", length = 10)
  @NotNull
  private String cnh;

  public String getNumero() {
    return this.numero;
  }

  public void setNumero(String numero) {
    this.numero = numero;
  }

  public String getCnh() {
    return this.cnh;
  }

  public void setCnh(String cnh) {
    this.cnh = cnh;
  }

  @Override
  public String toString() {
    return "{" +
        " numero='" + getNumero() + "'" +
        ", cnh='" + getCnh() + "'" +
        "}";
  }

}
