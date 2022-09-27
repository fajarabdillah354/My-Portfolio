package LatihanMembuatTodolist.Service;

import LatihanMembuatTodolist.Repository.LombaRepository;
import LatihanMembuatTodolist.entities.ListLomba;

public class ServiceLombaImpl implements ServiceLomba{

  private LombaRepository lombaRepository;

  public ServiceLombaImpl(LombaRepository lombaRepository) {
    this.lombaRepository = lombaRepository;
  }

  @Override
  public void tampilkanMenu() {
    System.out.println("==== Lomba 17 Agustus ====");
    ListLomba[] daftar = lombaRepository.getAll();
    for (var i =0;i< daftar.length;i++){
      var lomba = daftar[i];
      var no = i+1;
      if (lomba != null){
        System.out.println(no+". "+lomba.getLomba());
      }
    }

  }

  @Override
  public void tambahLomba(String lomba) {
  ListLomba listLomba = new ListLomba(lomba);
  lombaRepository.menambahLomba(listLomba);
    System.out.println("sukses menambah "+lomba);
  }

  @Override
  public void hapusLomba(Integer number) {
    boolean sukses = lombaRepository.menghapusLomba(number);
    if (sukses){
      System.out.println("sukses menghapus daftar lomba "+number);
    }else{
      System.out.println("gagal menghapus daftar lomba "+number);
    }
  }
}
