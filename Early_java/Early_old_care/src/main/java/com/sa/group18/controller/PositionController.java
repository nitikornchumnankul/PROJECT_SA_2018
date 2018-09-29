/*package com.sa.group18.controller;
import java.util.Collection;
import com.sa.group18.entity.Position;
import com.sa.group18.repository.PositionRepository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController
public class PositionController{
    private PositionRepository repo;
    public PositionController(PositionRepository repo){
        this.repo = repo;
    }
    @GetMapping("/Position")
    public Collection<Position> position(){
        return repo.findAll();
    }
}
*/