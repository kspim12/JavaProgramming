package ch08.annotation.custom;

public class CustomPropSet {
  @MyPropLabel("db")
  String dbHost = "127.0.0.1";
  @MyPropLabel(value="web", strDefault="localhost")
  String serverHost;
  @MyPropLabel("db")
  String dbPort;
  @MyPropLabel(value="web", strDefault="8080")
  String serverPort;
}
