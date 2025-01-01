package fefoucorp.web.foryan.test.demo_project_yan.controllers.example;

public class ExampleDto { // Ici le nom de la classe est souvent avec le suffix Dto (Pour Data Transfert Object)
  
  private Long id;
  private String name;

  public ExampleDto() {
  }

  public ExampleDto(Long id, String name) {
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
