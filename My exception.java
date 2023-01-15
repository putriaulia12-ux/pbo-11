paket  sesi11 ;

 kelas  publik MyException  memperluas  Pengecualian {
    
     Teks String  pribadi ;
    
    MyException ( String  s ){
        Teks = "Pengecualian dihasilkan oleh: " + s ;
        Sistem . keluar . println ( Teks );
    }
}

kelas  Ekssepsi {

    static  void  tampil ( String  s ) throws  Exception {
        Sistem . keluar . println ( "Tampil" );
        
        if ( s . sama dengan ( "amir" )){
            lempar  MyException baru  ( s );
        }
        Sistem . keluar . println ( "Baik!" );
    }

    public  static  void  main ( String [] args ) melempar  Pengecualian {

        coba {
            tampil ( "ali" );
            tampil ( "amir" );
        }
        tangkap ( MyException  ex ){
            Sistem . keluar . println ( "Tangkap : " + ex );
        }
    }
}
