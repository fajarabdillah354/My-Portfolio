package SistemManageKursor.Repository;

import SistemManageKursor.Entities.DataInstruktur;
import SistemManageKursor.Entities.DataSiswa;

public class DataRepositoryImpl implements DataRepository{

  public DataSiswa[] dateSiswa = new DataSiswa[10];
  public DataInstruktur[] dataInstrukturs = new DataInstruktur[10];


  @Override
  public DataInstruktur[] getInsData() {
    return dataInstrukturs;
  }

  @Override
  public DataSiswa[] getSiswaData() {
    return dateSiswa;
  }

  /*
  pendaftaran instruktur
   */
  public boolean cekIsfull(){
    boolean isfull = true;
    for (var i = 0;i<dataInstrukturs.length;i++){
      if (dataInstrukturs[i] == null){
        isfull = false;
        break;
      }
    }
    return true;
  }


  //resize
  public void resize(){
    if (cekIsfull()){
      var temp = dataInstrukturs;
      dataInstrukturs = new DataInstruktur[(dataInstrukturs.length*2)];
      for (var i = 0;i< temp.length;i++){
        dataInstrukturs[i] = temp[i];
      }
    }
  }


  @Override
  public void pendaftaranSiswa(DataSiswa dataSiswa) {
    resize();
    for (var i = 0;i<dateSiswa.length;i++){
      if (dateSiswa[i] == null){
        dateSiswa[i] = dataSiswa;
        break;
      }
    }
  }

  @Override
  public void pendaftaranIns(DataInstruktur dataInstruktur) {
    resize();

    for (var i = 0;i< dataInstrukturs.length;i++){
      if (dataInstrukturs[i] == null){
        dataInstrukturs[i] = dataInstruktur;
        break;
      }
    }

  }


}
