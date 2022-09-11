package com.Akay.HiberNate.Repository;

import com.Akay.HiberNate.Model.UrunTuru;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UrunTuruRepository extends JpaRepository<UrunTuru,Long> {
}
