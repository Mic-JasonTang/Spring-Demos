package com.sunshine.springmvc.basic;

import org.apache.commons.io.FileUtils;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.io.IOException;

/**
 * Spring-Demos
 * <p>
 * Created by JasonTang on 1/20/2017 2:55 PM.
 */
@RestController
public class MvcController {

    @RequestMapping("/index")
    public String index() {
        System.out.println("MvcController.index");
        return "index";
    }

    @RequestMapping(value = "/upload", method = RequestMethod.POST)
    public @ResponseBody String upload(MultipartFile file) {
        try {
            FileUtils.writeByteArrayToFile(new File("f:/" + file.getOriginalFilename()), file.getBytes());
            return "ok";
        } catch (IOException e) {
            e.printStackTrace();
            return "error";
        }
    }

}
