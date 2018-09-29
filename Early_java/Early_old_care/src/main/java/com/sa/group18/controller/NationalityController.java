/*package com.sa.group18.controller; //เปลี่ยนเป็นของตัวเอง
import java.util.Collection;
import com.sa.group18.entity.Nationality;//ชื่อentity
import com.sa.group18.repository.NationalityRepository;//ชื่อ REpo
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController
public class NationalityController{ //ตามชื่อไฟล์เลย
    private NationalityRepository repo; //ชื่อrepo
    public NationalityController(NationalityRepository repo){ //ชื่อrepo+controller
        this.repo = repo;
    }
    @GetMapping("/Nationality")//ชื่อrEntity
    public Collection<Nationality> nationality(){//ชื่อrEntity+ปรับเป็นตัวเล็ก
        return repo.findAll();
    }
}
*/