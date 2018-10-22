package com.sa.group18;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import java.util.stream.Stream;
import com.sa.group18.entity.Titlename;
import com.sa.group18.entity.Nationality;
import com.sa.group18.entity.Ethnicity;
import com.sa.group18.entity.Religion;
import com.sa.group18.entity.Sex;
import com.sa.group18.entity.Status;
import com.sa.group18.entity.Position;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.filter.CharacterEncodingFilter;
import com.sa.group18.repository.TitlenameRepository;
import com.sa.group18.repository.NationalityRepository;
import com.sa.group18.repository.EthnicityRepository;
import com.sa.group18.repository.ReligionRepository;
import com.sa.group18.repository.SexRepository;
import com.sa.group18.repository.StatusRepository;
import com.sa.group18.repository.PositionRepository;
@SpringBootApplication
public class EarlyOldCareApplication {

	public static void main(String[] args) {
		SpringApplication.run(EarlyOldCareApplication.class, args);
	}
	@Bean
	CharacterEncodingFilter characterEncodingFilter(){
		CharacterEncodingFilter filter =new CharacterEncodingFilter();
		filter.setEncoding("UTF-8");
		filter.setForceEncoding(true);
		return filter;
	}
	@Bean
    ApplicationRunner init(	TitlenameRepository  titlenameRepository, NationalityRepository nationalityRepository,
							EthnicityRepository  ethnicityRepository, ReligionRepository    religionRepository,
							StatusRepository     statusRepository,    PositionRepository    positionRepository,
							SexRepository    	 sexRepository  ) {
		return args -> {
		Stream.of("นาย","นาง","นางสาว").forEach(name -> {
				Titlename titlename = new Titlename();
			titlename.setTitlename(name);
			titlenameRepository.save(titlename);
			});
			titlenameRepository.findAll().forEach(System.out::println);

		Stream.of("โสด","สมรส ").forEach(name -> {
				Status status = new Status();
			status.setStatus(name);
			statusRepository.save(status);
			});
			statusRepository.findAll().forEach(System.out::println);

		Stream.of("ไทย","กัมพูชา","ลาว").forEach(name -> {
				Nationality nationality = new Nationality();
			nationality.setNationality(name);
			nationalityRepository.save(nationality);
			});
			nationalityRepository.findAll().forEach(System.out::println);

		Stream.of("ไทย","กัมพูชา","ลาว").forEach(name -> {
				Ethnicity ethnicity = new Ethnicity();
			ethnicity.setEthnicity(name);
			ethnicityRepository.save(ethnicity);
			});
			ethnicityRepository.findAll().forEach(System.out::println);
		
		Stream.of("พุทธ","อิสลาม","คริสต์").forEach(name -> {
				Religion religion = new Religion();
			religion.setReligion(name);
			religionRepository.save(religion);
			});
			religionRepository.findAll().forEach(System.out::println);
			
		Stream.of("ผู้อำนวยการ","หมอ","พยาบาล","เจ้าหน้าที่ฝ่ายบุคคล","แม่บ้าน","เจ้าหน้าที่ฝ่ายบัญชี").forEach(name -> {
				Position position = new Position();
			position.setPosition(name);
			positionRepository.save(position);
			});
			positionRepository.findAll().forEach(System.out::println);
		
			Stream.of("ชาย","หญิง").forEach(name -> {
				Sex sex = new Sex();
				sex.setSex(name);
			sexRepository.save(sex);
			});
			sexRepository.findAll().forEach(System.out::println);
			
		
		};
		
	}
}
