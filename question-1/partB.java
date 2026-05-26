public String getShortenedName() {
  String shortName = username;
  while(shortName.indexOf("-") > -1) {
  shortName = shortName.substring(0, shortName.indexOf("-")-1) + shortName.substring(shortName.indexOf("-")+1

  }
  return shortName;






}
