package com.thingtrust.power.rest;



import com.thingtrust.power.common.model.ResponseResult;
import com.thingtrust.power.domain.Area;
import com.thingtrust.power.entity.UserEntity;
import com.thingtrust.power.service.AreaService;
import com.thingtrust.power.service.UserService;
import com.thingtrust.power.util.ImageUtils.Captcha;
import com.thingtrust.power.util.ImageUtils.GifCaptcha;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.util.List;

@RestController
@RequestMapping("/v1/area")
public class AreaController {

    @Autowired
    private AreaService areaService;

    @PostMapping("/add")
    public ResponseResult add(Area area) {
        areaService.insertArea(area);
        return ResponseResult.success();
    }

    @PostMapping("/update")
    public ResponseResult update(final Area area ) {
        areaService.updateArea(area);
        return ResponseResult.success();
    }

    @GetMapping("/query-all")
    public ResponseResult queryAll(){
        List<Area> areaList = areaService.queryAll();
        return ResponseResult.success(areaList);
    }

    @PostMapping("/remove")
    public ResponseResult remove(int id){
        areaService.delete(id);
        return ResponseResult.success();
    }



}
