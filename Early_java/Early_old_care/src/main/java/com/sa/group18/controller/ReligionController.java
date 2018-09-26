
package com.sa.group18.controller;
import java.util.Collection;
import com.sa.group18.entity.Religion;
import com.sa.group18.repository.ReligionRepository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController
public class ReligionController{
    private ReligionRepository repo;
    public ReligionController(ReligionRepository repo){
        this.repo = repo;
    }
    @GetMapping("/Religion")
    public Collection<Religion> religion(){
        return repo.findAll();
    }
}