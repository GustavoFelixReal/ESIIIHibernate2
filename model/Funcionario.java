package ESIIIHibernateDDL1.model;

import java.time.LocalDate;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Inheritance;
import jakarta.persistence.InheritanceType;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotNull;

@Entity
@Table(name = "funcionario")
@Inheritance(strategy = InheritanceType.JOINED)
public class Funcionario {
  @Id
  @Column(name = "matricula")
  @NotNull
  private int matricula;

  @Column(name = "nome", length = 100)
  @NotNull
  private String nome;

  @Column(name = "dtnasc")
  @NotNull
  private LocalDate dtnasc;

  @Column(name = "salario", length = 10)
  @NotNull
  private int salario;

  @Column(name = "celular", length = 15)
  private String celular;

  public int getMatricula() {
    return this.matricula;
  }

  public void setMatricula(int matricula) {
    this.matricula = matricula;
  }

  public String getNome() {
    return this.nome;
  }

  public void setNome(String nome) {
    this.nome = nome;
  }

  public LocalDate getDtnasc() {
    return this.dtnasc;
  }

  public void setDtnasc(LocalDate dtnasc) {
    this.dtnasc = dtnasc;
  }

  public int getSalario() {
    return this.salario;
  }

  public void setSalario(int salario) {
    this.salario = salario;
  }

  public String getCelular() {
    return this.celular;
  }

  public void setCelular(String celular) {
    this.celular = celular;
  }

  @Override
  public String toString() {
    return "{" +
        " matricula='" + getMatricula() + "'" +
        ", nome='" + getNome() + "'" +
        ", dtnasc='" + getDtnasc() + "'" +
        ", salario='" + getSalario() + "'" +
        ", celular='" + getCelular() + "'" +
        "}";
  }

}
