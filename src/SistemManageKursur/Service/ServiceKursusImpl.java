package SistemManageKursur.Service;

import SistemManageKursur.Entities.DataInstruktur;
import SistemManageKursur.Entities.DataSiswa;
import SistemManageKursur.Repository.DataRepository;

public class ServiceKursusImpl implements ServiceKursus {

  DataRepository dataRepository;

  public ServiceKursusImpl(DataRepository dataRepository) {
    this.dataRepository = dataRepository;
  }



  @Override
  public void menampilkanSiswa() {
    System.out.println("********** QueenBee Course *********");
    DataSiswa[] dataSis = dataRepository.getSiswaData();
    for (var i = 0 ; i< dataSis.length ; i++){
      var siswa = dataSis[i];
      var no = i+1;
      if (siswa != null){
        System.out.println(no+". "+siswa.getName());
      }
    }

  }

  @Override
  public void menampilkanIns() {
    System.out.println("********** QueenBee Course *********");
    DataInstruktur[] dataInst = dataRepository.getInsData();
    for (var i = 0 ;i<dataInst.length;i++){
      var instruktur = dataInst[i];
      var no = i+1;
      if (instruktur != null){
        System.out.println(no+". "+instruktur.getNameIns());
      }
    }
  }

  @Override
  public void daftarSiswa(String nameSiswa) {
    DataSiswa dataSiswa = new DataSiswa(nameSiswa);
    dataRepository.pendaftaranSiswa(dataSiswa);
    System.out.println("sukses mendaftar Siswa "+nameSiswa);

  }

  @Override
  public void daftarIns(String nameIns) {
    DataInstruktur dataInstruktur = new DataInstruktur(nameIns);
    dataRepository.pendaftaranIns(dataInstruktur);
    System.out.println("sukses mendaftar Instruktur "+nameIns);

  }

  @Override
  public void kurikulum() {
    System.out.println("Kurikulum cecema yaitu sistem belajar cerdas, cermat, mahir");
  }


}
