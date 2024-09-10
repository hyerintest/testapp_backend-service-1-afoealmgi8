package com.bs1.controller;

import com.bs1.response.ResponseObject;
import com.bs1.service.SampleMyBatisService;
import com.bs1.vo.SampleVo;
import org.springframework.web.bind.annotation.*;
import java.util.concurrent.Callable;
import lombok.RequiredArgsConstructor;

@RestController
@RequiredArgsConstructor
public class SampleMyBatisController {

    private final SampleMyBatisService service;

    @PostMapping(value = "/db-test")
    public Callable<ResponseObject> post(@RequestBody SampleVo vo) {
        return () -> service.post(vo);
    }

    @GetMapping(value = "/db-test")
    public Callable<ResponseObject> get() {
        return () -> service.get();
    }

    @DeleteMapping("/db-test/{id}")
    public Callable<ResponseObject> delete(@PathVariable String id) {
        return () -> service.delete(id);
    }
}
