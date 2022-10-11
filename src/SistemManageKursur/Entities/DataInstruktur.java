package SistemManageKursur.Entities;

public class DataInstruktur {

  private String nameIns;

  @Override
  public String toString() {
    return "DataInstruktur{" +
            "nameIns='" + nameIns + '\'' +
            '}';
  }

  public DataInstruktur(String nameIns) {
    this.nameIns = nameIns;
  }

  public String getNameIns() {
    return nameIns;
  }

  public void setNameIns(String nameIns) {
    this.nameIns = nameIns;
  }



}
