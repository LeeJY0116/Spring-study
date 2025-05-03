package hello.core;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.FilterType;

@Configuration
@ComponentScan( // basePackage를 설정하지 않으면 Default 값은 @ComponentScan이 붙은 설정 정보 클래스의 패키지가 시작 위치로 설정됨.
        // 권장하는 방법은 패키지 위치를 지정하지 않고, 설정 정보 클래스의 위치를 프로젝트 최상단에 두는 것이다.
        // 예를 들어 현재 프로젝트에서는 hello.core에 만들면 됨.
//        basePackages = "hello.core",      // 지정한 패키지 하위만 스캔
//        basePackageClasses = AutoAppConfig.class,     // 지정한 클래스의 상위 패키지부터 스캔



        excludeFilters = @ComponentScan.Filter(type = FilterType.ANNOTATION, classes = Configuration.class)
) // ANNOTATION이 Configuration인 걸 제외. 이유는 앞서 연습삼아 만들어뒀던 AppConfig와 TestConfig가 같이 등록되어 충돌이 일어날 수 있기 때문
public class AutoAppConfig {
}
