package com.example.grobak.Data;

import com.example.grobak.R;

import java.util.ArrayList;

public class DataSayur extends BarangSatuan{

    private static String[] nama = {
            "Tenderloin",
            "Wagyu",
            "Beef"
    };

    private static String[] harga = {
            "50.000",
            "100.000",
            "100.000"

    };

    private static String[] kuantitas = {
            "500gr",
            "400gr",
            "500gr"
    };

    private static int[] image = {

            R.drawable.daging3,
            R.drawable.daging1,
            R.drawable.daging2
    };

//    public static ArrayList<DataDaging> getDataDaging()
//    {
//        ArrayList<DataDaging>dataDaging = new ArrayList<>();
//        for(int i = 0 ; i < nama.length;i++){
//            BarangSatuan barangSatuan = new DataDaging(); //Keknya ini salah, Klo misal Daging punya propoerti baru mana bisa dimasukin ke BarangSatuan?
//            barangSatuan.setNama(nama[i]); // Tpi klo gk pake BarangSatuan, brarti tiap Fragment nanti harus buat Array baru sesuai dengan Fragment
//            barangSatuan.setHarga(harga[i]); // DAN JUGA DI ADAPTER MINTANYA KAN BARANGSATUAN, GMN TUH KLO MAU BRARTI BIKIN ADPATER BARU TIAP TIAP
//            barangSatuan.setKuantitas(kuantitas[i]);
//            barangSatuan.setImage(image[i]);
//            dataDaging.add(barangSatuan);
//        }
//        return dataDaging;
//    }

    public static ArrayList<BarangSatuan> getDataSayur()
    {
        ArrayList<BarangSatuan>dataSayur = new ArrayList<>();
        for(int i = 0 ; i < nama.length;i++){
            BarangSatuan barangSatuan = new DataDaging(); //Keknya ini salah, Klo misal Daging punya propoerti baru mana bisa dimasukin ke BarangSatuan?
            barangSatuan.setNama(nama[i]); // Tpi klo gk pake BarangSatuan, brarti tiap Fragment nanti harus buat Array baru sesuai dengan Fragment
            barangSatuan.setHarga(harga[i]);
            barangSatuan.setKuantitas(kuantitas[i]);
            barangSatuan.setImage(image[i]);
            dataSayur.add(barangSatuan);
        }
        return dataSayur;
    }

}
