package SistemManageKursur.Entities;

public class DataSiswa {

  private String name;

  @Override
  public String toString() {
    return "DataSiswa{" +
            "name='" + name + '\'' +
            '}';
  }

  public DataSiswa(String name) {
    this.name = name;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }


}
