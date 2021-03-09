package com.sanyau.repair.controller;

import com.alibaba.fastjson.JSONObject;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.sanyau.repair.entity.MasterInfo;
import com.sanyau.repair.mapper.MasterInfoMapper;
import com.sanyau.repair.response.Result;
import com.sanyau.repair.service.IMasterInfoService;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

import java.util.HashMap;

@RestController
@RequestMapping("/repair")
public class WxController {

    @Autowired
    private RestTemplate restTemplate;
    @Autowired
    public IMasterInfoService iMasterInfoService;

    @PostMapping("empower")
    public Result wxEmpower(@RequestParam("code") String code){

        /*章旺的密钥*/
        String appid = "wx3d2375ece34b7285";
        String secret = "6d56ae530c8901c3a462e8e44c017cba";

        String url = "https://api.weixin.qq.com/sns/jscode2session?appid=" +
                appid + "&secret=" +
                secret + "&js_code=" +
                code + "&grant_type=authorization_code";

        String jsonData = this.restTemplate.getForObject(url, String.class);
        if (StringUtils.contains(jsonData,"errcode")){
            //检验出错
            return Result.error().message("授权失败");
        }
        return Result.ok().message("授权成功");
    }

    @PostMapping("sigin")
    public Result signin(@RequestBody JSONObject jsonObject){
        String account = jsonObject.getString("account");
        String password = jsonObject.getString("passord");
        HashMap<String, String> select = new HashMap<>();
        select.put("account", account);
        select.put("passwor", password);
        QueryWrapper<MasterInfo> queryWrapper = new QueryWrapper<>();
        queryWrapper.allEq(select);
        int num = iMasterInfoService.count(queryWrapper);
        if(num == 0){
            return Result.error().message("账号或密码错误");
        }
        HashMap res = new HashMap();
        res.put("账号", account);
        return Result.ok().data(res).message("登录成功");
    }
}
