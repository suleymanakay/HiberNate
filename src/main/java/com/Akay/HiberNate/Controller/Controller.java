package com.Akay.HiberNate.Controller;

import com.Akay.HiberNate.Model.Urun;
import com.Akay.HiberNate.Model.UrunTuru;
import com.Akay.HiberNate.Repository.UrunRepository;
import com.Akay.HiberNate.Service.Service;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/urunler")
public class Controller {
    @Autowired
    private Service service;

    @GetMapping("/get-urun")
    public List<Urun> getAllUrun() {
        return service.getFindAllUrun();
    }
    @GetMapping("/get-urunTuru")
    public List<UrunTuru> getAllUrunTuru() {
        return service.getFindAllUrunTuru();
    }

    @PostMapping("/urun-save")
    public String saveUrun(@RequestBody Urun urun) {
         service.getSaveUrun(urun);
         return "Başarıyla kaydedildi.";
    }

    @PostMapping("/urunTuru-save")
    public String saveUrunTuru(@RequestBody UrunTuru urunTuru) {
        return service.getSaveUrunTuru(urunTuru);
    }
}