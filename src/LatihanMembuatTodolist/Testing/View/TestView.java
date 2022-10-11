package LatihanMembuatTodolist.Testing.View;

import LatihanMembuatTodolist.Repository.LombaRepository;
import LatihanMembuatTodolist.Repository.LombaRepositoryImpl;
import LatihanMembuatTodolist.Service.ServiceLomba;
import LatihanMembuatTodolist.Service.ServiceLombaImpl;
import LatihanMembuatTodolist.View.ViewLomba;

public class TestView {

  public static void main(String[] args) {
    testRemoveLomba();
  }

  public static void testShowLomba(){
    LombaRepository lombaRepository = new LombaRepositoryImpl();
    ServiceLomba serviceLomba = new ServiceLombaImpl(lombaRepository);
    ViewLomba viewLomba = new ViewLomba(serviceLomba);

    serviceLomba.tambahLomba("Lomba Balap Kelereng");
    serviceLomba.tambahLomba("Lomba Balap Karung");
    serviceLomba.tambahLomba("Lomba Makan Kerupuk");
    viewLomba.menuLomba();

  }

  public static void testAddLomba(){
    LombaRepository lombaRepository = new LombaRepositoryImpl();
    ServiceLomba serviceLomba = new ServiceLombaImpl(lombaRepository);
    ViewLomba viewLomba = new ViewLomba(serviceLomba);

    viewLomba.menambahLomba();
    viewLomba.menuLomba();
    viewLomba.menambahLomba();
    viewLomba.menuLomba();
  }


  public static void testRemoveLomba(){
    LombaRepository lombaRepository = new LombaRepositoryImpl();
    ServiceLomba serviceLomba = new ServiceLombaImpl(lombaRepository);
    ViewLomba viewLomba = new ViewLomba(serviceLomba);
    viewLomba.menambahLomba();
    viewLomba.menuLomba();

    viewLomba.menambahLomba();
    viewLomba.menuLomba();

    viewLomba.menambahLomba();
    viewLomba.menuLomba();

    viewLomba.menambahLomba();
    viewLomba.menuLomba();

    viewLomba.menghapusLomba();
    viewLomba.menuLomba();

  }

}
