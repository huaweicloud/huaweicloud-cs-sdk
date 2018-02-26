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
import com.google.gson.JsonObject;
...
//get token and AK/SK
JsonObject authObject = userAuthUtil.getUserAuth(
                csConfig.get("DomainName", null),
                csConfig.get("UserName", null),
                csConfig.get("Password", null),
                csConfig.get("ProjectId", null));
String xAuthToken = authObject.get("token").getAsString();
String ak = authObject.get("ak").getAsString();
String sk = authObject.get("sk").getAsString();

//create API client
ApiClient apiClient = new ApiClient();

//disable SSL verify
apiClient.setVerifyingSsl(false);

//set token or AK/SK authentication method
apiClient.setToken(xAuthToken);
//apiClient.setAksk(region, ak, sk);
...
```

##  Licence

[Apache License 2.0](https://www.apache.org/licenses/LICENSE-2.0.html)
