package LatihanMembuatTodolist.test.Service;

import LatihanMembuatTodolist.Repository.LombaRepository;
import LatihanMembuatTodolist.Repository.LombaRepositoryImpl;
import LatihanMembuatTodolist.Service.ServiceLomba;
import LatihanMembuatTodolist.Service.ServiceLombaImpl;
import LatihanMembuatTodolist.entities.ListLomba;

public class TestService {
  public static void main(String[] args) {
    testMenampilkanLomba();
  }


  public static void testMenampilkanLomba(){
    LombaRepositoryImpl lombaRepository = new LombaRepositoryImpl();
    lombaRepository.data[0] = new ListLomba("Lomba balap karung");
    lombaRepository.data[1] = new ListLomba("Lomba balap kelereng");
    lombaRepository.data[2] = new ListLomba("Lomba balap bakiak");


    ServiceLomba serviceLomba = new ServiceLombaImpl(lombaRepository);
    serviceLomba.tampilkanMenu();



  }

}
