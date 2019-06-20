# aikq-first-jmh 微基准测试demo

## mvn 命令创建项目
命令：`mvn archetype:generate`
```shell
mvn archetype:generate \
  -DinteractiveMode=false \
  -DarchetypeGroupId=org.openjdk.jmh \
  -DarchetypeArtifactId=jmh-java-benchmark-archetype \
  -DgroupId=com.space.aikq.performance \
  -DartifactId=aikq-first-jmh \
  -Dversion=1.0
```

Detail:
- archetypeGroupId：org.openjdk.jmh
- archetypeArtifactId：jmh-java-benchmark-archetype
- groupId：项目包名
- artifactId: 项目名
- version：版本

