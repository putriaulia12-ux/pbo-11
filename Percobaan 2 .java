paket  sesi11 ;

 kelas  publik Percobaan2 {
    public  static  void  main ( String [] args ) {
        int  i = 0 ;
         Salam string [] = {
            "Halo Dunia!" ,
            "Tidak, maksudku itu!" ,
            "HALO DUNIA"
        };

        sementara ( i < 4 ){
            coba {
                Sistem . keluar . println ( salam [ i ]);
                saya ++;
            } tangkap ( ArrayIndexOutOfBoundsException  e ) {
                Sistem . keluar . println ( e );
                saya = 0 ;
                // perulangan berjalan brrr!!
            }
        }
    }
}
