package SistemManageKursur.Repository;

import SistemManageKursur.Entities.DataInstruktur;
import SistemManageKursur.Entities.DataSiswa;

public interface DataRepository {

  DataInstruktur[] getInsData();

  DataSiswa[] getSiswaData();

  void pendaftaranSiswa(DataSiswa dataSiswa);

  void pendaftaranIns(DataInstruktur dataInstruktur);


}
