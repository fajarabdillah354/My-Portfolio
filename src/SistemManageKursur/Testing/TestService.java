package SistemManageKursur.Testing;

import SistemManageKursur.Repository.DataRepository;
import SistemManageKursur.Repository.DataRepositoryImpl;
import SistemManageKursur.Service.ServiceKursus;
import SistemManageKursur.Service.ServiceKursusImpl;

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
