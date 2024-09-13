FROM  oraclelinux:9-slim

COPY /target/graalVM  /graalVM

ENTRYPOINT ["/graalVM"]