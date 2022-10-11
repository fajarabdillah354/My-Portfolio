package SistemManageKursur.Repository;

import SistemManageKursur.Entities.DataInstruktur;
import SistemManageKursur.Entities.DataSiswa;

import java.util.Scanner;

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
        System.out.println("******** Biodata *********");
        dateSiswa[i] = dataSiswa;
        System.out.println("Name : "+dateSiswa[i].getName());
        bioSiswa();
        break;
      }
    }
  }

  public String bioSiswa(){
    Scanner scanner = new Scanner(System.in);
    System.out.print("Umur : ");
    String inputUmur = scanner.nextLine();
    System.out.print("Jenis Kelamin : ");
    String inputKelamin = scanner.nextLine();
    System.out.print("Domisili : ");
    String inputDom = scanner.nextLine();
    return "Sukses mengisi data diri";
  }

  @Override
  public void pendaftaranIns(DataInstruktur dataInstruktur) {
    resize();

    for (var i = 0;i< dataInstrukturs.length;i++){
      if (dataInstrukturs[i] == null){
        System.out.println("******** Biodata *********");
        dataInstrukturs[i] = dataInstruktur;
        System.out.println("Nama : "+dataInstrukturs[i].getNameIns());
        bioIns();
        break;
      }
    }

  }

  public String bioIns(){
    Scanner scanner = new Scanner(System.in);
    System.out.print("Umur : ");
    String inputUmur = scanner.nextLine();
    System.out.print("Jenis Kelamin : ");
    String inputKelamin = scanner.nextLine();
    System.out.print("Asal Universitas : ");
    String inputUniv = scanner.nextLine();
    return "Sukses mengisi data diri";
  }


}
