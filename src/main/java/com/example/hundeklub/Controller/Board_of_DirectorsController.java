package com.example.hundeklub.Controller;


import com.example.hundeklub.Model.Board_of_DirectorsModel;
import com.example.hundeklub.Repository.Board_of_DirectorsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin
public class Board_of_DirectorsController {

  @Autowired
Board_of_DirectorsRepository board_of_directorsRepository;

@GetMapping("/bestyrelser")
  public List<Board_of_DirectorsModel> getAllBestyrelse(){
  return board_of_directorsRepository.findAll();
}

@PostMapping("/bestyrelse")
  @ResponseStatus(HttpStatus.CREATED)
  public Board_of_DirectorsModel postbestyrelsen(@RequestBody Board_of_DirectorsModel bestyrelsen){
  System.out.println(bestyrelsen);
  return board_of_directorsRepository.save(bestyrelsen);
}

}
