package fefoucorp.web.foryan.test.demo_project_yan.repositories.example;

import jakarta.persistence.*;

@Entity
@Table(name = "exampletab1")
public class ExampleEntity { // Normalement cette classe porte le nom reel du truc que tu veux

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long id;

  private String name;

  public ExampleEntity() {
  }

  public ExampleEntity(Long id, String name) {
    this.id = id;
    this.name = name;
  }

  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }
}
