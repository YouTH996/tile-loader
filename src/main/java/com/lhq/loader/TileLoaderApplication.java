package com.lhq.loader;

import javax.swing.JFrame;
import javax.swing.SwingUtilities;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.data.mongo.MongoDataAutoConfiguration;
import org.springframework.boot.autoconfigure.mongo.MongoAutoConfiguration;

import com.lhq.loader.client.BrowserClient;

/**
 * @author lhq
 *
 */
//@SpringBootApplication
//去掉mongo的自动化配置
@SpringBootApplication(exclude = { MongoDataAutoConfiguration.class, MongoAutoConfiguration.class })
public class TileLoaderApplication {

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> BrowserClient.setjFrame(new JFrame()));
        SpringApplication.run(TileLoaderApplication.class, args);
    }

}
