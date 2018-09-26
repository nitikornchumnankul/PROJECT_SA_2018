package com.sa.group18.controller;
import java.util.Collection;
import com.sa.group18.entity.Profile;
import com.sa.group18.repository.ProfileRepository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController
public class ProfileController{
    private ProfileRepository repo;
    public ProfileController(ProfileRepository repo){
        this.repo = repo;
    }
    @GetMapping("/Profile")
    public Collection<Profile> Profile(){
        return repo.findAll();
    }
}