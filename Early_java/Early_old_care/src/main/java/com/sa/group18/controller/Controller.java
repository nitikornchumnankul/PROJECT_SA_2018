package com.sa.group18.controller;
import java.util.Optional;
import java.util.Collection;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
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
    @Autowired private EthnicityRepository ethnicityRepository;  
    @Autowired private NationalityRepository nationalityRepository;  
    @Autowired private PositionRepository positionRepository;
    // @Autowired private ProfileRepository profileRepository;
    @Autowired private ReligionRepository religionRepository;
    @Autowired private StatusRepository statusRepository;
    @Autowired private TitlenameRepository titlenameRepository;
 

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

//     @GetMapping("/Profile")
//     public Collection<Profile> Profile(){
//         return profileRepository.findAll();
//     }
//     @GetMapping("/Profile/{Profile_Id}")
//     public Optional <Profile> takeinClassificationByid(@PathVariable Long Profile_Id){
//         return profileRepository.findById(Profile_Id);
//     }

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
    public List<Status> Status(){
        return statusRepository.findAll();
    }
    @GetMapping("/Status/{statusId}")
    public Optional  <Status> statusId(@PathVariable Long statusId){
        return statusRepository.findById(statusId);
    }

//------------------------Titlename----------------------------------------------------------

   @GetMapping("/Titlename")
    public Collection <Titlename> titlename(){
        return titlenameRepository.findAll();
    }
    @GetMapping("/Titlename/{titlenameId}")
    public  Optional<Titlename> titlenameId(@PathVariable Long titlenameId){
        return titlenameRepository.findById(titlenameId);
    }
 
//--------------------------END------------------------------------------------------------
//     @PostMapping("/profile")
//     public Profile addProfile(@RequestBody Profile profile,     
//                               @PathVariable Long religion_Id,       @PathVariable Long status_Id,      
//                               @PathVariable Long titlename_Id,      @PathVariable Long position_Id,    
//                               @PathVariable Long nationality_Id,    @PathVariable Long ethnicity_Id
//                               ) {
                            
//         Titlename       titleName   = titlenameRepository.findById(titlename_Id);
//         Status          status      = statusRepository.findById(status_Id);
//         Nationality     nationality = nationalityRepository.findById(nationality_Id);
//         Ethnicity       ethnicity   = ethnicityRepository.findById(ethnicity_Id);
//         Religion        religion    = religionRepository.findById(religion_Id);
//         Position        position    = positionRepository.findById(position_Id);

//         profile.setTitlename(titleName);
//         profile.setStatus(status);
//         profile.setNationality(nationality);
//         profile.setEthnicity(ethnicity);
//         profile.setReligion(religion);
//         profile.setPosition(position);

//         return profileRepository.save(addProfile);
//  }


}
