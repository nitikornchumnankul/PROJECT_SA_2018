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
//-------------------------Ethnicity---------------------------------------------------

    @GetMapping("/Ethnicity")
    public Collection<Ethnicity> getEthnicity(){
        return ethnicityRepository.findAll().stream().collect(Collectors.toList());
    }
    @GetMapping("/Ethnicity/{Ethnicity_Id}")
    public Ethnicity getOneEthnicity(@PathVariable Long Ethnicity_Id){
        return ethnicityRepository.findById(Ethnicity_Id).get();
    }

//-------------------------Nationality---------------------------------------------------

    @GetMapping("/Nationality")
    public Collection<Nationality> getNationality(){
        return nationalityRepository.findAll().stream().collect(Collectors.toList());
    }
    @GetMapping("/Nationality/{Nationality_Id}")
    public Nationality getOneNationality(@PathVariable Long Nationality_Id){
        return nationalityRepository.findById(Nationality_Id).get();
    }

 //-------------------------Position------------------------------------------------------

    @GetMapping("/Position")
    public Collection<Position> getPosition(){
        return positionRepository.findAll().stream().collect(Collectors.toList());
    }
    @GetMapping("/Position/{Position_Id}")
    public Position getOnePosition(@PathVariable Long Position_Id){
        return positionRepository.findById(Position_Id).get();
    }

//-------------------------Profile---------------------------------------------------------

    @GetMapping("/Profile")
    public Collection<Profile> getProfile(){
        return profileRepository.findAll().stream().collect(Collectors.toList());
    }
    @GetMapping("/Profile/{Profile_Id}")
    public Profile getOneProfile(@PathVariable Long Profile_Id){
        return profileRepository.findById(Profile_Id).get();
    }

//-------------------------Religion-------------------------------------------------------

    @GetMapping("/Religion")
    public Collection<Religion> getReligion(){
        return religionRepository.findAll().stream().collect(Collectors.toList());
    }
    @GetMapping("/Religion/{Religion_Id}")
    public Religion getOneReligion(@PathVariable Long Religion_Id){
        return religionRepository.findById(Religion_Id).get();
    }
    
//-------------------------Status----------------------------------------------------------

    @GetMapping("/Status")
    public List<Status> getStatus(){
        return statusRepository.findAll().stream().collect(Collectors.toList());
    }
    @GetMapping("/Status/{Status_Id}")
    public Status getOneStatus(@PathVariable Long Status_Id){
        return statusRepository.findById(Status_Id).get();
    }

//------------------------Titlename----------------------------------------------------------

    @GetMapping("/Titlename")
    public List<Titlename> getTitlename(){
        return titlenameRepository.findAll().stream().collect(Collectors.toList());
    }
    @GetMapping("/Titlename/{Titlename_Id}")
    public Titlename getOneTitlename(@PathVariable Long Titlename_Id){
        return titlenameRepository.findById(Titlename_Id).get();
    }

//-------------------------------------------------------------------------------------------

}
