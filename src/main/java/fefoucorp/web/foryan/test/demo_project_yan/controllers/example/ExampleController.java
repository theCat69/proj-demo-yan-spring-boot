package fefoucorp.web.foryan.test.demo_project_yan.controllers.example;

import fefoucorp.web.foryan.test.demo_project_yan.services.example.ExampleService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ExampleController {

  private final ExampleService exampleService;

  public ExampleController(ExampleService exampleService) {
    this.exampleService = exampleService;
  }

  @GetMapping("/example")
  String helloWorld() {
    return "Hello World !";
  }

  @GetMapping("/example/all")
  List<ExampleDto> fetchAll() {
    return exampleService.findAllExampleDto();
  }

}
