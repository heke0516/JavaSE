package com.itheima.FinalDemo2;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

//家电
@Data
@AllArgsConstructor
@NoArgsConstructor
public class JD implements Switch{
    private String name;
    private boolean status;  //开or关状态，默认是false

    @Override
    public void press() {
        //控制设备开关
        status = !status;
    }
}
