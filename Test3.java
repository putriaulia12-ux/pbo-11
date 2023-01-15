paket  sesi11 ;

impor  jawa . io .*;

 kelas  publik Test3 {
    
     metode kekosongan  publikA (){
        Sistem . keluar . println ( "Metode A" );
    }

     metode kekosongan  publikB (){
        Sistem . keluar . println ( 20 / 0 );
        Sistem . keluar . println ( "Metode B" );
    }
}

kelas  Utama {
    public  static  void  main ( String [] args ){
        Tes3  o = Tes3 baru  ();
        o . metodeA ();
    
        coba {
            o . metodeB ();

        } tangkap ( Pengecualian  e ) {
            Sistem . keluar . println ( "Kesalahan pada metode B" );
            Sistem . keluar . println ( e .getMessage ( ));
        }
        akhirnya {
            Sistem . keluar . println ( "selalu dicetak" );
        }
    }
}
