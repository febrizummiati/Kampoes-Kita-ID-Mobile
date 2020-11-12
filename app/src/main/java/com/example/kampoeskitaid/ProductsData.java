package com.example.kampoeskitaid;

import java.util.ArrayList;

public class ProductsData {
    private static String[] productNames = {
            "Kaos PNP Est 1987",
            "Kaos I PNP",
            "Kaos PNP Ybttf",
            "Kaos PNP King",
            "Kaos Electrical Engineering",
            "Kaos Mechanical Engineering",
            "Kaos Civil Engineering",
            "Gantungan Kunci PNP",
            "Totebag PNP Black",
            "Totebag PNP White"
    };

    private static String[] productDetails = {
            "Kode : BK01, Bahan : Cotton Combad 30s, Ukuran : M-XXL, Warna : Navy, Harga : Rp 70.000",
            "Kode : BK02, Bahan : Cotton Combad 30s, Ukuran : M-XXL, Warna : Hitam, Harga : Rp 70.000",
            "Kode : BK03, Bahan : Cotton Combad 30s, Ukuran : M-XXL, Warna : Army, Harga : Rp 70.000",
            "Kode : BK04, Bahan : Cotton Combad 30s, Ukuran : M-XXL, Warna : Maroon, Harga : Rp 70.000",
            "Kode : BJ01, Bahan : Cotton Combad 30s, Ukuran : M-XXL, Warna : Hitam, Harga : Rp 65.000",
            "Kode : BJ02, Bahan : Cotton Combad 30s, Ukuran : M-XXL, Warna : Hitam, Harga : Rp 65.000",
            "Kode : BJ03, Bahan : Cotton Combad 30s, Ukuran : M-XXL, Warna : Hitam, Harga : Rp 65.000",
            "Kode : GK01, Bahan : Rubber, Ukuran : 6x6 cm, Warna : Random, Harga : Rp 10.000",
            "Kode : TB01, Bahan : Semi Canvas, Ukuran : 35x45x10 cm, Warna : Hitam, Harga: Rp 45.000",
            "Kode : TB02, Bahan : Semi Canvas, Ukuran : 35x45x10 cm, Warna : Putih , Harga: Rp 45.000"
    };

    private static int[] productImages = {
            R.drawable.pnp,
            R.drawable.i_pnp_black,
            R.drawable.pnp_ybttf_army,
            R.drawable.pnp_king,
            R.drawable.ee,
            R.drawable.me,
            R.drawable.ce,
            R.drawable.pnp_gk,
            R.drawable.tb_black,
            R.drawable.tb_white
    };

    private static String[] productCode = {
            "BK01",
            "BK02",
            "BK03",
            "BK04",
            "BJ01",
            "BJ02",
            "BJ03",
            "GK01",
            "TB01",
            "TB02"
    };

    private static String[] productBahan = {
            "Cotton Combad 30s",
            "Cotton Combad 30s",
            "Cotton Combad 30s",
            "Cotton Combad 30s",
            "Cotton Combad 30s",
            "Cotton Combad 30s",
            "Cotton Combad 30s",
            "Rubber",
            "Semi Canvas",
            "Semi Canvas"
    };

    private  static String[] productSize = {
            "M-XXL",
            "M-XXL",
            "M-XXL",
            "M-XXL",
            "M-XXL",
            "M-XXL",
            "M-XXL",
            "6x6 cm",
            "35x45x10 cm",
            "35x45x10 cm"
    };

    private static String[] productColor = {
            "Navy",
            "Hitam",
            "Army",
            "Maroon",
            "Hitam",
            "Hitam",
            "Hitam",
            "Random",
            "Hitam",
            "Putih"
    };

    private static String[] productPrice ={
            "Rp 70.000",
            "Rp 70.000",
            "Rp 70.000",
            "Rp 70.000",
            "Rp 65.000",
            "Rp 65.000",
            "Rp 65.000",
            "Rp 10.000",
            "Rp 45.000",
            "Rp 45.000"
    };

    private static  String[] productRating = {
            "9.5",
            "9.1",
            "9.1",
            "9.3",
            "8.5",
            "8.3",
            "8.7",
            "8.7",
            "8.9",
            "8.5"
    };

    static ArrayList<Products> getListData(){
        ArrayList<Products> list = new ArrayList<>();
        for (int i = 0; i<productNames.length; i++){
            Products products = new Products();
            products.setName(productNames[i]);
            products.setDetail(productDetails[i]);
            products.setPhoto(productImages[i]);
            products.setKode(productCode[i]);
            products.setBahan(productBahan[i]);
            products.setUkuran(productSize[i]);
            products.setWarna(productColor[i]);
            products.setHarga(productPrice[i]);
            products.setRating(productRating[i]);
            list.add(products);
        }
        return list;
    }
}
