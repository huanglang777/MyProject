package com.atguigu.crowd.handler;

import com.atguigu.crowd.entity.po.MemberPO;
import com.atguigu.crowd.service.api.MySQLRemoteService;
import com.codingapi.tx.annotation.TxTransaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author: MI
 * @CreateTime: 2020-05-15 00:47
 * @Description:
 */

@RestController
public class txLcnTestHandler {

    @Autowired
    private MySQLRemoteService mySQLRemoteService;

    @TxTransaction(isStart = true)
    @Transactional(rollbackFor = Exception.class)
    @RequestMapping("/test/save")
    public String save(@RequestParam String loginacct , @RequestParam String userpswd){
        MemberPO memberPO = new MemberPO();
        memberPO.setLoginacct(loginacct);
        memberPO.setUserpswd(userpswd);

        mySQLRemoteService.saveMember(memberPO);

        int i = 9 / 0;

        return "success";
    }
}
