paket  sesi11 ;

 kelas  publik Percobaan4 {
    public  static  void  main ( String [] args ) {
        int  bil = 10 ;
        String  b []={ "a" , "b" , "c" };
        
        coba {
            Sistem . keluar . println ( bil / 0 );
            Sistem . keluar . println ( b [ 3 ]);
        }
        
        tangkap ( ArithmeticException  e ){
            Sistem . keluar . println ( "Terjadi kesalahan Aritmatika" );
        }
        tangkap ( ArrayIndexOutOfBoundsException  e ){
            Sistem . keluar . println ( "Melebihi jumlah array" );
        }
        tangkap ( Pengecualian  e ){
            Sistem . keluar . println ( "Ini menghandle error yang terjadi" );
        }
    }
}
