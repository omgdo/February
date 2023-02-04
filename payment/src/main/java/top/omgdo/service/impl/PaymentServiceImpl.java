package top.omgdo.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;
import top.omgdo.entity.Payment;
import top.omgdo.mapper.PaymentMapper;
import top.omgdo.service.PaymentService;

@Service
public class PaymentServiceImpl extends ServiceImpl<PaymentMapper, Payment> implements PaymentService {
}
