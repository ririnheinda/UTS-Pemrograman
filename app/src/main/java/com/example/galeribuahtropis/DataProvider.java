package com.example.galeribuahtropis;

import android.content.Context;

import java.util.ArrayList;
import java.util.List;

import com.example.galeribuahtropis.Model.Buah;
import com.example.galeribuahtropis.Model.Hitam;
import com.example.galeribuahtropis.Model.Orange;
import com.example.galeribuahtropis.Model.Putih;



public class DataProvider {
    private static List<Buah> buahs =new ArrayList<>();

    private static List<Putih> iniDataPutih(Context ctx) {
        List<Putih> putihs = new ArrayList<>();
        putihs.add(new Putih("Jambu biji", "Sukun",
                "Bentuknya memang hampir sama seperti jambu kristal, hanya saja kulit jambu sukun cenderung hijau keputihan saat sudah matang.", R.drawable.p_jambu_sukun));
        putihs.add(new Putih("Kelengkeng", "Matalada",
                "Keunikan lain dari kelengkeng ini yaitu namanya, selain matalada dan hawai, kelengkeng ini disebut juga dengan nama kelengkeng putih.", R.drawable.p_kelengkeng_matalada));
        putihs.add(new Putih("Buah Naga", "Putih",
                "Buah naga putih atau Hylocereus undatus sudah lazim lagi di masyarakat.", R.drawable.p_nagaputih));
        return putihs;
    }
    private static List<Orange> iniDataOrange(Context ctx) {
        List<Orange> oranges = new ArrayList<>();
        oranges.add(new Orange("Pepaya", "Wulan",
                "Buahnya sendiri memiliki ukuran lebih besar dari induk persilangannya. Dagingnya sendiri kaya akan kandungan air dan memiliki rasa manis.", R.drawable.buah_pepaya_wulan));
        oranges.add(new Orange("Jeruk", "Mandarin",
                "Ukuran lebih kecil dibanding dengan ukuran jeruk manis lainnya,memiliki kulit buah yang tebal namun mudah dikupas.", R.drawable.o_jeruk_mandarin));
        oranges.add(new Orange("Jeruk", "Nagami",
                "Jeruk nagami sering disebut juga dengan jeruk kumquat,bentuk buah lonjong dan dapan dimakan langsung dengan kulitnya.", R.drawable.o_jeruk_nagami));
        return oranges;
    }
    private static List<Hitam> iniDataHtam(Context ctx) {
        List<Hitam> hitams = new ArrayList<>();
        hitams.add(new Hitam("Anggur", "Moondrops",
                "Bentuk anggur ini seperti jari dengan warna ungu tua dan kulitnya hampir berwarna hitam.Rasanya manis, tapi tidak terlalu manis dan agak seperti anggur jeli.", R.drawable.h_buah_anggur_moon_drops));
        hitams.add(new Hitam("Berry", "Blueberry",
                " Buah berry berwarna kebiruan ini memiliki kandungan vitamin C dan vitamin K sehingga baik untuk menjaga daya tahan tubuh Toppers.", R.drawable.h_buah_blueberry));
        hitams.add(new Hitam("Jamblang", "Myrtaceae",
                "Buah Jamblang atau duwet sering ditemui dan dibudidayakan di wilayah Asia tropis dan Australia. Dan saat ini sudah ditanam di seluruh wilayah tropika dan subtropika.", R.drawable.h_buah_jamblang));
        return hitams;
    }

    private static void initAllBuahs(Context ctx) {
        buahs.addAll(iniDataPutih(ctx));
        buahs.addAll(iniDataOrange(ctx));
        buahs.addAll(iniDataHtam(ctx));
    }
    public static List<Buah> getAllBuah(Context ctx) {
        if (buahs.size() == 0) {
            initAllBuahs(ctx);
        }
        return  buahs;
    }
    public static List<Buah> getBuahsByTipe(Context ctx, String warna) {
        List<Buah> buahsByType = new ArrayList<>();
        if (buahs.size() == 0) {
            initAllBuahs(ctx);
        }
        for (Buah h : buahs) {
            if (h.getWarna().equals(warna)) {
                buahsByType.add(h);
            }
        }
        return buahsByType;
    }

}

