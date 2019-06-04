package org.apframework.sample.feign;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;

/**
 * @Author: Shoukai Huang
 * @Date: 2019/6/4 21:13
 */

@FeignClient(name = "github", url = "https://api.github.com/")
public interface ContributorsClient {

    @RequestMapping(value = "repos/openfeign/feign/contributors", method = RequestMethod.GET)
    List<Contributor> contributors();

}
