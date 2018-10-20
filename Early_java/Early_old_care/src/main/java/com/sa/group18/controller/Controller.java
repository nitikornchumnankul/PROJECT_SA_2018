package com.sa.group18.controller;
import java.util.Optional;
import java.util.Collection;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;
import java.util.Map;
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


@EnableAutoConfiguration
@RestController
@CrossOrigin(origins ="http://localhost:4200")
public class Controller {
    @Autowired private EthnicityRepository   ethnicityRepository;  
    @Autowired private NationalityRepository nationalityRepository;  
    @Autowired private PositionRepository    positionRepository;
    @Autowired private ProfileRepository     profileRepository;
    @Autowired private ReligionRepository    religionRepository;
    @Autowired private StatusRepository      statusRepository;
    @Autowired private TitlenameRepository   titlenameRepository;
 

// //-------------------------Ethnicity---------------------------------------------------

    @GetMapping("/Ethnicity")
    public Collection<Ethnicity> ethnicity(){
        return ethnicityRepository.findAll();
    }
    @GetMapping("/Ethnicity/{ethnicityId}")
    public Optional <Ethnicity> ethnicityId(@PathVariable Long ethnicityId){
        return ethnicityRepository.findById(ethnicityId);
    }



// //-------------------------Nationality---------------------------------------------------

    @GetMapping("/Nationality")
    public Collection<Nationality> nationality(){
        return nationalityRepository.findAll();
    }
    @GetMapping("/Nationality/{nationalityId}")
    public Optional <Nationality>nationalityId(@PathVariable Long nationalityId){
        return nationalityRepository.findById(nationalityId);
    }
  
//  //-------------------------Position------------------------------------------------------

    @GetMapping("/Position")
    public Collection<Position> position(){
        return positionRepository.findAll();
    }
    @GetMapping("/Position/{positionId}")
    public Optional <Position> positionId(@PathVariable Long positionId){
        return positionRepository.findById(positionId);
    }

// //-------------------------Profile---------------------------------------------------------

    @GetMapping("/Profile")
    public Collection<Profile> profile(){
        return profileRepository.findAll();
    }
    @GetMapping("/Profile/{profileId}")
    public Optional <Profile> takeinClassificationByid(@PathVariable Long profileId){
        return profileRepository.findById(profileId);
    }

// //-------------------------Religion-------------------------------------------------------

    @GetMapping("/Religion")
    public Collection<Religion> religion(){
        return religionRepository.findAll();
    }
    @GetMapping("/Religion/{religionId}")
    public Optional <Religion> religionId(@PathVariable Long religionId){
        return religionRepository.findById(religionId);
    }
    
//-------------------------Status----------------------------------------------------------

    @GetMapping("/Status")
    public List<Status> status(){
        return statusRepository.findAll();
    }
    @GetMapping("/Status/{statusId}")
    public Optional  <Status> statusId(@PathVariable Long statusId){
        return statusRepository.findById(statusId);
    }
 
//------------------------Titlename----------------------------------------------------------

   @GetMapping("/Titlename")
    public Collection <Titlename> titleName(){
        return titlenameRepository.findAll();
    }
    @GetMapping("/Titlename/{titlenameId}")
    public  Optional<Titlename> titlenameId(@PathVariable Long titlenameId){
        return titlenameRepository.findById(titlenameId);
    }
 
//--------------------------END------------------------------------------------------------
    @PostMapping("/newProfile")
    @ResponseBody
    public Profile newProfile(Profile profile,@RequestBody() Map<String, Object> body){
    Titlename    titlename      =  titlenameRepository.findByTitlename(body.get("titlename").toString());
    Status       status         =  statusRepository.findByStatus(body.get("status").toString());
    Nationality  nationality    =  nationalityRepository.findByNationality(body.get("nationality").toString());
    Ethnicity    ethnicity      =  ethnicityRepository.findByEthnicity(body.get("ethnicity").toString());
    Religion     religion       =  religionRepository.findByReligion(body.get("religion").toString());
    Position     position       =  positionRepository.findByPosition(body.get("position").toString());
   
   
    profile.setFirstName(body.get("firstName").toString());
    profile.setLastName(body.get("lastName").toString());
    profile.setSex(body.get("sex").toString());
    profile.setIdentificationnumber(body.get("identificationnumber").toString());
    profile.setEmail(body.get("email").toString());
    profile.setPhone(body.get("phone").toString());
    profile.setTitlename(titlename);
    profile.setStatus(status);
    profile.setNationality(nationality);
    profile.setEthnicity(ethnicity);
    profile.setReligion(religion);
    profile.setPosition(position);
   
    
    
   
    
   
    
    System.out.println(profile);
    // System.out.println(titlename);
    return profileRepository.save(profile);
}   
}
