paket  sesi11 ;

 kelas  publik RangeErrorException  meluas  Throwable {

    publik  RangeErrorException ( String  s ){
        super ( s );
    }
    
    public  static  void  main ( String [] args ){
        int  posisi = 1 ;
        
        coba {
            jika ( posisi > 0 ){
                lempar  RangeErrorException baru  ( "Posisi" + posisi );
            }
        }
        tangkap ( RangeErrorException  e ){
            Sistem . keluar . println ( "Range error: " + e .getMessage ( ));
        }
        
        Sistem . keluar . println ( "Ini adalah program terakhir." );
    }

}
