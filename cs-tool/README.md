# CS Producer Tool

## build

Run `sbt rpm:package`    
Get the RPM file in the target: `target/rpm/RPMS/x86_64/cs-tool-0.1-1.x86_64.rpm`

## Usage

For example:    
`cs-tool cs_hc_2018_demo_1 /opt/dis.properties  /opt/samples.txt`

Command `cs-tool` have three parameter:

1. DIS topic name
2. DIS configuration file
3. Data sample for sending to DIS

## dis.properties

```
endpoint=https://dis.cn-north-1.myhuaweicloud.com:20004
region=cn-north-1
ak=KIQMTPVHXXXXXXXXXXXX
sk=axs15gvvbgxxxxxxxxxx0alxxqjgexxxxxxxxxxx
projectId=aaba49ba899a436388216exxxxxxxxxx
```
