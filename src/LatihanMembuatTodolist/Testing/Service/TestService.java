package LatihanMembuatTodolist.Testing.Service;

import LatihanMembuatTodolist.Repository.LombaRepository;
import LatihanMembuatTodolist.Repository.LombaRepositoryImpl;
import LatihanMembuatTodolist.Service.ServiceLomba;
import LatihanMembuatTodolist.Service.ServiceLombaImpl;
import LatihanMembuatTodolist.entities.ListLomba;

public class TestService {
  public static void main(String[] args) {
    testMenghapusLomba();
  }


  public static void testMenampilkanLomba(){
    LombaRepositoryImpl lombaRepository = new LombaRepositoryImpl();
    lombaRepository.data[0] = new ListLomba("Lomba balap karung");
    lombaRepository.data[1] = new ListLomba("Lomba balap kelereng");
    lombaRepository.data[2] = new ListLomba("Lomba balap bakiak");


    ServiceLomba serviceLomba = new ServiceLombaImpl(lombaRepository);
    serviceLomba.tampilkanMenu();



  }

  public static void testMenambahLomba(){
    LombaRepository lombaRepository = new LombaRepositoryImpl();
    ServiceLomba serviceLomba = new ServiceLombaImpl(lombaRepository);
    testMenampilkanLomba();
    serviceLomba.tambahLomba("Lomba keprokbantal");
    serviceLomba.tambahLomba("Lomba panjat pinang");
    serviceLomba.tampilkanMenu();

  }

  public static void testMenghapusLomba(){
    LombaRepository lombaRepository = new LombaRepositoryImpl();
    ServiceLomba serviceLomba = new ServiceLombaImpl(lombaRepository);
    serviceLomba.tambahLomba("Lomba keprokbantal");
    serviceLomba.tambahLomba("Lomba panjat pinang");
    serviceLomba.tambahLomba("Lomba balap karung");
    serviceLomba.tambahLomba("Lomba balap kelereng");
    serviceLomba.tambahLomba("Lomba balap bakiak");
    serviceLomba.tampilkanMenu();
    serviceLomba.hapusLomba(2);
    serviceLomba.tampilkanMenu();


  }


}
