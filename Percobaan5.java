paket  sesi11 ;

 kelas  publik Percobaan5 {
    public  static  void  main ( String [] args ) {
        int  bil = 10 ;
        
        coba {
            Sistem . keluar . println ( bil / 0 );
        }
        tangkap ( ArithmeticException  e ){
            Sistem . keluar . print ( "Pesan Error: " );
            Sistem . keluar . println ( e .getMessage ( ));
            Sistem . keluar . println ( "Info stack hapus" );
            e . printStackTrace ();
            e . printStackTrace ( System .out ) ;
        }
        tangkap ( Pengecualian  e ){
            Sistem . keluar . println ( "Ini menghandle error yang terjadi" );
        }   
    }
}
