paket  sesi11 ;

 kelas  publik ThrowExample2 {
    
    public  static  void  main ( String [] args ) {
        coba {
            throw  new  Pengecualian ( "Inilah Pengecualian saya" );
        }

        tangkap ( Pengecualian  e ){
            Sistem . keluar . println ( "Tertangkap Pengecualian" );
            Sistem . keluar . println ( "e.getMessage():" + e .getMessage ( ));
            Sistem . keluar . println ( "e.toString():" + e .toString ( ));
            Sistem . keluar . println ( "e.printStackTrace():" );
            e . printStackTrace ();
        }
    }
}
