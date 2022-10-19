package com.quintrix.jepsen.erik.seventeenth.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@Controller
public class MajorGeneral {
  private static final String DEFAULT_MAJOR_GENERAL = "/static/majorGeneral.html";

  @GetMapping(value = "/majorGeneral/", produces = "text/html")
  public String getMajorGeneral() {
    return DEFAULT_MAJOR_GENERAL;
  }

  @GetMapping("/majorGeneral/{id}")
  public String getMajorGeneral(@PathVariable String id) {
    if (id.toLowerCase().startsWith("minion"))
      return "/static/minions.html";
    if (id.toLowerCase().startsWith("elements"))
      return "/static/elements.html";
    return DEFAULT_MAJOR_GENERAL;
  }
}
