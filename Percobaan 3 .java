paket  sesi11 ;

 kelas  publik Percobaan3 {
    public  static  void  main ( String [] args ) {
        int  bil = 10 ;

        coba {
            Sistem . keluar . println ( bil / 0 );
        }

        tangkap ( ArithmeticException  e )
        {
            Sistem . keluar . println ( "Terjadi kesalahan Aritmatika" );
        }
        
        tangkap ( Pengecualian  e ){
            Sistem . keluar . println ( "Ini menghandle error yang terjadi" );
        }
    }
}
