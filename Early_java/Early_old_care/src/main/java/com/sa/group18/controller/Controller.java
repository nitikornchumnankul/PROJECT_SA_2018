package com.sa.group18.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;
import com.sa.group18.entity.Ethnicity;
import com.sa.group18.entity.Nationality;
import com.sa.group18.entity.Position;
import com.sa.group18.entity.Profile;
import com.sa.group18.entity.Religion;
import com.sa.group18.entity.Status;
import com.sa.group18.entity.Titlename;
import com.sa.group18.repository.EthnicityRepository;
import com.sa.group18.repository.NationalityRepository;
import com.sa.group18.repository.PositionRepository;
import com.sa.group18.repository.ProfileRepository;
import com.sa.group18.repository.ReligionRepository;
import com.sa.group18.repository.StatusRepository;
import com.sa.group18.repository.TitlenameRepository;


@RestController  
@CrossOrigin(origins ="http://localhost:4200")

public class Controller {
    @Autowired
    private EthnicityRepository ethnicityRepository;  
    @Autowired
    private NationalityRepository nationalityRepository;  
    @Autowired
    private PositionRepository positionRepository;
    @Autowired
    private ProfileRepository profileRepository;
    @Autowired
    private ReligionRepository religionRepository;
    @Autowired
    private StatusRepository statusRepository;
    @Autowired
    private TitlenameRepository titlenameRepository;


    @GetMapping("/Ethnicity")
    public Collection<Ethnicity> getEthnicity(){
        return ethnicityRepository.findAll().stream().collect(Collectors.toList());
    }

    @GetMapping("/Ethnicity/{Ethnicity_id}")
    public Ethnicity getOneEthnicity(@PathVariable Long Ethnicity_id){
        return ethnicityRepository.findById(Ethnicity_id).get();
    }

    @GetMapping("/Nationality")
    public Collection<Nationality> getNationality(){
        return nationalityRepository.findAll().stream().collect(Collectors.toList());
    }
    @GetMapping("/Nationality/{Nationality_id}")
    public Nationality getOneNationality(@PathVariable Long Nationality_id){
        return nationalityRepository.findById(Nationality_id).get();
    }

    @GetMapping("/Position")
    public Collection<Position> getPosition(){
        return positionRepository.findAll().stream().collect(Collectors.toList());
    }
    @GetMapping("/Position/{Position_id}")
    public Position getOnePosition(@PathVariable Long Position_id){
        return positionRepository.findById(Position_id).get();
    }


    @GetMapping("/Profile")
    public Collection<Profile> getProfile(){
        return profileRepository.findAll().stream().collect(Collectors.toList());
    }
    @GetMapping("/Profile/{Profile_id}")
    public Profile getOneProfile(@PathVariable Long Profile_id){
        return profileRepository.findById(Profile_id).get();
    }

    @GetMapping("/Religion")
    public Collection<Religion> getReligion(){
        return religionRepository.findAll().stream().collect(Collectors.toList());
    }
    @GetMapping("/Religion/{Religion_id}")
    public Religion getOneReligion(@PathVariable Long Religion_id){
        return religionRepository.findById(Religion_id).get();
    }

    
    @GetMapping("/Status")
    public List<Status> getStatus(){
        return statusRepository.findAll().stream().collect(Collectors.toList());
    }
    @GetMapping("/Status/{Status_id}")
    public Status getOneStatus(@PathVariable Long Status_id){
        return statusRepository.findById(Status_id).get();
    }

    @GetMapping("/Titlename")
    public List<Titlename> getTitlename(){
        return titlenameRepository.findAll().stream().collect(Collectors.toList());
    }
    @GetMapping("/Titlename/{Titlename_id}")
    public Titlename getOneTitlename(@PathVariable Long Titlename_id){
        return titlenameRepository.findById(Titlename_id).get();
    }









}