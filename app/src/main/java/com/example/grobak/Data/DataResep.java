package com.example.grobak.Data;

import com.example.grobak.R;

import java.util.ArrayList;

public class DataResep {

    private static String[] namaResep ={
            "CapJay",
            "Dendeng",
            "Ikan Balado",
            "Nasi Goreng",
            "Pecel Ayam",
            "Rendang",
            "Sate Padan",
            "Sop Buntut",
            "Soto Padang",
            "Telur Dadar"
    };

    private static String[] detailResep = {

            "Cap cai, sometimes spelled cap cay, is the Hokkien-derived term for a popular Chinese Indonesian stir-fried vegetable dish that originates from Fujian cuisine.",
            "Jerky is lean trimmed meat that has been cut into strips and dried to prevent spoilage. Normally, this drying includes the addition of salt to prevent bacteria growth before the meat has finished the dehydrating process. The word \"jerky\" derives from the Quechua word ch'arki which means \"dried, salted meat\"",
            "Ikan Balado is an Indonesian Cuisine that is pretty intresting, it is an fish but dipped into a sauce called balado, which is a mixture of a hot sauce and some sweets",
            "Nasi goreng, literally meaning fried rice in both the Indonesian and Malay languages, is an Indonesian rice dish with pieces of meat and vegetables added",
            "Pecel is a traditional Javanese salad, consisting of mixed vegetables in a peanut sauce dressing, usually served with steamed rice or sometimes with lontong or ketupat compressed rice cake.",
            "Rendang is an Indonesian spicy red meat dish originating from the Minangkabau people of Indonesia. It has spread across Indonesia to the cuisines of neighbouring Southeast Asian countries",
            "Satay, or sate in Indonesian spelling, is a Indonesian dish of seasoned, skewered and grilled meat, served with a sauce. It is a dish from Indonesia, and popular in Malaysia, Singapore, Thailand, and Brunei",
            "Oxtail soup is made with beef tails. The use of the word ox in this context is a legacy of nomenclature; no specialized stock of beef animals are used and tails may come from bovines other than oxen.",
            "Soto is a traditional Indonesian soup mainly composed of broth, meat, and vegetables. Many traditional soups are called soto, whereas foreign and Western influenced soups are called sop. Soto is sometimes considered Indonesia's national dish, as it is served from Sumatra to Papua, in a wide range of variations",
            "In cuisine, an omelette or omelet is a dish made from beaten eggs fried with butter or oil in a frying pan. It is quite common for the omelette to be folded around fillings such as cheese, chives, vegetables, mushrooms, meat, or some combination of the above."

    };

    private static int[] fotoResep = {
            R.drawable.capcay,
            R.drawable.dendeng,
            R.drawable.ikan_balado,
            R.drawable.nasgor,
            R.drawable.pecel_ayam,
            R.drawable.rendang,
            R.drawable.sate_padan,
            R.drawable.sop_buntut,
            R.drawable.soto_padang,
            R.drawable.telur_dadar

    };


    private static String[][] nutrion = {
            {"8.7g","60KKal","1.42g"},
            {"2.20g","82KKal","6.64g"},
            {"2.00g","163KKal","21.13g"},
            {"41.7g","333KKal","12.47g"},
            {"38.09g","276KKal","7.9g"},
            {"10.78g","468KKal","47.23g"},
            {"3.06g","72Kkal","2.98g"},
            {"8.64g","68Kkal","2.71g"},
            {"53g","607Kkal","28g"},
            {"0.42g","93Kkal","6.48g"}
    };

    private static String[] url_link = {
            "https://www.youtube.com/watch?v=p6uX4DdHfdg",
            "https://www.youtube.com/watch?v=4tn6kd2f8wc",
            "https://www.youtube.com/watch?v=u8qpKm1PweI",
            "https://www.youtube.com/watch?v=BQZEiWAZyKM",
            "https://www.youtube.com/watch?v=ggXlXc-djXI",
            "https://www.youtube.com/watch?v=oOQa8B1adO8",
            "https://www.youtube.com/watch?v=Uj9SCKvkjtk",
            "https://www.youtube.com/watch?v=qp4LPgmH4QE",
            "https://www.youtube.com/watch?v=EB2gIOGwgg8",
            "https://www.youtube.com/watch?v=NnjGjw7aWro"

    };

    private static String[] bahanResep = {

            "-Wortel \n" + "Kol Putih \n" + "Brokoli \n" + "Kapri siangi \n" + "Jamur \n" + "Sawi putih \n"+ "Bawang bombay \n" +" Bawang putih \n" + "Bakso sapi \n"+  "Air \n" + "Minyak goreng \n",
            "1 kg daging sapi (potong tipis)\n" + "10 buah cabai merah\n" + "10 buah cabai rawit merah (cabai setan)\n" + "5 buah bawang putih\n" + "7 buah bawang merah\n" + "Secukupnya penyedap, gula dan garam ",
            "2 ekor ikan gabus\n" + "4 buah Labu siam\n" + "1/2 ons cambah kedelai\n" + "4 bawang putih\n" + "6 bawang merah\n" + "1 buah Tomat ",
            "3 buah cabai merah\n" + "6 buah cabai rawit\n" + "3 siung bawang putih\n" + "2 buah kemiri\n" + "Secukupnya Garam\n" + "6 siung bawang merah\n" + "1 buah tomat ",
            "1 Ekor Ayam potong 10\n" + "1 buah Jeruk nipis\n" + "Bumbu Ungkepan :\n" + "4 Siung Bawang putih\n" + "1 sdm Ketumbar\n" + "2 btr Kemiri\n" + "1 ptng Kunyit\n" + "1 ptng Jahe ",
            "1/2 kg daging sapi has dalam\n" + "10 butir telur (bisa di skip)\n" + "500 ml santan\n" + "400-500 ml air\n" + "10 cabe merah besar(bisa tambah cabe rawit&keriting)\n" + "25 siung bawang merah\n" + "5 siung bawah putih besar\n" + "3 butir kemiri ",
            "500 gr fillet dada ayam, potong memanjang\n" + "200 ml susu\n" + "Air jeruk nipis dari 1/2 buah jeruk nipis\n" + "secukupnya Garam & merica\n" + "secukupnya Bawang putih bubuk\n" + "1 bungkus tepung bumbu siap pakai ",
            "1 kg Buntut sapi dicuci bersih\n" + "2 L Air mineral utk merebus\n" + "200 ml Santan instan Kara\n" + "▪Bumbu rebus :\n" + "5 cm Lengkuas digeprek\n" + "6 cm Jahe digeprek\n" + "4 batang Sereh digeprek\n" + "2 biji Pekak/kembang lawang\n" + "2 biji Kapulaga ",
            "250 gr daging has dalam\n" + "1 bt bunga pekak\n" + "4 siung bawang putih, haluskan\n" + "2 sdt garam\n" + "2 lt air untuk merebus\n" + "Minyak untuk menggoreng ",
            "2 Butir Telur\n" + "1/2 Potong Bawang Bombay\n" + "4 Siung Cabe Rawit Merah\n" + "2 Batang Daun Bawang ",

    };


    public static ArrayList<Resep> getListData(){
        ArrayList<Resep> reseps = new ArrayList<>();
        for(int i = 0 ; i < namaResep.length;i++){
            Resep resep = new Resep();
            resep.setNama(namaResep[i]);
            resep.setDetail(detailResep[i]);
            resep.setImage(fotoResep[i]);
            resep.setBahan(bahanResep[i]);
            resep.setUrl(url_link[i]);
            resep.setNut(nutrion[i]);
            reseps.add(resep);
        }
        return reseps;
    }

}
