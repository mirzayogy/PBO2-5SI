package main;

import model.Mahasiswa;
import view.MahasiswaView;

public class Main {
    public static void main(String[] args) {
//        System.out.println("Hello World");
        
        Mahasiswa mahasiswa = new Mahasiswa();
        
        
//        System.out.println(mahasiswa1.getNama());
        
        
//        MahasiswaView mahasiswaView = new MahasiswaView();
//        mahasiswaView.taruhKomponen();
//        mahasiswaView.isiData(mahasiswa1);
//        mahasiswaView.tampil();
        
//        MahasiswaView mahasiswaView = new MahasiswaView();
//        mahasiswaView.taruhKomponen();
//        mahasiswaView.isiData();
//        mahasiswaView.tampil();
//        mahasiswaView.beriEvent();

        Mahasiswa mahasiswa1 = new Mahasiswa("19630002", "DuaPuluh", 20, 2.2);
        mahasiswa1.read();
//        mahasiswa1.create();
//        mahasiswa1.update();
        mahasiswa1.setNpm("19630003");
        mahasiswa1.delete();
        System.out.println("================");
        mahasiswa1.read();
        
    }
}
