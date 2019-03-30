package com.ssm.demo.controller;

import com.ssm.demo.entity.Description;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import com.ssm.demo.service.DescriptionService;

import javax.servlet.http.HttpServletRequest;
import java.util.HashMap;
import java.util.Map;

@Controller
@RequestMapping("/description")
public class DescriptionController {
    /**
     *
     */
    @Autowired
    private DescriptionService descriptionService;
    @RequestMapping("/infoByMV")
    public ModelAndView infoByMV(){
        Description description =descriptionService.getLastDescription();
        Map<String,Object> model = new HashMap<String, Object>();
       model.put("description",description);
       return new ModelAndView("description",model);
    }
    public String infoByRequest(HttpServletRequest request){
        Description description=descriptionService.getLastDescription();
        request.setAttribute("description",description);
        return "description";
    }
}
