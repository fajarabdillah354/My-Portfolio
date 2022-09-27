package LatihanMembuatTodolist.Repository;

import LatihanMembuatTodolist.entities.ListLomba;

public class LombaRepositoryImpl implements LombaRepository{

  public ListLomba[] data = new ListLomba[10];


  @Override
  public ListLomba[] getAll() {
    return data;
  }


  /*
  pengecekan apakan masih data sudah penuh
   */
  public boolean isFull(){
    var isFull = true;
    for (var i = 0;i< data.length;i++){
      //jika ternyata masih ada data yang kosong
      if (data[i] == null){
        isFull = false;
        break;
      }
    }
    return true;
  }

  public void resize(){
    if (isFull()){
      var temp = data;
      data = new ListLomba[(data.length)*2 ];
      for (var i = 0;i< temp.length;i++){
        data[i] = temp[i];
      }
    }

  }



  @Override
  public void menambahLomba(ListLomba listLomba) {
    resize();

    /*
    menambah data jika masih ada yang kosong
     */
    for(var i = 0;i< data.length;i++){
      if (data[i] == null){
        data[i] = listLomba;
        break;
      }
    }

  }

  @Override
  public boolean menghapusLomba(Integer number) {
    if ((number - 1) >= data.length) {
      return false;
    } else if (data[number - 1] == null) {
      return false;
    } else {
      for (int i = (number-1);i< data.length;i++){
        if (i==(data.length-1)){
          data[i] = null;
        }else {
          data[i] = data[i+1];
        }
      }
    }

      return true;
    }



  }

