package SistemManageKursor.Testing;

import SistemManageKursor.Repository.DataRepository;
import SistemManageKursor.Repository.DataRepositoryImpl;
import SistemManageKursor.Service.ServiceKursus;
import SistemManageKursor.Service.ServiceKursusImpl;

public class TestService {
  public static void main(String[] args) {
    testDaftar();
  }

  public static void testDaftar(){
    DataRepository dataRepository = new DataRepositoryImpl();
    ServiceKursus serviceKursus = new ServiceKursusImpl(dataRepository);

    serviceKursus.daftarIns("fajar");
    serviceKursus.daftarIns("nisa");
    serviceKursus.daftarSiswa("ujeh");
    serviceKursus.daftarSiswa("byran");

    serviceKursus.menampilkanSiswa();
//
  }



}
