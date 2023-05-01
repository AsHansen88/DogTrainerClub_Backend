package com.example.hundeklub.Controller;

import com.example.hundeklub.Model.NewsModel;
import com.example.hundeklub.Repository.NewsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;



  @RestController
  @CrossOrigin
  public class NewsController {

    @Autowired
    NewsRepository newsRepository;

    @GetMapping("/nyheder")
    public List<NewsModel> getAllNyheder(){
      return newsRepository.findAll();
    }

    @PostMapping("/nyhed")
    @ResponseStatus(HttpStatus.CREATED)
    public NewsModel postnyhed(@RequestBody NewsModel nyheder){
      System.out.println(nyheder);
      return newsRepository.save(nyheder);
    }

  }


