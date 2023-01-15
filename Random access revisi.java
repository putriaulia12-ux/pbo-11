paket  sesi11 ;

impor  jawa . io . IOException ;
impor  jawa . io . FileAcakAkses ;

 kelas  publik RandomAccessRevisi {
    
    public  static  void  main ( String [] args ) {
        String  bookList [] = { "Satu" , "Dua" , "Tiga" };
        int  Daftar tahun [] = { 1920 , 1230 , 1940 };
        
        coba {
            
             Buku RandomAccessFile = RandomAccessFile baru  ( "books.txt" , "rw" );
            untuk ( int  i = 0 ; i < 3 ; i ++){
                buku . writeUTF ( daftarbuku [ i ]);
                buku . writeInt ( daftartahun [ i ]);
            }

            buku . mencari ( 0 );
            Sistem . keluar . println ( books .readUTF () + " " + books .readInt ( ) );
            Sistem . keluar . println ( books .readUTF () + " " + books .readInt ( ) );
            buku . tutup ();
        }

        tangkap ( IOException  e ){
            Sistem . keluar . println ( "Indeks melebihi batas" );
        }
        Sistem . keluar . println ( "tes" );
    }
}
