package SistemManageKursor.Repository;

import SistemManageKursor.Entities.DataInstruktur;
import SistemManageKursor.Entities.DataSiswa;

public interface DataRepository {

  DataInstruktur[] getInsData();

  DataSiswa[] getSiswaData();

  void pendaftaranSiswa(DataSiswa dataSiswa);

  void pendaftaranIns(DataInstruktur dataInstruktur);


}
