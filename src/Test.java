import java.util.ArrayList;
import java.util.EnumSet;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Test {

  private static final EnumSet<TestEnum> ENUM_SET = EnumSet.allOf(TestEnum.class);

  public void doTest() {

    long allOfBeforeTime = System.currentTimeMillis(); //코드 실행 전에 시간 받아오기
    allOfTest();
    long allOfAfterTime = System.currentTimeMillis(); // 코드 실행 후에 시간 받아오기
    long allOfSecDiffTime = (allOfAfterTime - allOfBeforeTime); //두 시간에 차 계산
    System.out.println("allOf() 시행 시간(ms) : "+allOfSecDiffTime);

    long staticBeforeTime = System.currentTimeMillis(); //코드 실행 전에 시간 받아오기
    allOfStaticTest();
    long staticAfterTime = System.currentTimeMillis(); // 코드 실행 후에 시간 받아오기
    long staticSecDiffTime = (staticAfterTime - staticBeforeTime); //두 시간에 차 계산
    System.out.println("static EnumSet 시행 시간(ms) : "+staticSecDiffTime);

    long beforeTime = System.currentTimeMillis(); //코드 실행 전에 시간 받아오기
    valuesTest();
    long afterTime = System.currentTimeMillis(); // 코드 실행 후에 시간 받아오기
    long secDiffTime = (afterTime - beforeTime); //두 시간에 차 계산
    System.out.println("values() 시행 시간(ms) : "+secDiffTime);
  }

  private void valuesTest() {
    int cnt = 0;
    List<String> enumList = new ArrayList<>();
    do {
      cnt++;
      enumList = Stream.of(TestEnum.values()).map(testEnums -> toString()).collect(Collectors.toList());
    } while (cnt < 10000000);
  }

  private void allOfStaticTest() {
    int cnt = 0;
    List<String> enumList = new ArrayList<>();
    do {
      cnt++;
      enumList = Stream.of(ENUM_SET).map(testEnums -> toString()).collect(Collectors.toList());
    } while (cnt < 10000000);
  }

  private void allOfTest() {
    int cnt = 0;
    List<String> enumList = new ArrayList<>();
    do {
      cnt++;
      enumList = Stream.of(EnumSet.allOf(TestEnum.class)).map(testEnums -> toString()).collect(Collectors.toList());
    } while (cnt < 10000000);
  }
}
