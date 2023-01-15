paket  sesi11 ;

 kelas  publik Percobaan1 {

    public  static  void  main ( String [] args ) {
        int  a [] = int baru  [ 5 ];
        coba {
            a [ 5 ] = 100 ;
        } tangkap ( Pengecualian  e ) {
            Sistem . keluar . println ( "Terjadi pelanggaran memori" );
        }
    }
}
