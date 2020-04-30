public class Main {
    public static void main(String[] args) {

        //instance
        Ramadhan people1 = new Ramadhan();
        Ramadhan people2 = new Ramadhan();
        Ramadhan people3 = new Ramadhan();
        Ramadhan people4 = new Ramadhan();
        Ramadhan people5 = new Ramadhan();


        //people1
        people1.hambaAllah = "Bunga";
        people1.pahala = 1000;
        people1.derajat = "Langit ke 1";
        people1.ujianHidup = "Coding Java Error semingguan";
        people1.Rezeki = "Menang Give Away Iphone X ProMax";


        //people2
        people2.hambaAllah = "Dea";
        people2.pahala = 5000;
        people2.derajat = "Langit ke 7";
        people2.ujianHidup = "Gagal lolos seleksi cpns";
        people2.Rezeki = "Menikah dengaan kekasih hati";


        //people3
        people3.hambaAllah = "Erma";
        people3.pahala = 2500;
        people3.derajat = "Langit ke 3";
        people3.ujianHidup = "Uang jajan mogok";
        people3.Rezeki = "dapat nilai A matkul PBO";


        //people4
        people4.hambaAllah = "Aulia";
        people4.pahala = 3500;
        people4.derajat = "Langit ke 4";
        people4.ujianHidup = "ditetapkan sebagai ODP, karena nekat mudik";
        people4.Rezeki = "Dapat Angpao dari keluarga";


        //people5
        people5.hambaAllah = "Ghina";
        people5.pahala = 4000;
        people5.derajat = "Langit ke 5";
        people5.ujianHidup = "kebocoran ban sepeda motor";
        people5.Rezeki = "dibelikan motor baru";


        System.out.println(people1.hambaAllah);
        people1.sholatTarawih();
        System.out.println(people1.pahala);
        people1.sedekah(people2);
        System.out.println(people1.pahala);
        people1.sholatTahajjud();
        System.out.println(people1.pahala);
        people1.puasa();
        System.out.println(people1.pahala);
        people1.bacaQuran();
        System.out.println(people1.pahala);

        System.out.println("----------------------------------------");


        System.out.println(people2.hambaAllah);
        people2.sedekah(people3);
        System.out.println(people2.Rezeki);
        people2.bacaQuran();
        System.out.println(people2.Rezeki);
        people2.sholatTahajjud();
        System.out.println(people2.Rezeki);
        people2.sholatTarawih();
        System.out.println(people2.Rezeki);
        people2.puasa();
        System.out.println(people2.Rezeki);

        System.out.println("----------------------------------------");
        System.out.println(people3.hambaAllah);
        people3.sedekah(people5);
        System.out.println(people3.ujianHidup);
        people3.bacaQuran();
        System.out.println(people3.ujianHidup);
        people3.sholatTahajjud();
        System.out.println(people3.ujianHidup);
        people3.sholatTarawih();
        System.out.println(people3.ujianHidup);
        people3.puasa();
        System.out.println(people3.ujianHidup);

        System.out.println("----------------------------------------");
        System.out.println(people4.hambaAllah);
        people4.sholatTarawih();
        System.out.println(people4.pahala);
        people4.sedekah(people1);
        System.out.println(people4.pahala);
        people4.sholatTahajjud();
        System.out.println(people4.pahala);
        people4.puasa();
        System.out.println(people4.pahala);
        people4.bacaQuran();
        System.out.println(people4.pahala);

        System.out.println("----------------------------------------");
        System.out.println(people5.hambaAllah);
        people5.sedekah(people2);
        System.out.println(people5.Rezeki);
        people5.bacaQuran();
        System.out.println(people5.Rezeki);
        people5.sholatTahajjud();
        System.out.println(people5.Rezeki);
        people5.sholatTarawih();
        System.out.println(people5.Rezeki);
        people5.puasa();
        System.out.println(people5.Rezeki);

    }
}

