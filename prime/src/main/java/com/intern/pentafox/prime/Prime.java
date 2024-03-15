package com.intern.pentafox.prime;

import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
//primeno program starts here
@RestController
@Component
public class Prime {
  @GetMapping(path = "/prime-no")
  public String prime() {
      int number=20;
      int count = 0;
      for (int i = 1; i <= number; i++) {
          if ((i != 1) && (i != number)) {
              if (number % i == 0) {
                  count++;
              }
          }
      }
      if (count != 0) {
          return "not prime";
      }
      return "prime no";
  }
}
