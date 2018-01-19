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

Before invoking CS SDK, you need to use `\src\main\java\com\huaweicloud\cs\utils` to get user token or ak/sk authorization.For example:

- get token authorization
```java
...
import com.huaweicloud.cs.utils.UserTokenUtil;
...
xAuthToken = userTokenUtil.getUserToken(
                domainName, // IAM login domain
                userName,   // IAM login user
                password,   //IAM login password
                projectId   //user's projectId 
                );
...
```

- get ak/sk authorization
```java
todo
```

##  Licence

[Apache License 2.0](https://www.apache.org/licenses/LICENSE-2.0.html)
