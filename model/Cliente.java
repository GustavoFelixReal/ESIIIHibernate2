package ESIIIHibernateDDL2.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotNull;

@Entity
@Table(name = "cliente")
public class Cliente {
  @Id
  @Column(name = "id_cliente")
  @NotNull
  private int id;

  @Column(name = "cpf", length = 15)
  @NotNull
  private String cpf;

  @Column(name = "nome", length = 100)
  @NotNull
  private String nome;

  @Column(name = "celular", length = 15)
  @NotNull
  private String celular;

  @Column(name = "email", length = 100)
  @NotNull
  private String email;

  @Column(name = "pronome", length = 30)
  @NotNull
  private String pronome;

  public int getId() {
    return this.id;
  }

  public void setId(int id) {
    this.id = id;
  }

  public String getCpf() {
    return this.cpf;
  }

  public void setCpf(String cpf) {
    this.cpf = cpf;
  }

  public String getNome() {
    return this.nome;
  }

  public void setNome(String nome) {
    this.nome = nome;
  }

  public String getCelular() {
    return this.celular;
  }

  public void setCelular(String celular) {
    this.celular = celular;
  }

  public String getEmail() {
    return this.email;
  }

  public void setEmail(String email) {
    this.email = email;
  }

  public String getPronome() {
    return this.pronome;
  }

  public void setPronome(String pronome) {
    this.pronome = pronome;
  }

  @Override
  public String toString() {
    return "{" +
        " id='" + getId() + "'" +
        ", cpf='" + getCpf() + "'" +
        ", nome='" + getNome() + "'" +
        ", celular='" + getCelular() + "'" +
        ", email='" + getEmail() + "'" +
        ", pronome='" + getPronome() + "'" +
        "}";
  }

}
