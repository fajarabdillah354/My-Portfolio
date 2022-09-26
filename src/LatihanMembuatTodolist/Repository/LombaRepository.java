package LatihanMembuatTodolist.Repository;

import LatihanMembuatTodolist.entities.ListLomba;

public interface LombaRepository {

  ListLomba[] getAll();

  void menambahLomba(ListLomba listLomba);

  boolean menghapusLomba(Integer number);



}
