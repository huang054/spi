package spi.annotation;

import java.lang.annotation.*;

@Documented
@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.TYPE})
public @interface HuangSpi {
    /**
     * 缺省扩展点名。
     */
  String value() default "";
}
