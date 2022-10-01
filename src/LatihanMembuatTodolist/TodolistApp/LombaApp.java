package LatihanMembuatTodolist.TodolistApp;

import LatihanMembuatTodolist.Repository.LombaRepository;
import LatihanMembuatTodolist.Repository.LombaRepositoryImpl;
import LatihanMembuatTodolist.Service.ServiceLomba;
import LatihanMembuatTodolist.Service.ServiceLombaImpl;
import LatihanMembuatTodolist.View.ViewLomba;

public class LombaApp {

  public static void main(String[] args) {
    LombaRepository lombaRepository = new LombaRepositoryImpl();
    ServiceLomba serviceLomba = new ServiceLombaImpl(lombaRepository);
    ViewLomba viewLomba = new ViewLomba(serviceLomba);

    viewLomba.menuLomba();
  }

}
