package com.example.firstspringboot.controller;

import com.example.firstspringboot.model.People;
import com.example.firstspringboot.service.IPeopleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @author all
 */
@RestController
@RequestMapping("/people")
public class PeopleController {
    @Autowired
    private IPeopleService peopleService;

    @GetMapping()
    public ResponseEntity<List<People>> getAll(){
        return new ResponseEntity<>(peopleService.list(), HttpStatus.OK);
    }

    @PutMapping("/{id}")
    public ResponseEntity<Object> update(@RequestBody People people){
        return new ResponseEntity<>(peopleService.update(people,null), HttpStatus.OK);
    }

    @PostMapping("/add")
    public ResponseEntity<Object> add(@RequestBody People people){
        return new ResponseEntity<>(peopleService.save(people), HttpStatus.OK);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Object> delete(@PathVariable int id){
        return new ResponseEntity<>(peopleService.removeById(id), HttpStatus.OK);
    }
}
