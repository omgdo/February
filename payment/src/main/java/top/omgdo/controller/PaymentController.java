package top.omgdo.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import top.omgdo.entity.Payment;
import top.omgdo.entity.Result;
import top.omgdo.service.impl.PaymentServiceImpl;

@RestController
@RequestMapping("/payment")
@Slf4j

public class PaymentController {


    @Autowired
    PaymentServiceImpl paymentService;

    @RequestMapping("/welcome")
    public String welcome(){
        return "welcome from omgdo.";
    }


//    增删改查
    @PostMapping("/order")
    public Result add(@RequestBody Payment payment){
        boolean save = paymentService.save(payment);
        if(save)
            return Result.success(payment);
        else
            return Result.failed(null);
    }

    @DeleteMapping("/order/{id}")
    public Result delete(@PathVariable Integer id){
        boolean b = paymentService.removeById(id);
        if(b)
            return Result.success(null);
        else
            return Result.failed(null);
    }

    @PutMapping("/order")
    public Result update(@RequestBody Payment payment){
        boolean b = paymentService.updateById(payment);
        if(b)
            return Result.success(null);
        else
            return Result.failed(null);
    }

    @GetMapping({"/order","/order/{id}"})
    public Result query(@PathVariable(required = false) Integer id){

        if(id != null){
            return Result.success(paymentService.getById(id));
        }else
            return Result.success(paymentService.list());
    }
}
