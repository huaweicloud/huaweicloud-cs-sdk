#  Huawei Cloud CS SDK for Scala and Java

The Huawei Cloud CS Sdk enables Scala and Java developers to easily work with [Huawei Cloud CS](http://www.huaweicloud.com/en-us/product/cs.html). You can get started in minutes using **Maven** or **sbt**.

Quick links:

- [SDK Homepage](http://developer.huaweicloud.com/dev/sdk?all)
- [issue](https://github.com/huaweicloudsdk/huaweicloud-cs-sdk/issues)
- [CS Homepage](http://www.huaweicloud.com/en-us/product/cs.html), or Chinese language site [实时流计算服务](http://www.huaweicloud.com/product/cs.html)

##  SDK

- **huaweicloud-cs-java-sdk** is for Java 
- **huaweicloud-cs-scala-sdk** is for Scala

##  Deploy to OSS

```
GPG_TTY=$(tty);export GPG_TTY;mvn clean deploy -Dgpg.passphrase=xxxx
```

add the `distributionManagement` to the pom. # todo add deploy script 

```
<distributionManagement>
    <snapshotRepository>
        <id>oss-snapshot</id>
        <url>https://oss.sonatype.org/content/repositories/snapshots</url>
    </snapshotRepository>
    <repository>
        <id>oss-release</id>
        <url>https://oss.sonatype.org/service/local/staging/deploy/maven2/</url>
    </repository>
</distributionManagement>
```

## User authorization

Before invoking CS SDK, you need to use `\src\main\java\com\huaweicloud\cs\utils` to get user token or ak/sk authorization info.

- get user authorization to a JSON object which includes token and ak/sk

For example:
```java
...
import com.huaweicloud.cs.utils.UserAuthUtil;
import org.json.JSONObject;
...
JSONObject authObject = userAuthUtil.getUserAuth(
                csConfig.get("DomainName", null), // domain name for Logging console
                csConfig.get("UserName", null),   // user name for Logging console
                csConfig.get("Password", null),   // password for Logging console
                csConfig.get("ProjectId", null)); // project ID getting from project list in user credential
                
String token = authObject.getString("token");

ApiClient client = new ApiClient();
client.setVerifyingSsl(false);
client.setBasePath("https://cs.cn-north-1.myhuaweicloud.com/v1.0");
//client.setToken("token");
client.setAksk("southchina", "SKZEZMYRC28NC9LY9UIY", "V1zmJzG5LuxGwNvGMqqKTF0bWTD3AEXc3Fkrab8w");
JobApi jobapi = new JobApi(client);
...
```

##  Licence

[Apache License 2.0](https://www.apache.org/licenses/LICENSE-2.0.html)
