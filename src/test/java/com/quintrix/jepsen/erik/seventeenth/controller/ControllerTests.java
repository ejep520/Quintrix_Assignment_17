package com.quintrix.jepsen.erik.seventeenth.controller;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;

@ExtendWith(SpringExtension.class)
@WebMvcTest(MajorGeneral.class)
class ControllerTests {
  @Autowired
  MockMvc mvc;

  @Test
  void givenNoPathVariables_ReturnDefault() throws Exception {
    mvc.perform(MockMvcRequestBuilders.get("/majorGeneral/")
        .contentType(MediaType.TEXT_HTML)).andExpect(MockMvcResultMatchers.status().isOk())
        .andExpect(MockMvcResultMatchers.forwardedUrl("/static/majorGeneral.html"));
  }

  @Test
  void givenElementsPath_ReturnElements() throws Exception {
    mvc.perform(MockMvcRequestBuilders.get("/majorGeneral/elements")
        .contentType(MediaType.TEXT_HTML)).andExpect(MockMvcResultMatchers.status().isOk())
        .andExpect(MockMvcResultMatchers.forwardedUrl("/static/elements.html"));
  }

  @Test
  void givenMinionsPath_ReturnMinions() throws Exception {
    mvc.perform(MockMvcRequestBuilders.get("/majorGeneral/minions")
        .contentType(MediaType.TEXT_HTML)).andExpect(MockMvcResultMatchers.status().isOk())
        .andExpect(MockMvcResultMatchers.forwardedUrl("/static/minions.html"));
  }

  @Test
  void givenInvalidPath_ReturnDefault() throws Exception {
    mvc.perform(MockMvcRequestBuilders.get("/majorGeneral/foo")
        .contentType(MediaType.TEXT_HTML)).andExpect(MockMvcResultMatchers.status().isOk())
        .andExpect(MockMvcResultMatchers.forwardedUrl("/static/majorGeneral.html"));
  }
}
