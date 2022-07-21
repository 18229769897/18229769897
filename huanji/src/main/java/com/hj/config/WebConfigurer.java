package com.hj.config;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringBootConfiguration;
import org.springframework.context.annotation.Bean;
import org.springframework.data.redis.connection.RedisConnectionFactory;
import org.springframework.data.redis.listener.RedisMessageListenerContainer;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurationSupport;

@SpringBootConfiguration
public class WebConfigurer extends WebMvcConfigurationSupport {
    @Autowired
    private RedisConnectionFactory redisConnectionFactory;

    public WebConfigurer() {
    }

//    @Bean
//    public LoginInterceptor loginInterceptor() {
//        return new LoginInterceptor();
//    }
//
//    public void addInterceptors(InterceptorRegistry registry) {
//        registry.addInterceptor(this.loginInterceptor()).addPathPatterns(new String[]{"/**"}).excludePathPatterns(new String[]{"/user/note", "/user/alinotifyBuyYoudou", "/changeYunBaoAndYouDou/inverstYoudou", "/changeYunBaoAndYouDou/inverstYoudouWx", "/user/login", "/user/register", "/note/note", "/user/alipay", "/qrcode/qrcodePut", "/qrcode/qrcodeAllInfo", "/user/alitiao", "/user/aliToken", "/user/alicode", "/user/aliLogin", "/user/alinotify", "/user/inverstExperiencedMembers", "/user/inverstExperiencedMembersWx", "/user/alinotifychong", "/user/inverstBounds", "/user/ceshi", "shop/aliShopping", "/Train/cha", "/Train/trainStopStation", "/phoneBill/chongSuTou", "/phoneBill/wxchongSuTou", "/Train/pushCarry", "/panic/aliShopping", "/Train/fukuan", "/user/pay", "/order/wxpay", "/weChatPay/testWeChatPay", "/weChatPay/weChatPayResult", "/Train/trainPay", "/user/findPassword", "/weChatPay/weChatPayResult", "/user/weixinLogin", "/user/userPut", "/groupOil/oilRefunds", "/groupOil/oilRefundsFail", "/groupOil/findOrder", "/groupOil/payOil", "/groupOil/findOilStatus", "/groupOil/getData", "/newPhoneBillStage/findAll", "/ofpay/phoneBill/telcheck", "/ofpay/phoneBill/onlineorder", "/ofpay/phoneBill/ordersta", "/ofpay/sinopec/onlineorder", "/ofpay/sinopec/ordersta", "/ofpay/surplus", "/oil/generateOrder", "/oil/cancelOrder", "/oil/payCallbackApi"});
//        registry.addInterceptor(this.loginInterceptor()).addPathPatterns(new String[]{"/user/alizhuan"});
//    }

    public void addCorsMappings(CorsRegistry registry) {
        registry.addMapping("/**").allowedMethods(new String[]{"*"});
    }

    @Bean
    public RedisMessageListenerContainer redisMessageListenerContainer() {
        System.out.println("我是谁的爷爷");
        RedisMessageListenerContainer redisMessageListenerContainer = new RedisMessageListenerContainer();
        redisMessageListenerContainer.setConnectionFactory(this.redisConnectionFactory);
        return redisMessageListenerContainer;
    }

//    @Bean
//    public KeyExpiredListener keyExpiredListener() {
//        System.out.println("我是谁的爸爸");
//        return new KeyExpiredListener(this.redisMessageListenerContainer());
//    }
}
