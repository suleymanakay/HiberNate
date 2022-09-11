package com.Akay.HiberNate.Model;

public enum EnumUrunTuru {
    YIYECEK("Yiyecek"),
    ICECEK("Icecek"),
    GIYECEK("Giyecek"),
    YAKACAK("Yakacak"),
    TUKETIM_MALZEMESI("Tüketim_Malzemesi");

    private final String urununTuru;

    EnumUrunTuru(String turu) {
        this.urununTuru = turu;
    }

    public String getTuru() {
        return urununTuru;
    }
}
