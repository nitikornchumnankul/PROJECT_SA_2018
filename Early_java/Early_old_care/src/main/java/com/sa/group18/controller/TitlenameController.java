package com.sa.group18.controller;
import java.util.Collection;
import com.sa.group18.entity.Titlename;
import com.sa.group18.repository.TitlenameRepository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController
public class TitlenameController{
    private TitlenameRepository repo;
    public TitlenameController(TitlenameRepository repo){
        this.repo = repo;
    }
    @GetMapping("/Titlename")
    public Collection<Titlename> titlename(){
        return repo.findAll();
    }
}