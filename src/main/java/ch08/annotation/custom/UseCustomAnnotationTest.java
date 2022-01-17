package ch08.annotation.custom;

import java.lang.reflect.Field;
import java.util.HashMap;
import java.util.Map;

public class UseCustomAnnotationTest {

  public static void main(String[] args) throws IllegalAccessException {
    CustomPropSet cps = new CustomPropSet();
    Map<String, Object> dbProp = new HashMap<>();
    Map<String, Object> webProp = new HashMap<>();

    Field[] fields = CustomPropSet.class.getDeclaredFields();
    for ( Field field : fields) {
      MyPropLabel annotation = field.getDeclaredAnnotation(MyPropLabel.class);
      if ( field.get(cps) == null) {
        field.set(cps, annotation.strDefault());
      }
      if ( annotation.value().equals("web")) {
        webProp.put(field.getName(), field.get(cps));
      } else {
        dbProp.put(field.getName(), field.get(cps));
      }
    }
    System.out.printf("DB 관련 변수: %s%n", dbProp);
    System.out.printf("WEB 관련 변수: %s%n", webProp);
  }

}
