package com.coveros.demo.helloworld;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class HelloWorld {

  public static void main(final String[] args) {
    final DateTimeFormatter dtf = DateTimeFormatter.ofPattern("h:mm:ss a 'on' MMMM d, yyyy'.'");
    final LocalDateTime now = LocalDateTime.now();

    System.out.println("Hello, World! The current time is " + dtf.format(now));

    //当前系统名称
    String OS_NAME = System.getProperty("os.name").toLowerCase();
    System.out.println(OS_NAME);

    //当前系统架构
    String OS_ARCH = System.getProperty("os.arch").toLowerCase();
    System.out.println(OS_ARCH);

    //当前系统内核版本
    String OS_VERSION = System.getProperty("os.version").toLowerCase();
    System.out.println(OS_VERSION);
  }

}
