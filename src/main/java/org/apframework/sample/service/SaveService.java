package org.apframework.sample.service;

import org.apache.dubbo.config.annotation.Service;
import org.apframework.sample.api.ISave;
import org.apframework.sample.feign.ContributorsClient;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * @Author: Shoukai Huang
 * @Date: 2019/6/4 21:37
 */
@Service(version = "1.0.0", timeout = 3000, dynamic = true)
public class SaveService implements ISave {

    @Autowired
    private ContributorsClient contributorsClient;

    @Override
    public String save() {
        return "save done";
    }
}
