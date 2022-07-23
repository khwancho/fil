package krx.ldx.fil.controller;

import io.swagger.annotations.Api;
import io.swagger.v3.oas.annotations.Operation;
import krx.ldx.fil.domain.entity.Test;
import krx.ldx.fil.repository.TestRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@Api(tags = {"Message"})
@RestController
public class TestController {

    @Autowired
    private TestRepository testRepository;

    @Operation(summary  = "테스트", description  = "String return")
    @GetMapping("/StringTest")
    public ResponseEntity<String> test (@RequestParam String string){
        return ResponseEntity.ok("return value = " + string);
    }

    @Operation(summary  = "테스트", description  = "String List return")
    @PostMapping("/StringTestList")
    public ResponseEntity testList (@RequestParam String string){
        List<Test> list = testRepository.findAll();
        return ResponseEntity.ok(list);
    }
}
