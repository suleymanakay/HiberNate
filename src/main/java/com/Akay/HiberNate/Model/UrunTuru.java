package com.Akay.HiberNate.Model;

import lombok.Data;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name = "Urun_Urun_Turu")
@Data
public class UrunTuru {
    @SequenceGenerator(name = "tur",sequenceName = "Urun_Id_Seq")
    @Id
    @GeneratedValue(generator = "tur",strategy = GenerationType.SEQUENCE)
    private Long id;
    @Column(name = "Ad",length = 100)
    private String name;
    @Enumerated(EnumType.STRING)
    @Column(name = "ürün_Türü", length = 100)
    private EnumUrunTuru turu;
    @OneToMany(fetch = FetchType.LAZY,targetEntity = Urun.class,mappedBy = "urunTuru")
    private Set urunler=new HashSet();
}
