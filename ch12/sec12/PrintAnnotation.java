package ch12.sec12;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target({ElementType.METHOD}) // 대상 -> 여기서는 메소드만
@Retention(RetentionPolicy.RUNTIME) //
public @interface PrintAnnotation { //@interface 별칭
	String value() default "-"; // 어노테이션의 필드 기본값(별도 설정없으면 사용)
	int number() default 15; // 어노테이션의 필드 기본값(별도 설정없으면 사용)
}