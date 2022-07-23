package krx.ldx.fil.domain.enums;

public enum TestType {

  CANCEL("01", "취소"),
  RETURN("02", "반품"),
  CANCEL_BY_SELLER("03", "판매자취소");

  private String code;
  private String name;

  TestType(String code, String name) {
    this.code = code;
    this.name = name;
  }

  public String getCode() {
    return code;
  }

  public String getName() {
    return name;
  }
}