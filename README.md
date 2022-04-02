# jd_get_cookie
### 开源的cookie获取软件，简单易用，安卓端
#### Cookie请勿乱泄露，有豆被盗的风险，京换喜买充值卡套现 等等
##### 后期会有更多功能添加

##### 获取某豆细节🖨 POST
https://api.m.jd.com/client.action?functionId=getJingBeanBalanceDetail

##### 获取红包🧧 GET （注意     _传递时间差）
https://m.jingxi.com/user/info/QueryUserRedEnvelopesV2?type=1&orgFlag=JD_PinGou_New&page=1&cashRedType=1&redBalanceFlag=1&channel=1&_=我是一个时间戳&sceneval=2&g_login_type=1&g_ty=ls

##### 红包总额和某豆总额👜 GET （要带上设备UA信息COOKIE）
https://me-api.jd.com/user_new/info/GetJDUserInfoUnion
Cookie:pt_key=*********;pt_pin=************;User-Agent=jdapp;Android;


##### 豆总额 名称 注册时间和IP 某享值 最近登录IP🕶 GET （注意     timestamp传递时间差）
https://wxapp.m.jd.com/kwxhome/myJd/home.json?&useGuideModule=0&bizId=&brandId=&fromType=wxapp&timestamp=我是一个时间戳

本软件仅供学习与研究, 📠Twitter@Mrdingshen
