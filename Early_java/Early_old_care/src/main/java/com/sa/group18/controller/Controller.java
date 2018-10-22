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
import com.sa.group18.entity.Sex;
import com.sa.group18.entity.Status;
import com.sa.group18.entity.Titlename;
import com.sa.group18.repository.EthnicityRepository;
import com.sa.group18.repository.NationalityRepository;
import com.sa.group18.repository.PositionRepository;
import com.sa.group18.repository.ProfileRepository;
import com.sa.group18.repository.ReligionRepository;
import com.sa.group18.repository.SexRepository;
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
    @Autowired private SexRepository         sexRepository;

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
//--------------------------Sex----------------------------------------------------------

@GetMapping("/Sex")
public Collection <Sex> sex(){
    return sexRepository.findAll();
}
@GetMapping("/Sex/{sexId}")
public  Optional<Sex> sexId(@PathVariable Long sexId){
    return sexRepository.findById(sexId);
}
 
//--------------------------END------------------------------------------------------------
    @GetMapping("/newProfile/{firstname}/{lastname}/{sex}/{identification}/{phone}/{email}/{titlename}/{nationality}/{ethnicity}/{religion}/{position}/{status}")
    // @ResponseBody
    // public Profile newProfile(Profile profile,@RequestBody() Map<String, Object> body)
    public Profile profile(@PathVariable String firstname,@PathVariable String lastname,@PathVariable String sex,@PathVariable String identification,
                            @PathVariable String phone,@PathVariable String email,@PathVariable String titlename,@PathVariable String nationality,
                            @PathVariable String ethnicity,@PathVariable String religion,@PathVariable String position,@PathVariable String status){
    // Titlename    titlename      =  titlenameRepository.findByTitlename(body.get("titlename").toString());
    // Status       status         =  statusRepository.findByStatus(body.get("status").toString());
    // Nationality  nationality    =  nationalityRepository.findByNationality(body.get("nationality").toString());
    // Ethnicity    ethnicity      =  ethnicityRepository.findByEthnicity(body.get("ethnicity").toString());
    // Religion     religion       =  religionRepository.findByReligion(body.get("religion").toString());
    // Position     position       =  positionRepository.findByPosition(body.get("position").toString());
   
    Profile profile = new Profile();
    Ethnicity e = ethnicityRepository.findByEthnicity(ethnicity);
    System.out.println(ethnicity);

    Nationality n = nationalityRepository.findByNationality(nationality);
    System.out.println(nationality);

    Position p = positionRepository.findByPosition(position);
    System.out.println(position);

    Religion r = religionRepository.findByReligion(religion);
    System.out.println(religion);

    Status s = statusRepository.findByStatus(status);
    System.out.println(status);

    Titlename t = titlenameRepository.findByTitlename(titlename);
    System.out.println(titlename);

    Sex sx =sexRepository.findBySex(sex);

    profile.setFirstName(firstname);
    profile.setLastName(lastname);
    profile.setIdentificationnumber(identification);
    profile.setEmail(email);
    profile.setPhone(phone);
    profile.setTitlename(t);
    profile.setStatus(s);
    profile.setNationality(n);
    profile.setEthnicity(e);
    profile.setReligion(r);
    profile.setPosition(p);
    profile.setSex(sx);
   
    return profileRepository.save(profile);
}   
}
