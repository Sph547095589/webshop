 package com.yueqian;



import org.apache.solr.client.solrj.SolrClient;
import org.apache.solr.client.solrj.SolrQuery;
import org.apache.solr.client.solrj.SolrServerException;
import org.apache.solr.client.solrj.response.QueryResponse;
import org.apache.solr.common.SolrDocument;
import org.apache.solr.common.SolrDocumentList;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ImportResource;
import java.io.IOException;


/**
 * Created by dell on 2017/12/5.
 */
@MapperScan("com.yueqian.mapper")
@SpringBootApplication//(exclude={DataSourceAutoConfiguration.class,HibernateJpaAutoConfiguration.class})
@ImportResource(locations = {"classpath:config/applicationContext.xml"})
public class Start {
    public static void main(String[] args) {
        ApplicationContext ac = SpringApplication.run(Start.class , args);
    }
}
