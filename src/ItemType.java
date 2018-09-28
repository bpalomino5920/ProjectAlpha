public enum ItemType {

  // ItemType AUDIO = new ItemType ("AU");
  AUDIO("AU"),
  VISUAL("VI"),
  AUDIO_MOBILE("AM"),
  VISIUAL_MOBILE("VM");

  private final String code;

  ItemType(String code){
    this.code = code;
  }

  public String getCode(){
    return code;
  }

}
