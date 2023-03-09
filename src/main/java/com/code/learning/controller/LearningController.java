package com.code.learning.controller;

import com.code.learning.dto.LearningDTO;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;
@RestController
@RequestMapping("api")
public class LearningController {

    @GetMapping("/learn")
    public ResponseEntity<List<LearningDTO>> getLearningResponse(){
        LearningDTO learningDTO = LearningDTO.builder().title("Learning Object").build();
        List<LearningDTO> list = new ArrayList<>();
        list.add(learningDTO);
        return ResponseEntity.ok(list);
    }
}
