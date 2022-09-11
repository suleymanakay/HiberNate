package com.Akay.HiberNate.Service;

import com.Akay.HiberNate.Model.Urun;
import com.Akay.HiberNate.Model.UrunTuru;
import com.Akay.HiberNate.Repository.UrunRepository;
import com.Akay.HiberNate.Repository.UrunTuruRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@org.springframework.stereotype.Service
@Component
public class Service {

    private static UrunRepository urunRepository;
    private static UrunTuruRepository urunTuruRepository;
@Autowired
    public Service(UrunRepository urunRepository,UrunTuruRepository urunTuruRepository){
        this.urunRepository=urunRepository;
        this.urunTuruRepository=urunTuruRepository;
    }
    public List<Urun> getFindAllUrun(){
       return urunRepository.findAll();
    }
    public List<UrunTuru> getFindAllUrunTuru(){
        return urunTuruRepository.findAll();
    }

    public String getSaveUrun(Urun urun){
        urunRepository.saveAndFlush(urun);
        return "Başarıyla kaydedildi.";
    }
    public String getSaveUrunTuru(UrunTuru urunTuru){
        Service.urunTuruRepository.save(urunTuru);
        return "Başarıyla kaydedildi.";
    }

}
