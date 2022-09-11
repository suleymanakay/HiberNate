package com.Akay.HiberNate.Repository;

import com.Akay.HiberNate.Model.Urun;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UrunRepository extends JpaRepository<Urun,Long>{
   Urun getUrunBy(Urun urun);
}
