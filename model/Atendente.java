package ESIIIHibernateDDL1.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotNull;

@Entity
@Table(name = "atendente")
public class Atendente extends Funcionario {
  @Column(name = "hora_entrada", length = 5)
  @NotNull
  private String hora_entrada;

  @Column(name = "hora_saida", length = 5)
  @NotNull
  private String hora_saida;

  @Column(name = "email", unique = true, length = 100)
  @NotNull
  private String email;

  public String getHora_entrada() {
    return this.hora_entrada;
  }

  public void setHora_entrada(String hora_entrada) {
    this.hora_entrada = hora_entrada;
  }

  public String getHora_saida() {
    return this.hora_saida;
  }

  public void setHora_saida(String hora_saida) {
    this.hora_saida = hora_saida;
  }

  public String getEmail() {
    return this.email;
  }

  public void setEmail(String email) {
    this.email = email;
  }

  @Override
  public String toString() {
    return "{" +
        " hora_entrada='" + getHora_entrada() + "'" +
        ", hora_saida='" + getHora_saida() + "'" +
        ", email='" + getEmail() + "'" +
        "}";
  }

}
