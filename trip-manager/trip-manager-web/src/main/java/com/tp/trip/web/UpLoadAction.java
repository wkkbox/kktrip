package com.tp.trip.web;


        import com.tp.trip.service.UpLoadService;
        import org.apache.commons.io.IOUtils;
        import org.springframework.beans.factory.annotation.Autowired;
        import org.springframework.stereotype.Controller;
        import org.springframework.web.bind.annotation.RequestMapping;
        import org.springframework.web.bind.annotation.RequestMethod;
        import org.springframework.web.bind.annotation.RequestParam;
        import org.springframework.web.bind.annotation.ResponseBody;
        import org.springframework.web.multipart.MultipartFile;

        import javax.servlet.http.HttpServletRequest;
        import javax.servlet.http.HttpServletResponse;
        import java.io.InputStream;
        import java.util.Map;

/**
 * User: Administrator
 * Date: 2017/11/17
 * Time: 14:40
 * Version:V1.0
 */
@Controller
public class UpLoadAction {

    @Autowired
    private UpLoadService upLoadService;

    @RequestMapping(value = "file/upload",method = RequestMethod.GET)
    /*此处返回值为void时  就类似操作servlet 此处个人用request 不如用 String  因为确定来的参数是config*/
    public void config(@RequestParam("action") String action, HttpServletResponse response, HttpServletRequest request) throws Exception{
        /*此处不理解为什么设置字符集 明明在web.xml中设置过字符集*/
        response.setContentType("application/json");
        if ("config".equals(action)){

            InputStream is = this.getClass().getClassLoader().getResourceAsStream("config.json");
            IOUtils.copy(is,response.getWriter(),"utf-8");
        }
    }

    @ResponseBody
    @RequestMapping(value = "file/upload",method = RequestMethod.POST)
    public Map<String,Object> upload(@RequestParam("upfile") MultipartFile multipartFile){
        return upLoadService.upload(multipartFile);
    }
}


