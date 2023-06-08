package com.yeyeye.client.proxy;

import cn.hutool.core.map.MapUtil;
import org.springframework.beans.factory.support.BeanDefinitionRegistry;
import org.springframework.context.annotation.ImportBeanDefinitionRegistrar;
import org.springframework.core.type.AnnotationMetadata;

import java.util.Map;

/**
 * @author yeyeye
 * @Date 2023/5/7 20:30
 */
public class ServiceBeanDefinitionRegistry implements ImportBeanDefinitionRegistrar {
    @Override
    public void registerBeanDefinitions(AnnotationMetadata importingClassMetadata, BeanDefinitionRegistry registry) {
        Map<String, Object> attributes = importingClassMetadata.getAnnotationAttributes(RPC.class.getName());
        if (MapUtil.isEmpty(attributes)) {
            return;
        }
        String basePackages = (String) attributes.get("value");
        if (basePackages == null) {
            return;
        }
        //扫描
        RpcScanner rpcScanner = new RpcScanner(registry);
        rpcScanner.addIncludeFilter((metadataReader, metadataReaderFactory) -> true);
        rpcScanner.scan(basePackages);
    }
}
