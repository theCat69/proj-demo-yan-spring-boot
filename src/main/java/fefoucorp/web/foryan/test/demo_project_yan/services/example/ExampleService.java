package fefoucorp.web.foryan.test.demo_project_yan.services.example;

import fefoucorp.web.foryan.test.demo_project_yan.controllers.example.ExampleDto;
import fefoucorp.web.foryan.test.demo_project_yan.repositories.example.ExampleRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ExampleService {

  private final ExampleRepository exampleRepository;

  public ExampleService(ExampleRepository exampleRepository) {
    this.exampleRepository = exampleRepository;
  }

  // Cette methode va te paraitre super magique mais en faite c'est tout simple ce qu'on fait
  // le "Repository" il a par default des methodes pour les operations de base (comme findAll())
  // Ensuite on applique l'operation stream qui va renvoyer un a un les elements de la List renvoyer
  // par la methode findAll(). Ensuite l'operation map va permettre d'appliquer une operation
  // sur chaque element du stream. Ici on cree un nouvel object ExampleDto a partir des donnees dans
  // l'objet ExampleEntity. Ensuite on recupere le resultat du stream dans une nouvelle List.
  // Ceci est equivalent a :
  // List<ExampleEntity> exampleEntities = exampleRepository.findAll();
  // List<ExampleDto> exampleDtos = new ArrayList<>();
  // for(ExampleEntity exampleEntity: exampleEntities) {
  //    exampleDtos.add(new ExampleDto(exampleEntity.getId(), exampleEntity.getName()));
  // }
  // return exampleDtos;
  public List<ExampleDto> findAllExampleDto() {
    return exampleRepository.findAll().stream()
      .map(exampleEntity -> new ExampleDto(exampleEntity.getId(), exampleEntity.getName()))
      .toList();
  }
}
