package top.lldwb.authorityManagement.controller;

import org.nf.web.annotation.RequestMapping;
import org.nf.web.servlet.View;
import org.nf.web.servlet.view.JsonView;

/**
 * @author 安然的尾巴
 * @version 1.0
 */
public class CityInfoController extends BaseController{
    @RequestMapping("/CityInfo/getCityInfo")
    public View getCityInfo(){
        return new JsonView(success());
    }
    @RequestMapping("/CityInfo/getCityInfoByCityName")
    public View getCityInfoByCityName(){
        return new JsonView(success());
    }
}
