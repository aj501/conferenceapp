package com.pluralsight.conferencedemo.controllers;

import com.pluralsight.conferencedemo.models.Speaker;
import com.pluralsight.conferencedemo.repositories.SpeakerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/v1/speaker")
public class SpeakerController {
  //Spring will autowire this when our speaker controller is built. It will
  //create an instant of the session repo and put it on to our class.
  @Autowired
  private SpeakerRepository speakerRepository;

  @GetMapping
  public List<Speaker> list() {
    //This will find all the speakers in the database and reitrn them as a list of speaker object.
    return speakerRepository.findAll();
  }
  @GetMapping
  @RequestMapping("{id}")
  public Speaker get(@PathVariable Long id) {
    return speakerRepository.getOne(id);
  }
}
