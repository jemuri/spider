package com.spider.song.spiderquartz.task;

import com.spider.song.spiderquartz.logic.SpiderHome;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created with IntelliJ IDEA.
 * Description:人民大学经济学院网站更新spider
 * User: songzhengjie
 * Date: 2018-01-31
 * Time: 17:23
 */
@Service
public class RenMinWebNoticeSpider {

    private Logger logger = LoggerFactory.getLogger(this.getClass().getSimpleName());

    @Autowired
    private SpiderHome spiderHome;

    /**
     * Callback used to run the bean.
     *
     * @param
     * @throws Exception on error
     */
    public void runSpider(String url) throws Exception {


        logger.debug("runSpider::url = [{}]",url);
        //String url = "http://econ.ruc.edu.cn/more_news.php?cid=10854";
        try {
            new SpiderHome().spiderRobot(url);
        } catch (Exception e) {
            logger.error("runSpider捕捉到异常:{}",e);
            throw e;
        }
    }
}
