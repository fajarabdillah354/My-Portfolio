package LatihanMembuatTodolist.View;

import LatihanMembuatTodolist.InputUtil.InputUtil;
import LatihanMembuatTodolist.Service.ServiceLomba;

public class ViewLomba {

  private ServiceLomba serviceLomba;

  public ViewLomba(ServiceLomba serviceLomba) {
    this.serviceLomba = serviceLomba;
  }

  public void menuLomba(){
    while (true){
      serviceLomba.tampilkanMenu();
      System.out.println("****** MENU ******");
      System.out.println("1. Tambah Daftar Lomba");
      System.out.println("2. Hapus Daftar Lomba");
      System.out.println("X. Keluar");

      var input = InputUtil.inputUser("Silahkan pilih nomor di atas");
      if (input.equals("1")){
        menambahLomba();
      } else if (input.equals("2")) {
        menghapusLomba();
      }else if (input.equals("x")){
        break;
      }else {
        System.out.println("====== MAAF PILIHAN TIDAK TERSEDIA =======");
      }

    }
  }

  public void menambahLomba(){
    System.out.println("****** MENAMBAH LIST LOMBA *******");
    var list = InputUtil.inputUser("masukan list baru(x untuk batal)");
    if (list.equals("x")){
      //batal
    }else {
      serviceLomba.tambahLomba(list);
    }
  }

  public void menghapusLomba(){
    System.out.println("***** MENGHAPUS LIST LOMBA *****");
    var list = InputUtil.inputUser("pilih list yang akan di hapus(x untuk batal)");
    if (list.equals("x")){
      //batal
    }else {
      serviceLomba.hapusLomba(Integer.valueOf(list));
    }
  }

}
