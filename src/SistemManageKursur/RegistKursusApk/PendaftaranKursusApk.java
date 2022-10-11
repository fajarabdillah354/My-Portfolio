package SistemManageKursur.RegistKursusApk;

import SistemManageKursur.Repository.DataRepository;
import SistemManageKursur.Repository.DataRepositoryImpl;
import SistemManageKursur.Service.ServiceKursus;
import SistemManageKursur.Service.ServiceKursusImpl;
import SistemManageKursur.View.ViewKursus;

public class PendaftaranKursusApk {
  public static void main(String[] args) {
    DataRepository dataRepository = new DataRepositoryImpl();
    ServiceKursus serviceKursus = new ServiceKursusImpl(dataRepository);
    ViewKursus viewKursus = new ViewKursus(serviceKursus);

    viewKursus.tampilanMenu();
  }


}
