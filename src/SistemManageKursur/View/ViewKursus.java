package SistemManageKursor.View;

import SistemManageKursor.Service.ServiceKursus;
import SistemManageKursor.Util.InputUtil;

public class ViewKursus {
  ServiceKursus serviceKursus;

  public ViewKursus(ServiceKursus serviceKursus) {
    this.serviceKursus = serviceKursus;
  }


  public void tampilanMenu(){
    while (true){
      System.out.println("*********** Pendaftaran QueenBee Course ***********");
      System.out.println("1. Daftar Siswa");
      System.out.println("2. Daftar instruktur");
      System.out.println("3. Profil QueenBee");

      var input = InputUtil.input("silahkan pilih di atas");
      if (input.equals("1")){
        addSiswa();
      } else if (input.equals("2")) {
        addIns();
      } else if (input.equals("3")) {
        profil();
      }else {
        System.out.println("maaf pilihan anda tidak tersedia");
      }
    }
  }


  public void addSiswa(){
    System.out.println("********* Mendaftar Siswa *********");
    var daftar = InputUtil.input("pilih x jika ingin batal "){
  }

  public void addIns(){

  }

  public void profil(){

  }


}
