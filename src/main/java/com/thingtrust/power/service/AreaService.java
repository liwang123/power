package com.thingtrust.power.service;



import com.thingtrust.power.data.AreaRepository;
import com.thingtrust.power.data.UserRepository;
import com.thingtrust.power.domain.Area;
import com.thingtrust.power.domain.User;
import com.thingtrust.power.domain.example.UserExample;
import com.thingtrust.power.entity.UserEntity;
import org.apache.commons.codec.digest.DigestUtils;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AreaService {

    @Autowired
    private AreaRepository areaRepository;

    public void insertArea(final Area area) {
        areaRepository.insert(area);
    }

    public void updateArea(Area area){
        areaRepository.updateById(area);
    }

    public List<Area> queryAll(){
        return areaRepository.selectByExample(null);
    }

    public void delete(int id){
        areaRepository.deleteById(id);
    }

    public Area queryOne(int id){
        return areaRepository.selectById(id);
    }
}
